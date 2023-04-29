public class ToBeAnnounced {
    public static void main(String[] args) {
        Sun sun = new Sun(1.989 * Math.pow(10, 30), 696340, 0.0, 0.0);
        Planet earth = new Planet("Earth", 5.972 * Math.pow(10, 24), 6371, 147000000, 0.0, 0.0, 29.78);


        SolarSystem solarSystem = new SolarSystem(sun);
        solarSystem.addPlanet(earth);


        Simulation simulation = new Simulation(solarSystem);


        for (int i = 0; i < 200; i++) {
            solarSystem.movePlanets();
            System.out.println("Iteration " + (i + 1) + ":");
            solarSystem.showPlanets();
        }
    }
}
