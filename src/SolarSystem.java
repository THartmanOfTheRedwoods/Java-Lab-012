/**
 * @author Alexei Iachkov
 */

import java.util.ArrayList;
import java.util.List;

public class SolarSystem {
    private List<Planet> planets;
    private Sun theSun;

    public SolarSystem() {
        planets = new ArrayList<>();
    }

    public void addSun(Sun sun) {
        this.theSun = sun;
    }

    public void addPlanet(Planet planet) {
        planets.add(planet);
    }

    public void movePlanets() {
        double gravitationalConstant = 6.67430e-11;

        for (Planet planet : planets) {
            double rx = theSun.getX() - planet.getX();
            double ry = theSun.getY() - planet.getY();
            double r = Math.sqrt(rx * rx + ry * ry);

            double accX = (gravitationalConstant * theSun.getMass() * rx) / Math.pow(r, 3);
            double accY = (gravitationalConstant * theSun.getMass() * ry) / Math.pow(r, 3);

            planet.setVelocityX(planet.getVelocityX() + accX);
            planet.setVelocityY(planet.getVelocityY() + accY);

            planet.move(planet.getX() + planet.getVelocityX(), planet.getY() + planet.getVelocityY());
        }
    }

    public void showSun() {
        System.out.println(theSun.toString());
    }

    public void showPlanets() {
        for (Planet planet : planets) {
            System.out.println(planet.toString());
        }
    }
}