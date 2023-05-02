package src;

import java.math.BigInteger;

public class Star {
    private final String name;
    private final double radius;

    private final double mass; // this is in earth masses
    private final double temp;
    private double x = 0.0;
    private double y = 0.0;

    public Star(String name, double radius, double mass, double temp) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
        this.temp = temp;
    }



    public double getXPos() {
        return this.x;
    }
    public double getYPos() {
        return this.y;
    }

    public void setXPos(double n) {
        this.x += n;
    }
    public void setYvPos(double n) {
        this.y += n;
    }
    public String getName() {
        return this.name;
    }
    public double getMass() {
        return this.mass;
    }
    public double getRadius() {
        return this.radius;
    }
    public double getTemp() {
        return this.temp;
    }
}
