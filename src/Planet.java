/**
 * @author crazyne55
 */
public class Planet {
    String name;
    double radius;
    double mass;
    double distance;
    double x;
    double y;
    double velX;
    double velY;
    public Planet(String name, double radius, double mass, double distance, double x, double y, double velX, double velY) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
        this.distance = distance;
        this.x = x;
        this.y = y;
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
        x = newX;
        y = newY;
    }
    public double getXVel() {
        return velX;
    }
    public double getYVel() {
        return velY;
    }
    public void setXVel(double newVelX) {
        velX = newVelX;
    }
    public void setYVel(double newVelY) {
        velY = newVelY;
    }
    public String toString() {
        return String.format("[%s] mass: %s; radius: %s; pos: (%s,%s); vel: (%s,%s)", name, mass, radius, x, y, velX, velY);
    }
}
