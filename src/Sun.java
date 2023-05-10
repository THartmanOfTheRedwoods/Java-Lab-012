/**
 * @author crazyne55
 */
public class Sun {
    String name;
    double radius;
    double mass;
    double temp;
    double x;
    double y;

    public Sun(String name, double radius, double mass, double temp) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
        this.temp = temp;
        this.x = 0.0;
        this.y = 0.0;
    }
    public double getXPos() { // renaming these from getXVel & getYVel to getXPos & getYPos since I am assuming this was a mix-up since SolarSystem.movePlanets() calls getXPos and getYPos
        return x;
    }
    public double getYPos() {
        return y;
    }
    public double getMass() {
        return mass;
    }
    public String toString() {
        return String.format("[%s] mass: %s; radius: %s; temp: %s; pos: (%s,%s)", name, mass, radius, temp, x, y);
    }
}
