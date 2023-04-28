/**
 * @author Jason Carr
 * @author Trevor Hartman
 * @since v1.0
 */

class Simulation {
    public static void main(String[] args) {
        SolarSystem solarSystem = new SolarSystem();
        Planet earth = new Planet("Earth", 1000, 1000, 10000, 1000, 1);
        Planet mars = new Planet("Mars", 999,9999, 99999, 9999, 99);
        Sun sun = new Sun("Sun", 100000, 1000000, 100000);

        solarSystem.addPlanet(earth);
        solarSystem.addSun(sun);
        solarSystem.addPlanet(mars);
        solarSystem.addPlanet(new Planet("Pluto", 1000, 3000, 70000, 300, 2));

        for (int i = 0; i < 10; i++) {
            solarSystem.movePlanets();
            solarSystem.showPlanets();
        }
    }
}
