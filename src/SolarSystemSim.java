import java.util.ArrayList;
import java.util.List;

public class SolarSystemSim {

    public static void main(String[] args) {
        // Creating a Solar System object
        SolarSystem solarSystem = new SolarSystem();

        // Let there be light!
        Sun sun = new Sun("Sun", 1.989e30, 0.0, 0.0);
        solarSystem.setSun(sun);

        // adding planets to the solar system
        Planet planet1 = new Planet("Earth", 5.972e24, 1.496e11, 0.0, 0.0, 29297.0, 29297.0);
        solarSystem.addPlanet(planet1);

        // Simulating for 1000 days
        double simulationPeriod = 1000;
        solarSystem.movePlanets(simulationPeriod);

        // Printing the location of the planets
        System.out.println("Planets:");
        solarSystem.showPlanets();
    }
}

class SolarSystem {

    private Sun theSun;
    private List<Planet> planets;

// I can expand this list with multiple planets, but for simplicity's sake I won't.
    public SolarSystem() {
        this.planets = new ArrayList<>();
    }

    public void setSun(Sun sun) {
        this.theSun = sun;
    }
// here's HOW to add the other planets
    public void addPlanet(Planet planet) {
        this.planets.add(planet);
    }

    public void movePlanets(double simulationPeriod) {
        for (Planet planet : planets) {
            planet.move(simulationPeriod, theSun);
        }
    }

    public void showPlanets() {
        for (Planet planet : planets) {
            System.out.println(planet);
        }
    }
}

class Sun {

    private String name;
    private double mass;
    private double xPos;
    private double yPos;

    public Sun(String name, double mass, double xPos, double yPos) {
        this.name = name;
        this.mass = mass;
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public double getMass() {
        return mass;
    }
    public double getXPos() {
        return xPos;
    }
    public double getYPos() {
        return yPos;
    }
}

class Planet {

    private String name;
    private double mass;  // Not used in this simulation, but was recommended
    private double distance; // Not used in this simulation, but was recommended
    private double xPos;
    private double yPos;
    private double velX;
    private double velY;

    public Planet(String name, double mass, double distance, double xPos, double yPos, double velX, double velY) {
        this.name = name;
        this.mass = mass;
        this.distance = distance;
        this.xPos = xPos;
        this.yPos = yPos;
        this.velX = velX;
        this.velY = velY;
    }

    public double getXPos() {
        return xPos;
    }

    public double getYPos() {
        return yPos;
    }

    public double getVelX() {
        return velX;
    }

    public double getVelY() {
        return velY;
    }

    @Override
    public String toString() {
        return "Planet: " + name + ", Position: (" + xPos + ", " + yPos + ")";
    }

    public void move(double simulationPeriod, Sun sun) {
        // Shows the change in location based on velocity and simulation time
        this.xPos += simulationPeriod * this.velX;
        this.yPos += simulationPeriod * this.velY;

        // shows the distance to the sun
        double rx = sun.getXPos() - this.xPos;
        double ry = sun.getYPos() - this.yPos;
        double r = Math.sqrt(Math.pow(rx, 2) + Math.pow(ry, 2));

        // setting a gravitational constant
        final double G = 0.1;

        // This is to show how the sun's gravity influences the planets' speeds
        double accX = G * sun.getMass() * rx / Math.pow(r, 3);
        double accY = G * sun.getMass() * ry / Math.pow(r, 3);

        // Update velocity based on acceleration and simulation time
        this.velX += simulationPeriod * accX;
    }
}
