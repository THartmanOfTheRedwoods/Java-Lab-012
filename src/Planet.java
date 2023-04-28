public class Planet {
    private final String name;
    private final double radius;
    private final double mass;
    private final double distance;
    private double x;
    private double y;
    private double velX;
    private double velY;
    public  Planet(String name, double radius, double mass, double distance, double velX, double velY ) {
        this.name = name;
        this.radius = radius; //in miles
        this.mass = mass; //in kilograms
        this.distance = distance; //in meters
        this.velX = velX; //in meters/sec
        this.velY = velY;//in meters/sec
    }
    public double getXPos() {
        return this.x;
    }
    public double getYPos() {
        return this.y;
    }
    public void moveTo(double newX, double newY) {
        this.x = newX;
        this.y = newY;
    }

    public double getXVel() {
        return this.velX;
    }
    public double getYVel() {
        return this.velY;
    }
    public void setXVel(double newVelX) {
        this.velX = newVelX;
    }
    public void setYVel(double newVelY) {
        this.velY = newVelY;
    }
    public String toString() {
        return this.name + "\n X Location: " + this.x + "\n Y Location: " + this.y + "\n X Velocity: " + this.velX + "\n Y Velocity: " + this.velY;
    }
}
