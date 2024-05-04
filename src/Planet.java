/**
 * @author Alexei Iachkov
 */
public class Planet {
    private final String name;
    private final double mass;
    private final double distanceFromSun;
    private double xPos;
    private double yPos;
    private double xVel;
    private double yVel;

    public Planet(String name, double mass, double distanceFromSun, double xVel, double yVel) {
        this.name = name;
        this.mass = mass;
        this.distanceFromSun = distanceFromSun;
        this.xPos = distanceFromSun;
        this.yPos = 0;
        this.xVel = xVel;
        this.yVel = yVel;
    }

    public void move(double newX, double newY) {
        this.xPos = newX;
        this.yPos = newY;
    }

    public double getX() {
        return xPos;
    }

    public double getY() {
        return yPos;
    }

    public double getMass() {
        return mass;
    }

    public double getDistanceFromSun() {
        return distanceFromSun;
    }

    public double getVelocityX() {
        return xVel;
    }

    public double getVelocityY() {
        return yVel;
    }

    public void setVelocityX(double newVelX) {
        this.xVel = newVelX;
    }

    public void setVelocityY(double newVelY) {
        this.yVel = newVelY;
    }

    @Override
    public String toString() {
        return String.format("Planet - Name: %s, Position: (%f, %f), Mass: %f, Distance from Sun: %f", name, xPos, yPos, mass, distanceFromSun);
    }
}