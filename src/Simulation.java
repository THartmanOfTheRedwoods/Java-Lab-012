public class Simulation {
    public static void main(String[] args) {
        SolarSystem solarSystem = new SolarSystem();
        // Add planets and sun to the solar system
        solarSystem.addPlanet(new Planet("Earth", 6371, 5.972e24, 1.496e8, 0, 0));
        solarSystem.addPlanet(new Planet("Mars", 3389.5, 6.39e23, 2.279e8, 0, 0));
        solarSystem.addSun(new Sun("Sun", 696340, 1.989e30, 5778));

        // Show initial planets
        solarSystem.showPlanets();

        // Move planets
        solarSystem.movePlanets();

        // Show updated planets
        solarSystem.showPlanets();
    }
}

