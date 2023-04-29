import java.util.ArrayList;
import java.util.List;

public class SolarSystem {
    private Sun theSun;
    private List<Planet> planets;

    public SolarSystem() {
        planets = new ArrayList<>();
    }

    public void addPlanet(Planet planet) {
        planets.add(planet);
    }

    public void addSun(Sun sun) {
        theSun = sun;
    }

    public void showPlanets() {
        System.out.println("Sun position: (" + theSun.getXPos() + ", " + theSun.getYPos() + ")");
        for (Planet planet : planets) {
            System.out.println(planet.getName() + " - Mass: " + planet.getMass() + " - Size: " + planet.getRadius() + " - Position: (" + planet.getXPos() + ", " + planet.getYPos() + ")");
        }
    }

    public void movePlanets() {
        double G = 0.1;
        double dt = 0.001;

        for (Planet planet : planets) {
            planet.moveTo(planet.getXPos() + dt * planet.getXVel(),
                    planet.getYPos() + dt * planet.getYVel());

            double rx = theSun.getXPos() - planet.getXPos();
            double ry = theSun.getYPos() - planet.getYPos();
            double r = Math.sqrt(Math.pow(rx, 2) + Math.pow(ry, 2));

            double accX = G * theSun.getMass() * rx / Math.pow(r, 3);
            double accY = G * theSun.getMass() * ry / Math.pow(r, 3);

            planet.setXVel(planet.getXVel() + dt * accX);
            planet.setYVel(planet.getYVel() + dt * accY);
        }
    }
}