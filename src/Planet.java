public class Planet {
    private String name;
    private double radius;
    private double mass;
    private double distance;
    private double x;
    private double y;
    private double velX;
    private double velY;
    public Planet(String name, double radius, double mass, double distance, double x, double y, double velX, double velY){
        this.name = name;
        this.radius = radius;
        this.mass = mass;
        this.distance = distance;
        this.x = x;
        this.y = y;
        this.velX = velX;
        this.velY = velY;
    }
    public double getXPos(){
        return this.x;
    }
    public double getYPos(){
        return this.y;
    }
    public void moveTo(double newX, double newY){
        this.x = newX;
        this.y = newY;
    }
    public double getXVel(){
        return this.velX;
    }
    public double getYVel(){
        return this.velY;
    }
    public void setXVel(double newVelX){
        velX = newVelX;
    }
    public void setYVel(double newVelY){
        velY = newVelY;
    }
    public String toString(){
        return String.format("Name: %s%nRadius: %f%nMass: %f%nDistance: %f%nXpos:%f%nYpos: %f%nXVel: %f%nYVel: %f%n",name, radius, mass, distance, x, y, velX, velY);
    }
}
