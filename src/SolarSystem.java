import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class SolarSystem {
    private Scanner in = new Scanner(System.in);
    private List<Planet> planets;
    private Sun theSun;
    public SolarSystem(){
        this.planets = new ArrayList<>();
        Planet mercury = (new Planet("Mercury", 2436, .33e24, 57.9e6, 47.4, 4.3));
        Planet earth = new Planet("Earth", 6378, 5.97e24, 149.6e6, 29.8, 11.2);
        Planet mars = new Planet("Mars", 3396, .642e24, 228e6, 24.1, 5);
        addPlanet(mercury);
        addPlanet(earth);
        addPlanet(mars);
        addSun();
    }
    //I added a return type of Planet, despite no return type in the UML. I hope that is okay
    public void addPlanet(Planet planet){
        planets.add(planet);
    }
    public void addSun(){
        //radius is in miles, mass kilograms, temp fahrenheit
        this.theSun = new Sun("Sun", 432690, 1.989E30, 1E4);
    }
    public void showPlanets(){
        System.out.println(Arrays.toString(planets.toArray()));
    }
    public void movePlanets(){
        double G = 0.1;
        double dt = 0.001;

        for(Planet p : this.planets) {
            p.moveTo(p.getXPos() + dt * p.getXVel(),
                    p.getYPos() + dt * p.getYVel());

            double rx = this.theSun.getX() - p.getXPos();
            double ry = this.theSun.getY() - p.getYPos();
            double r = Math.sqrt(Math.pow(rx, 2) + Math.pow(ry, 2));

            double accX = G * this.theSun.getMass() * rx / Math.pow(r, 3);
            double accY = G * this.theSun.getMass() * ry / Math.pow(r, 3);

            p.setXVel(p.getXVel() + dt * accX);
            p.setYVel(p.getYVel() + dt * accY);
        }
    }
}
