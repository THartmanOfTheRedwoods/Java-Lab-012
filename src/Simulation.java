public class Simulation {
    public static void main(String[] args) {
        SolarSystem solarSystem = new SolarSystem();
        Sun sun = new Sun("The Sun", 695510, 1.989e30, 5778); // Sun's radius in km, mass in kg, and temperature in Kelvin

        solarSystem.addSun(sun);

        Planet earth = new Planet("Earth", 6371, 5.972e24, 147.3e6, 0, 29.78); // Earth's radius in km, mass in kg, distance in km, and velocity in km/s
        solarSystem.addPlanet(earth);

        // Add more planets as needed...

        solarSystem.showPlanets();

        // Move the planets in the simulation
        solarSystem.movePlanets();
    }
}
