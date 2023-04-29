public class Simulation {
    public static void main(String[] args) {
        SolarSystem solarSystem = new SolarSystem();

        Sun sun = new Sun("The Sun", 100000, 10000, 10000);
        Planet earth = new Planet("Earth", 10, 5, 3, 0, 0.9);
        Planet mars = new Planet("Mars", 10, 3, 3.5, 0.0, 0.7);

        solarSystem.addSun(sun);
        solarSystem.addPlanet(earth);
        solarSystem.addPlanet(mars);

        for (int i = 0; i < 90; i++) {
            solarSystem.movePlanets();
            solarSystem.showPlanets();
            System.out.println();
        }
    }
}