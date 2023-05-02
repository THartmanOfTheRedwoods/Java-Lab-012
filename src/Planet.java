package src;

public class Planet {
    private String name;
    private double radius;
    private double mass;
    private  double distance;
    private double x;
    private double y;
    private double velX;
    private double velY;

    public Planet(String name, double radius, double mass, double distance,double x, double y, double velX, double velY) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
        this.distance = distance;
        this.x = x;
        this.y = y;
        this.velX = velX;
        this.velY = velY;
    }

    public String getName() {
        return this.name;
    }
    public double getXPos() {
        return this.x;
    }
    public double getYPos() {
        return this.y;
    }
    public void moveTo(double newX, double newY) {
        this.x += newX;
        this.y += newY;
    }


    public double getXVel() {
        return this.velX;
    }
    public double getYVel() {
        return this.velY;
    }
    public void setXVel(double newVelX) {
        this.velX += newVelX;
    }
    public void setYVel(double newVelY) {
        this.velY += newVelY;
    }
    public void printStats() {
        System.out.println("Name: " + this.name);
        System.out.println("Radius: " + this.radius);
        System.out.println("Mass: " + this.mass);
        System.out.println("Distance: " + this.distance);
        System.out.println("X Position: " + this.x);
        System.out.println("Y Position: " + this.y);
        System.out.println("X Velocity: " + this.velX);
        System.out.println("Y Velocity: " + this.velY);
        System.out.println("-------");
    }

}
