/**
 * @author Trevor Hartman
 * @author Linh Dinh
 *
 * @since version 1.0
 */
public class Planet {
    private String name;
    private double radius;
    private double mass;
    private double distance;
    private double X;
    private double Y;
    private double velX;
    private double velY;
    public Planet(String name, double radius, double mass, double distance, double velX, double velY){
        this.name = name;
        this.radius = radius;
        this.mass = mass;
        this.distance = distance;
        this.velX = velX;
        this.velY = velY;
        this.Y = 0.0;
        this.X = distance;
    }
    public double getXPos(){
        return X;
    }

    public double getYPos() {
        return Y;
    }
    public void moveTo(double newX, double newY){
        this.X = newX;
        this.Y = newY;

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
    public String toString(){
        return String.format("Name: %s, Position: (%f, %f), Velocity: (%f, %f), Mass: %f", name, X, Y, velX, velY, mass);
    }
}
