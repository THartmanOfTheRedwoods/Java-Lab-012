public class Planet {
    private final String name;
    private final double radius;
    private final double mass;
    private double xPos;
    private double yPos;
    private double xVel;
    private double yVel;

    public Planet(String name, double radius, double mass, double xPos, double yPos, double xVel, double yVel) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
        this.xPos = xPos;
        this.yPos = yPos;
        this.xVel = xVel;
        this.yVel = yVel;
    }

    public String getName() {
        return name;
    }

    public double getRadius() {
        return radius;
    }

    public double getMass() {
        return mass;
    }

    public double getXPos() {
        return xPos;
    }

    public double getYPos() {
        return yPos;
    }

    public double getXVel() {
        return xVel;
    }

    public double getYVel() {
        return yVel;
    }

    public void moveTo(double newXPos, double newYPos) {
        this.xPos = newXPos;
        this.yPos = newYPos;
    }

    public void setXVel(double xVel) {
        this.xVel = xVel;
    }

    public void setYVel(double yVel) {
        this.yVel = yVel;
    }
}