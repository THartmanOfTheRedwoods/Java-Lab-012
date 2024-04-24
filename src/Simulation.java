import java.util.ArrayList;
import java.util.List;

public class Simulation {
    public static void main(String[] args) {
        SolarSystem solarSystem = new SolarSystem();
        solarSystem.addSun(new Sun("Sun", 696340, 1.989E30, 5778));
        solarSystem.addPlanet(new Planet("Mercury", 2439.7, 3.285E23, 57.9E6, 0, 0));
        solarSystem.addPlanet(new Planet("Venus", 6051.8, 4.867E24, 108.2E6, 0, 0));
        solarSystem.addPlanet(new Planet("Earth", 6371, 5.972E24, 149.6E6, 0, 0));
        solarSystem.addPlanet(new Planet("Mars", 3389.5, 6.39E23, 227.9E6, 0, 0));
        solarSystem.addPlanet(new Planet("Jupiter", 69911, 1.898E27, 778.6E6, 0, 0));
        solarSystem.addPlanet(new Planet("Saturn", 58232, 5.683E26, 1433.5E6, 0, 0));
        solarSystem.addPlanet(new Planet("Uranus", 25362, 8.681E25, 2872.5E6, 0, 0));
        solarSystem.addPlanet(new Planet("Neptune", 24622, 1.024E26, 4495.1E6, 0, 0));

        solarSystem.showPlanets();
        solarSystem.movePlanets(365);
        solarSystem.showPlanets();
    }
}

class SolarSystem {
    private List<Planet> planets;
    private Sun sun;

    public SolarSystem() {
        planets = new ArrayList<>();
    }

    public void addPlanet(Planet planet) {
        planets.add(planet);
    }

    public void addSun(Sun sun) {
        this.sun = sun;
    }

    public void showPlanets() {
        for (Planet planet : planets) {
            System.out.println(planet);
        }
    }

    public void movePlanets(double days) {
        double G = 0.1;
        double dt = 0.001;

        for(Planet p : this.planets) {
            p.moveTo(p.getXPos() + dt * p.getXVel(),
                    p.getYPos() + dt * p.getYVel());

            double rx = sun.getXPos() - p.getXPos();
            double ry = sun.getYPos() - p.getYPos();
            double r = Math.sqrt(Math.pow(rx, 2) + Math.pow(ry, 2));

            double accX = G * sun.getMass() * rx / Math.pow(r, 3);
            double accY = G * sun.getMass() * ry / Math.pow(r, 3);

            p.setXVel(p.getXVel() + dt * accX);
            p.setYVel(p.getYVel() + dt * accY);
        }
    }
        /*for (Planet planet : planets) {
            // Simple circular orbit
            double angle = 2 * Math.PI * (days / 365); // assuming 365 days in a year
            double newX = planet.getDistance() * Math.cos(angle);
            double newY = planet.getDistance() * Math.sin(angle);
            planet.moveTo(newX, newY);
        }
    }

         */
}

class Planet {
    private String name;
    private double radius;
    private double mass;
    private double distance;
    private double x;
    private double y;
    private double velX;
    private double velY;

    public Planet(String name, double radius, double mass, double distance, double velX, double velY) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
        this.distance = distance;
        this.velX = velX;
        this.velY = velY;
    }

    public double getXPos() {
        return x;
    }

    public double getYPos() {
        return y;
    }

    public void moveTo(double newX, double newY) {
        x = newX;
        y = newY;
    }

    public double getXVel() {
        return velX;
    }

    public double getYVel() {
        return velY;
    }

    public void setXVel(double newVelX) {
        velX = newVelX;
    }

    public void setYVel(double newVelY) {
        velY = newVelY;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", radius=" + radius +
                ", mass=" + mass +
                ", distance=" + distance +
                ", x=" + x +
                ", y=" + y +
                ", velX=" + velX +
                ", velY=" + velY +
                '}';
    }

    public double getDistance() {
        return distance;
    }
}

class Sun {
    private String name;
    private double radius;
    private double mass;
    private double temp;
    private double x;
    private double y;

    public Sun(String name, double radius, double mass, double temp) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
        this.temp = temp;
    }

    public double getXPos() {
        return x;
    }

    public double getYPos() {
        return y;
    }

    public double getMass() {
        return mass;
    }

    @Override
    public String toString() {
        return "Sun{" +
                "name='" + name + '\'' +
                ", radius=" + radius +
                ", mass=" + mass +
                ", temp=" + temp +
                '}';
    }
}
