import java.util.ArrayList;
import java.util.List;

public class SolarSystem {
    private List<Planet> planet;
    private Sun theSun;

    public SolarSystem() {
planet= new ArrayList<>();
    }

    public void addSun(Sun sun){
        this.theSun=sun;
    }

    public void addPlanets(Planet planeta){
    planet.add(planeta);
    }

    public void showPlanets() {
    for(int i=0; i<10; i++){
        System.out.format(planet.toString());
        }

    }

    public void movePlanets() {
        double G = 0.1;
        double dt = 0.001;

        for(Planet p : this.planet) {
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
