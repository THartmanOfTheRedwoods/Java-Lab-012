public class Planet {

    private String name;
    private double radius;
    private double mass;
    private double distance;
    private double x;
    private double y;
    private double velX;
    private double velY;

    public Planet(String name, double radius, double mass, double distance, double velX, double velY) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
        this.distance = distance;
        this.velX = velX;
        this.velY = velY;
        this.x=distance;
        this.y=0.0;
    }

    public double getXPos(){
        return x;
    }

    public double getYPos(){
        return y;
    }

    public void moveTo(double newX, double newY){
        this.x=newX;
        this.y=newY;
    }

    public double getXVel(){
        return velX;
    }

    public double getYVel(){
        return velY;
    }

    public void setXVel(double newVelX){
        this.velX=newVelX;
    }

    public void setYVel(double newYVel){
        this.velY=newYVel;
    }
@Override
    public String toString(){
        return String.format("%s has a radius of %.2f miles, a mass of %.2f kg, is at position (%.2f,%.2f) and has a velocity of (%.2f,%.2f), and is %.2f miles away from the sun.", name, radius,mass ,x,y, velX, velY, distance );
    }

}
