import java.util.Arrays;

public class SolarSystem {
    private Planet[] planets = new Planet[0];
    Sun theSun;
    public SolarSystem() {

    }
    public void addPlanet(Planet p) {
        planets = Arrays.copyOf(planets, planets.length + 1);
        planets[planets.length-1] = p;
    }
    public void showPlanets() {
        for (int i = 0; i< planets.length; i++) {
            System.out.println("Planet");
            System.out.println(planets[i].toString());
        }
    }
    public void addSun(Sun sun) {
        theSun = sun;
    }
    public void movePlanets() {
        double G = 0.1;
        double dt = 0.001;

        for(Planet p : this.planets) {
            p.moveTo(p.getXPos() + dt * p.getVelX(),
                    p.getYPos() + dt * p.getVelY());

            double rx = this.theSun.getXPos() - p.getXPos();
            double ry = this.theSun.getYPos() - p.getYPos();
            double r = Math.sqrt(Math.pow(rx, 2) + Math.pow(ry, 2));

            double accX = G * this.theSun.getMass() * rx / Math.pow(r, 3);
            double accY = G * this.theSun.getMass() * ry / Math.pow(r, 3);

            p.setVelX(p.getVelX() + dt * accX);
            p.setVelY(p.getVelY() + dt * accY);
        }
    }
}
