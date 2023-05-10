import java.util.ArrayList;
import java.util.List;

/**
 * SolarSystem class for the solar system simulation.
 *
 * @author Ricky G
 * @version 1.0
 * @date 2023-04-28
 * @course CIS12
 */
public class SolarSystem {

    private List<Planet> planets;
    private Sun theSun;

    /**
     * Constructor for the SolarSystem class.
     */
    public SolarSystem() {
        planets = new ArrayList<>();
    }

    /**
     * Adds a Planet to the SolarSystem.
     */
    public void addPlanet(Planet p) {
        planets.add(p);
    }

    /**
     * Adds a Sun to the SolarSystem.
     */
    public void addSun(Sun s) {
        this.theSun = s;
    }

    /**
     * Displays information about the Sun.
     */
    public void showSun() {
        System.out.println(theSun.toString());
    }

    /**
     * Displays information about the planets in the SolarSystem.
     */
    public void showPlanets() {
        for (Planet p : planets) {
            System.out.println(p.toString());
        }
    }

    /**
     * Moves the planets in the SolarSystem.
     */
    public void movePlanets() {
        double G = 0.1;
        double dt = 0.001;

        for (Planet p : this.planets) {
            p.moveTo(p.getXPos() + dt * p.getXVel(),
                    p.getYPos() + dt * p.getYVel());

            double rx = this.theSun.getXPos() - p.getXPos();
            double ry = this.theSun.getYPos() - p.getYPos();
            double r = Math.sqrt(Math.pow(rx, 2) + Math.pow(ry, 2));

            double accX = G * this.theSun.getMass() * rx / Math.pow(r, 3);
            double accY = G * this.theSun.getMass() * ry / Math.pow(r, 3);

            p.setXVel(p.getXVel() + dt * accX);
            p.setYVel(p.getYVel() + dt * accY);
        }
    }
}
