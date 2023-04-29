public class Planet {
    private String name;
    private double radius;
    private double mass;
    private double distance;
    private double xPos;
    private double yPos;
    private double xVel;
    private double yVel;

    public Planet(String name, double radius, double mass, double distance, double xVel, double yVel) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
        this.distance = distance;
        this.xVel = xVel;
        this.yVel = yVel;
        this.xPos = 0.0;
        this.yPos = distance;
    }

    public String getName() {
        return this.name;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getMass() {
        return this.mass;
    }

    public double getXPos() {
        return this.xPos;
    }

    public double getYPos() {
        return this.yPos;
    }

    public void moveTo(double newX, double newY) {
        this.xPos = newX;
        this.yPos = newY;
    }

    public double getXVel() {
        return this.xVel;
    }

    public void setXVel(double newVelX) {
        this.xVel = newVelX;
    }

    public double getYVel() {
        return this.yVel;
    }

    public void setYVel(double newVelY) {
        this.yVel = newVelY;
    }

    public String toString() {
        return "Planet{name=" + this.name + ", radius=" + this.radius + ", mass=" + this.mass + ", distance=" + this.distance + ", xPos=" + this.xPos + ", yPos=" + this.yPos + ", xVel=" + this.xVel + ", yVel=" + this.yVel + "}";
    }
}