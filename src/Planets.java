public class Planets {
    private String name;
    private double radius;
    private double mass;
    private double distance;
    private double x;
    private double y;
    private double velX;
    private double velY;

    public Planets(String name, double radius, double mass, double distance, double velX, double velY) {
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
    @Override
    public String toString() {
        return String.format("Name: %s, Position: (%f, %f), Velocity: (%f, %f), Mass: %f" , name, x, y, velX, velY, mass);
    }
}

