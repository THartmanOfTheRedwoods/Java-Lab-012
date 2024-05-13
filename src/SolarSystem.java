import java.util.ArrayList;
import java.util.List;

class SolarSystem {
    private final List<Planet> planets;
    private Sun theSun;

    public SolarSystem() {
        this.planets = new ArrayList<>();
    }

    public void addPlanet(Planet planet) {
        planets.add(planet);
    }

    public void addSun(Sun sun) {
        this.theSun = sun;
    }

    public void showPlanets() {
        for (Planet planet : planets) {
            System.out.println(planet.toString());
        }
    }

    public void movePlanets() {
        double G = 0.1;
        double dt = 0.001;

        for (Planet p : this.planets) {
            p.moveTo(p.getXPos() + dt * p.getVeloX(),
                    p.getYPos() + dt * p.getVeloY());

            double rx = this.theSun.getXPos() - p.getXPos();
            double ry = this.theSun.getYPos() - p.getYPos();
            double r = Math.sqrt(Math.pow(rx, 2) + Math.pow(ry, 2));

            double accX = G * this.theSun.getMass() * rx / Math.pow(r, 3);
            double accY = G * this.theSun.getMass() * ry / Math.pow(r, 3);

            p.setXVelo(p.getVeloX() + dt * accX);
            p.setYVelo(p.getVeloY() + dt * accY);
        }
    }
}
