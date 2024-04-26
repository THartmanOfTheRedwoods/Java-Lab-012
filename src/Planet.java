public class Planet {
    private String name;
    private double radius;
    private double mass;
    private double distance;
    private double x;
    private double y;
    private double velX;
    private double velY;

    public Planet(String name, double radius, double mass, double distance,
                  double x, double y, double velX, double velY) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
        this.distance = distance;
        this.x = x;
        this.y = y;
        this.velX = velX;
        this.velY = velY;
    }

    public double getXPos() {
        return x;
    }

    public double getYPos() {
        return y;
    }

    public double getXVel() {
        return velX;
    }

    public void setXVel(double velX) {
        this.velX = velX;
    }

    public double getYVel() {
        return velY;
    }

    public void setYVel(double velY) {
        this.velY = velY;
    }

    public void moveTo(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", radius=" + radius +
                ", mass=" + mass +
                ", distance=" + distance +
                ", x=" + x +
                ", y=" + y +
                ", velX=" + velX +
                ", velY=" + velY +
                '}';
    }
}
