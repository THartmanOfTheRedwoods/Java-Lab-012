package src;

import java.util.List;
import java.util.Objects;

public class SolarSystem {
    private List<Planet> planets;
    private Star star;

    public SolarSystem(List<Planet> planets, Star star) {
        this.planets = planets;
        this.star = star;
    }
    public void addPlanet(Planet planet) {
        for(Planet p: this.planets) {
            if (Objects.equals(p.getName(), planet.getName())) {
                p = planet;
                System.out.println("An Existing planet was updated");
                return;
            }
        }
        System.out.println("New planet added");
    }

    public void addStar(Star s) {
        this.star = s;
    }

    public void showPlanets() {
        System.out.println("Planets within Solar System:");
        for(Planet p: this.planets) {
            System.out.println(p.getName());
        }
        System.out.println("-------");
    }

    public void movePlanets() {
        double G = 0.1;
        double dt = 0.001;

        for(Planet p : this.planets) {
            p.moveTo(p.getXPos() + dt * p.getXVel(),
                    p.getYPos() + dt * p.getYVel());

            double rx = this.star.getXPos() - p.getXPos();
            double ry = this.star.getYPos() - p.getYPos();
            double r = Math.sqrt(Math.pow(rx, 2) + Math.pow(ry, 2));

            double accX = G * this.star.getMass() * rx / Math.pow(r, 3);
            double accY = G * this.star.getMass() * ry / Math.pow(r, 3);

            p.setXVel(p.getXVel() + dt * accX);
            p.setYVel(p.getYVel() + dt * accY);
        }
    }
    public void printPlanetsStats() {
        for (Planet p: this.planets) {
            p.printStats();
        }
    }
}
