import java.util.ArrayList;
import java.util.List;

public class SolarSystem {

    private List<Planet> planets;
    private Sun elSol;

    public SolarSystem() {
        planets = new ArrayList<>();
    }

    public void addPlanet(Planet p) {
        planets.add(p);
    }

    public void addSun(Sun s) {
        this.elSol = s;
    }

    public void showSun() {
        System.out.println(elSol.toString());
    }

    public void showPlanets() {
        for (Planet p : planets) {
            System.out.println(p.toString());
        }
    }

    public void movePlanets() {
        double G = 0.1;
        double dt = 0.001;

        for(Planet p : this.planets) {
            p.moveTo(p.getXPos() + dt * p.getXVel(),
                    p.getYPos() + dt * p.getYVel());

            double rx = this.elSol.getXPos() - p.getXPos();
            double ry = this.elSol.getYPos() - p.getYPos();
            double r = Math.sqrt(Math.pow(rx, 2) + Math.pow(ry, 2));

            double accX = G * this.elSol.getMass() * rx / Math.pow(r, 3);
            double accY = G * this.elSol.getMass() * ry / Math.pow(r, 3);

            p.setXVel(p.getXVel() + dt * accX);
            p.setYVel(p.getYVel() + dt * accY);
        }
    }


}
