public class Simulation {
    public static void main(String[] args) {
        // Create a new SolarSystem
        SolarSystem solarSystem = new SolarSystem();

        // Add a Sun to the SolarSystem
        double sunRadius = 695500e3; // Sun radius in meters
        double sunMass = 1.989e30; // Sun mass in kilograms
        double sunTemp = 5505; // Sun temperature in Kelvin
        double sunXPos = 0.0; // Sun x-position in meters
        double sunYPos = 0.0; // Sun y-position in meters
        Sun sun = new Sun("Sun", sunRadius, sunMass, sunTemp, sunXPos, sunYPos);
        solarSystem.addSun(sun);

        // Add some Planets to the SolarSystem
        double planetRadius = 6371e3; // Earth radius in meters
        double planetMass = 5.972e24; // Earth mass in kilograms
        double planetTemp = 288; // Earth temperature in Kelvin
        double planetXPos = 0.0; // Earth x-position in meters
        double planetYPos = 149.6e9; // Earth y-position in meters (1 astronomical unit)
        double planetXVel = 0.0; // Earth x-velocity in meters/second
        double planetYVel = 29.78e3; // Earth y-velocity in meters/second
        Planet planet = new Planet("Earth", planetRadius, planetMass, planetXPos, planetYPos, planetXVel, planetYVel);
        solarSystem.addPlanet(planet);

        // Move the Planets in the SolarSystem
        solarSystem.movePlanets();

        // Print the positions of the Planets in the SolarSystem
        System.out.println("Planet positions after moving:");
        for (Planet p : solarSystem.getPlanets()) {
            System.out.println("Planet " + p.getName() + " is located at (" + p.getXPos() + ", " + p.getYPos() + ")");
        }
    }}
