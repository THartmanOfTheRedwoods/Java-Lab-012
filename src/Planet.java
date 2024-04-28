public class Planet {
    public boolean toString;
    private String name;
    private double radius;
    private double mass;
    private double distance;
    private double x;
    private double y;
    private double velocityx;
    private double velocityy;

    public Planet(String name, double radius, double mass, double distance, double velocityx, double velocityy) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
        this.distance = distance;
        this.velocityx = velocityx;
        this.velocityy = velocityy;
        this.y = 0.0; //if you want the planet to start at the origin
        this.x = distance; //distance from the sun
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
        return this.velocityx;
    }

    public double getYVel() {
        return this.velocityy;
    }

    public void setXVel(double newVelX) {
        this.velocityx = newVelX;
    }

    public void setYVel(double newVelY) {
        this.velocityy = newVelY;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Position: (%f, %f), Velocity:( %f, %f)", name, x, y, velocityx, velocityy);
    }
}
