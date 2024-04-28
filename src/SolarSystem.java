import java.util.ArrayList;
import java.util.List;

public class SolarSystem {
    private List<Planet> planets;
    private Sun theSun;

    public SolarSystem() {
        this.planets = new ArrayList<>();
    }

    public void addPlanet(Planet planet) {
        this.planets.add(planet);
    }

    public void addSun(Sun sun) {
        this.theSun = sun;
    }

    public void movePlanets() {
        double G = 6.67430e-11; // Gravitational constant
        double dt = 0.01; // Time step

        for (Planet p : this.planets) {
            p.moveTo(p.getXPos() + dt * p.getXVel(),
                    p.getYPos() + dt * p.getYVel());

            double rx = this.theSun.getXPos() - p.getXPos();
            double ry = this.theSun.getYPos() - p.getYPos();
            double r = Math.sqrt(rx * rx + ry * ry);

            double accX = G * this.theSun.getMass() * rx / (r * r * r);
            double accY = G;
        }}

    public List<Planet> getPlanets() {
        return this.planets;
    }
}
