// Written by: Austin Barnett
// Date: 4/26/2024
// Version 1.0
// Note: I may have taken things a little too far =p

public class Simulation {
    public static void main(String[] args) {

        SolarSystem solarSystem = new SolarSystem();


        Planet earth = new Planet("Earth", 6371, 5.972e24, 147e6, 0, 0, 0, 0);
        Planet mars = new Planet("Mars", 3389, 6.39e23, 227e6, 0, 0, 0, 0);
        Sun sun = new Sun("Sun", 696340, 1.989e30, 5778);

        solarSystem.addPlanet(earth);
        solarSystem.addPlanet(mars);
        solarSystem.addSun(sun);


        int numTimeSteps = 10;
        double dt = 3600;

        for (int i = 0; i < numTimeSteps; i++) {
            solarSystem.movePlanets(dt);
            System.out.println("Time step " + (i + 1));
            solarSystem.showPlanets();
            System.out.println();
        }
    }
}
