/**
 *
 * @author Trevor Hartman
 * @author Jeff Grimm
 *
 * @since Version 1.0
 */
public class Planet {

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

        this.velX = velX;

        this.velY = velY;

        this.x = distance;

        this.y = 0.0;

    }


    public double getXPos() {

        return x;

    }

    public double getYPos() {

        return y;

    }

    // Moves planet to the desired position
    public void moveTo(double newX, double newY) {

       this.x = newX;

       this.y = newY;

    }
    public double getXVel() {

        return velX;

    }

    public double getYVel() {

        return velY;

    }

    public void setXVel(double newVelX) {

        this.velX = newVelX;

    }

    public void setYVel(double newVelY) {

        this.velY = newVelY;

    }

    public String toString() {

        return String.format("Planet Name: %s, Planet Radius: %f, Planet Mass: %f, Planet Position is: (%f, %f), Planet Distance: %f, Planet Velocity: (%f, %f)", name, radius, mass, x, y, distance, velX, velY);

    }


}
