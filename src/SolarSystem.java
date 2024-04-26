import java.util.List;
import java.util.ArrayList;


public class SolarSystem {
    private final List<Planet> planets;
    private Sun theSun;

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
        for (Planet planet : planets) {
            System.out.println(planet);
        }
    }

    public void movePlanets(double dt) {
        double G = 6.67430e-11;

        for (Planet p : planets) {
            double rx = theSun.getXPos() - p.getXPos();
            double ry = theSun.getYPos() - p.getYPos();
            double r = Math.sqrt(rx * rx + ry * ry);

            double accX = G * theSun.getMass() * rx / (r * r * r);
            double accY = G * theSun.getMass() * ry / (r * r * r);

            p.setXVel(p.getXVel() + dt * accX);
            p.setYVel(p.getYVel() + dt * accY);

            p.moveTo(p.getXPos() + dt * p.getXVel(), p.getYPos() + dt * p.getYVel());
        }
    }
}
