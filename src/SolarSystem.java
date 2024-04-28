import java.util.ArrayList;
import java.util.List;

public class SolarSystem {

    private List<Planet> planets;
    private Sun theSun;
    private static final double G = 6.67430e-11; // Gravitational constant in m^3 kg^-1 s^-2

    public SolarSystem() {
        planets = new ArrayList<>();

    }

    public void addPlanet(Planet p) {
        planets.add(p);
    }

    public void addSun(Sun s) {
        this.theSun = s;
    }

    public void showSun() {
        System.out.println(theSun.toString());
    }

    public void showPlanets() {
        for(Planet p : planets) {
            System.out.println(p.toString());
        }
    }

    public void movePlanets() {
        double dt = 0.001;

        for(Planet p : this.planets) {
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
