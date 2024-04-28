import java.util.List;

class SolarSystem {
    public Sun sun;
    public List<Planet> planets;

    public SolarSystem(Sun sun, List<Planet> planets) {
        this.sun = sun;
        this.planets = planets;
    }
    public List<Planet> getPlanets() {
        return planets;
    }
    public void movePlanets() {
        double G = 0.1;
        double dt = 0.001;

        for (Planet p : planets) {
            p.moveTo(p.getXPos() + dt * p.getXVel(), p.getYPos() + dt * p.getYVel());
            double rx = sun.getXPos() - p.getXPos();
            double ry = sun.getYPos() - p.getYPos();
            double r = Math.sqrt(Math.pow(rx, 2) + Math.pow(ry, 2));

            double accX = G * sun.getMass() * rx / Math.pow(r, 3);
            double accY = G * sun.getMass() * ry / Math.pow(r, 3);

            p.setXVel(p.getXVel() + dt * accX);
            p.setYVel(p.getYVel() + dt * accY);
        }
    }
}
