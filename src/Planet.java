public class Planet {

    private String name;
    private double radius, mass, distance, x, y, velX, velY;

    public Planet(String name, double radius, double mass, double distance, double velX, double velY) {
        this.name = name;
        this.radius = radius;
        this.mass = mass * 5.972e24; // Earth's mass ratio times Earth's mass
        this.distance = distance * 92955807; // AU * Earths distance from the sun = planets distance from the sun in miles
        this.velX = velX;
        this.velY = velY;
        this.y = distance * 92955807; // AU * Earths distance from the sun = planets distance from the sun in miles
        this.x = 0.0; // planet starts at 0 x, directly above the sun.

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
        return String.format("Name: %s, Position: (%,.3f, %,.3f), Velocity: (%,.1f mph, %,.1f mph), Mass: %.3e kg", name, x, y, velX, velY, mass);
    }
}
