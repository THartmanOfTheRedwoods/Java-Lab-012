public class Simulation {

    public static void main(String[] args) {
        SolarSystem solarSystem = new SolarSystem();
        Sun theSun = new Sun("Sol", 696000,100, 5772);
        Planet earth = new Planet("Earth", 6356,0.1, 149000000,1.0, 1.0);
        Planet mars = new Planet("Mars", 3390, 0.12, 228000000, 1.2, 1.2);
        solarSystem.addSun(theSun);
        solarSystem.addPlanet(earth);
        solarSystem.addPlanet(mars);

        for (int t = 1; t < 10; t++) {
            solarSystem.movePlanets();
            System.out.println(theSun);
            solarSystem.showPlanets();
        }
    }
}
