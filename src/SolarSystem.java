import java.util.ArrayList;
import java.util.List;
public class SolarSystem {
    private List<Planets> planets;
    private Sun sun;

    public SolarSystem(){
        planets = new ArrayList<>();
    }
    public void addPlanet(Planets planet){
        planets.add(planet);
    }
    public void addSun(Sun sun){
        this.sun = sun;
    }
    public void showSun() {
        System.out.println(sun.toString());
    }
    public void showPlanets() {
        for(Planets planet : planets) {
            System.out.println(planet.toString());
        }
    }
    public void movePlanets() {
        double G = 0.1;
        double dt = 0.001;

        for(Planets p : this.planets){
            p.moveTo(p.getXPos() + dt * p.getXVel(),
                    p.getYPos() + dt * p.getYVel());

            double rx = this.sun.getXVel() - p.getXPos();
            double ry = this.sun.getYVel() - p.getYPos();
            double r = Math.sqrt(Math.pow(rx, 2) + Math.pow(ry, 2));

            double accX = G * this.sun.getMass() * rx / Math.pow(r, 3);
            double accY = G * this.sun.getMass() * ry / Math.pow(r, 3);

            p.setXVel(p.getXVel() + dt * accX);
            p.setYVel(p.getYVel() + dt * accY);
        }
    }
}
