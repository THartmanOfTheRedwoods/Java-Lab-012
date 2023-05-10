/**
 * Planet class for the solar system simulation.
 *
 * @author Ricky G
 * @version 1.0
 * @date 2023-04-28
 * @course CIS12
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

    /**
     * Constructor for the Planet class.
     */
    public Planet(String name, double radius, double mass, double distance, double velX, double velY) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
        this.distance = distance;
        this.velX = velX;
        this.velY = velY;
        this.y = 0.0;
        this.x = distance;
    }

    /**
     * Gets the x position of the planet.
     */
    public double getXPos(){
        return x;
    }

    /**
     * Gets the y position of the planet.
     */
    public double getYPos(){
        return y;
    }

    /**
     * Moves the planet to the specified x and y coordinates.
     */
    public void moveTo(double newX, double newY) {
        this.x = newX;
        this.y = newY;
    }

    /**
     * Gets the x velocity of the planet.
     */
    public double getXVel(){
        return this.velX;
    }

    /**
     * Gets the y velocity of the planet.
     */
    public double getYVel(){
        return this.velY;
    }

    /**
     * Sets the x velocity of the planet.
     */
    public void setXVel(double newVelX){
        this.velX = newVelX;
    }

    /**
     * Sets the y velocity of the planet.
     */
    public void setYVel(double newVelY){
        this.velY = newVelY;
    }

    /**
     * Returns the string representation of the planet.
     */
    @Override
    public String toString(){
        return String.format("Name: %s, Position: (%f, %f), Velocity: (%f, %f), Mass:%f", name, x, y, velX, velY, mass);
    }
}
