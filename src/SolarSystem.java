/**
 *
 * @author Trevor Hartman
 * @author Jeff Grimm
 *
 * @since Version 1.0
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SolarSystem {

    private List<Planet> planets; // List that stores planets

    private Sun theSun; // Stores the sun

    public SolarSystem() {

        planets = new ArrayList<>(); // Calls Class: ArrayList for use as a data structure for List Planets
        // List Planets has no structure by itself

    }

    public void addPlanet() { // Method for adding planet objects to the list planets

        // takes user input for creation of planet objects
        Scanner in = new Scanner(System.in);

        System.out.println("Enter planet name: ");

        String name = in.next();

        System.out.println("Enter planet radius: ");

        double radius = in.nextDouble();

        System.out.println("Enter planet mass: ");

        double mass = in.nextDouble();

        System.out.println("Enter planet distance: ");

        double distance = in.nextDouble();

        System.out.println("Enter planet velocity X: ");

        double velX = in.nextDouble();

        System.out.println("Enter planet velocity Y: ");

        double velY = in.nextDouble();

        Planet p = new Planet(name, radius, mass, distance, velX, velY); // Creates the planet with the above input

        planets.add(p); // Adds planet to planets list

    }

    public void addSun() { // Creates a Sun with user input

        Scanner in = new Scanner(System.in);

        System.out.println("Enter Sun's name: ");

        String name = in.next();

        System.out.println("Enter Sun's radius: ");

        double radius = in.nextDouble();

        System.out.println("Enter Sun's mass: ");

        double mass = in.nextDouble();

        System.out.println("Enter Sun's temperature: ");

        double temp = in.nextDouble();

        Sun sun = new Sun(name, radius, mass, temp); // Creates the sun with the above input

        theSun = sun;
    }

    public void showPlanets() { // Display planets in list planets

        for (Planet p : planets) {

            System.out.println(p.toString());

        }

    }

    public void showSun() { // Shows info on the sun

        System.out.println(theSun.toString());

    }

    public void movePlanets() {


        double G = 0.1;
        double dt = 0.001;

        for(Planet p : this.planets) {
            p.moveTo(p.getXPos() + dt * p.getXVel(),
                    p.getYPos() + dt * p.getYVel());

            double rx = this.theSun.getXPos() - p.getXPos();
            double ry = this.theSun.getYPos() - p.getYPos();
            double r = Math.sqrt(Math.pow(rx, 2) + Math.pow(ry, 2));

            double accX = G * this.theSun.getMass() * rx / Math.pow(r, 3);
            double accY = G * this.theSun.getMass() * ry / Math.pow(r, 3);

            p.setXVel(p.getXVel() + dt * accX);
            p.setYVel(p.getYVel() + dt * accY);

        }

    }

}
