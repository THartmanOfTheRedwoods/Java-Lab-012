import java.util.*;
import java.lang.*;
import java.io.*;

public class SolarSystem {
    private Planet[] planets;
    private Sun theSun;
    public SolarSystem(Sun theSun, Planet[] planets){
        this.theSun = theSun;
        this.planets = planets;
    }
    public void addPlanet(Planet newPlanet){
    List<Planet> planetList = new ArrayList<Planet>(Arrays.asList(planets));
    planetList.add(newPlanet);
    planets = planetList.toArray(planets);
    }
    public void addSun(Sun newSun){
        theSun = newSun;
    }
    public void showPlanets(){
        for(Planet p: planets){
            System.out.println(p.toString());
        }
    }
    public void movePlanets() {
        double G = 0.1;
        double dt = 0.001;

        for(Planet p : this.planets) {
            p.moveTo(p.getXPos() + dt * p.getXVel(),
                    p.getYPos() + dt * p.getYVel());

            double rx = this.theSun.getXVel() - p.getXPos();
            double ry = this.theSun.getYVel() - p.getYPos();
            double r = Math.sqrt(Math.pow(rx, 2) + Math.pow(ry, 2));

            double accX = G * this.theSun.getMass() * rx / Math.pow(r, 3);
            double accY = G * this.theSun.getMass() * ry / Math.pow(r, 3);

            p.setXVel(p.getXVel() + dt * accX);
            p.setYVel(p.getYVel() + dt * accY);
        }
    }

}
