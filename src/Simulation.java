package src;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Simulation {
    public static void main(String[] args) {
        String[] planetNames = new String[]{"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
        double[] planetRadii = {2439.7, 6051.8, 6371.0, 3389.5, 69911.0, 58232.0, 25362.0, 24622.0};
        double[] planetMasses = {0.33, 4.87, 5.97, 0.64, 1898, 568, 86.8, 102};
        double[] planetDistances = {57.9, 108.2, 149.6, 227.9, 778.6, 1433.5, 2872.5, 4495.1};
        double[] planetVelocitiesX = {47.87, 35.02, 29.78, 24.07, 13.07, 9.69, 6.81, 5.43};
        double[] planetVelocitiesY = {58.98, 35.26, 29.29, 21.97, 13.06, 9.64, 6.81, 5.47};


        /*
        full disclosure I didn't fully dissect the math here, but I wanted to have accurate X,Y coords based on the
        given distances from the sun and their velocities, and I think this will work.
        */
        List<Double> xCoordinates = new ArrayList<>();
        List<Double> yCoordinates = new ArrayList<>();

        for (int i = 0; i < planetNames.length; i++) {
            double distance = planetDistances[i];
            double angle = Math.atan2(planetVelocitiesY[i], planetVelocitiesX[i]);
            double x = distance * Math.cos(angle);
            double y = distance * Math.sin(angle);
            xCoordinates.add(x);
            yCoordinates.add(y);
        }


        List<Planet> planets = new ArrayList<>();
        for (int i = 0; i < planetNames.length; i++) {
            planets.add(new Planet(planetNames[i], planetRadii[i], planetMasses[i], planetDistances[i], xCoordinates.get(i), yCoordinates.get(i), planetVelocitiesX[i], planetVelocitiesY[i]));
        }

        Star star = new Star("Sun", 696340.0, 333000, 5500);


        SolarSystem solarSystem = new SolarSystem(planets, star);

        solarSystem.showPlanets();
        solarSystem.printPlanetsStats();
        solarSystem.movePlanets();
        solarSystem.printPlanetsStats();
    }
}
