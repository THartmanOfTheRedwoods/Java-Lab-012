import java.util.ArrayList;
import java.util.List;

class Planet {
    private String name;
    private double radius;
    private double mass;
    private double distance;
    private double x;
    private double y;
    private double velX;
    private double velY;

    public Planet(String name, double radius, double mass, double distance, double velX, double velY) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
        this.distance = distance;
        this.x = 0.0;
        this.y = distance;
        this.velX = velX;
        this.velY = velY;
    }

    public double getXPos() {
        return x;
    }
    public double getYPos() {
        return y;
    }
    public void moveTo(double newX, double newY) {
        this.x = newX;
        this.y = newY;
    }
    public double getXVel() {
        return velX;
    }

    public double getYVel(){
        return velY;
    }

    public void setXVel(double newVelX){
        this.velX = newVelX;
    }

    public void setYVel(double newVelY){
        this.velY = newVelY;
    }

    @Override
    public String toString() {
        return "Planet { " + "name = '" + name + '\'' + ", radius = " + radius + ", mass = " + mass + ", distance = " + distance + ", x = " + x + ",y = " + y + ", velX = " + velX + ",velY = " + velY + '}';
    }
}

class Sun {
    private String name;
    private double radius;
    private double mass;
    private double temp;
    private double x;
    private double y;

    public Sun(String name, double radius, double mass, double temp){
        this.name = name;
        this.radius = radius;
        this.mass = mass;
        this.temp = temp;
        this.x = 0.0;
        this.y = 0.0;
    }
    public  double getXPos() {
        return x;
    }

    public double getYPos() {
        return y;
    }

    public double getMass(){
        return mass;
    }

    @Override
    public String toString(){
        return "Sun{" + "name=" + name + '\'' + ", radius=" + radius + ", mass=" + mass + ", temp=" + temp + ", x=" + x + ", y=" + y + '}';
    }
}
class SolarSystem {
    private List<Planet> planets;
    private Sun theSun;

    public SolarSystem() {
        planets = new ArrayList<>();
    }

    public void addPlanet(Planet planet) {
        planets.add(planet);
    }

    public void addSun(Sun sun) {
        theSun = sun;
    }

    public void showPlanets() {
        for (Planet p : planets) {
            System.out.println(p);
        }
    }

    public void movePlanets() {
        double G = 0.1;
        double dt = 0.001;

        for (Planet p : planets) {
            p.moveTo(p.getXPos() + dt * p.getXVel(),
                    p.getYPos() + dt * p.getYVel());

            double rx = theSun.getXPos() - p.getXPos();
            double ry = theSun.getYPos() - p.getYPos();
            double r = Math.sqrt(rx * rx + ry * ry);

            double accX = G * theSun.getMass() * rx / Math.pow(r, 3);
            double accY = G * theSun.getMass() * ry / Math.pow(r, 3);

            p.setXVel(p.getXVel() + dt * accX);
            p.setYVel(p.getYVel() + dt * accY);
        }
    }
}
    class Simulation {
        public static void main(String[] args) {
            SolarSystem solarSystem = new SolarSystem();

            Sun sun = new Sun("The Sun", 696340, 1.989e30, 5778);
            solarSystem.addSun(sun);

            Planet earth = new Planet("Earth", 6371, 5.972e24, 1496e6, 0, 29.8);
            solarSystem.addPlanet(earth);

            solarSystem.movePlanets();
            solarSystem.showPlanets();
        }

    }