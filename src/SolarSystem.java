/**
 * @author MK Ripley
 * @since Version 1.0
 * 4/27/2023
 */

import java.util.ArrayList;
import java.util.List;

public class SolarSystem {
    private List<Planet> planets;
    private Sun theSun;

    public SolarSystem(){
        planets = new ArrayList<>();
    }
    public void addPlanet(Planet P){
        planets.add(P);
    }
    public void addSun(Sun S){
        theSun = S;
    }
    public void showPlanets(){
        for(Planet p : this.planets) {
            System.out.println(p.toString());
        }

        }
    public void movePlanets() {
        double G = 0.1;
        double dt = 0.001;

        for(Planet p : this.planets) {
            p.moveTo(p.getXPos() + dt * p.getXVel(),
                    p.getYPos() + dt * p.getYVel());

            double rx = 0 - p.getXPos();
            double ry = 0 - p.getYPos();
            double r = Math.sqrt(Math.pow(rx, 2) + Math.pow(ry, 2));

            double accX = G * this.theSun.getMass() * rx / Math.pow(r, 3);
            double accY = G * this.theSun.getMass() * ry / Math.pow(r, 3);

            p.setXVel(p.getXVel() + dt * accX);
            p.setYVel(p.getYVel() + dt * accY);
        }
    }
}
