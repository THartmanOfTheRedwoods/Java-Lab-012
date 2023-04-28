public class Planet {
    private String name;
    private double radius;
    private double mass;
    private double distance;
    private double x;
    private double y;
    private double velX;
    private double velY;

    public Planet(String name, double radius, double mass, double distance, double x, double y, double velX, double velY) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
        this.distance = distance;
        this.x = x;
        this.y = y;
        this.velX = velX;
        this.velY = velY;

    }
    double getXPos() {
        return x;
    }

    public double getYPos() {
        return y;
    }
    public void moveTo(double newX, double newY) {
        x = newX;
        y = newY;
    }

    public double getVelX() {
        return velX;
    }

    public double getVelY() {
        return velY;
    }

    public void setVelX(double velX) {
        this.velX = velX;
    }

    public void setVelY(double velY) {
        this.velY = velY;
    }
    public String toString() {
        return(" name: "+name+" radius: "+radius+" mass: "+mass+" distance: "+distance+" x cord: "+x+" y cord "+y+ " x velocity: "+velX+" y velocity: "+velY);
    }
}
