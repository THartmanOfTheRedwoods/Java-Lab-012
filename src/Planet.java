public class Planet {
    private String name;
    private double radius;
    private double mass;
    private double distance;
    private double temp;
    private double x;
    private double y;
    private double velX;
    private double velY;

    public Planet(String name, double radius, double mass, double distance, double velX, double velY){
    this.name = name;
    this.radius = radius;
    this.mass = mass;
    this.distance = distance;
    this.velX = velX;
    this.velY = velY;
    this.y=0;
    this.x=distance;
    }

    public double getXPos(){return x;}
    public double getYPos(){return y;}
    public void moveTo(double newX, double newY){
        this.x=newX;
        this.y=newY;
    }
    public double getXVel(){return velX;}
    public double getYVel(){return velY;}
    public void setXVel(double newVelX) {
        this.velX = newVelX;
    }
    public void setYVel(double newVelY){
        this.velY = newVelY;
    }
    @Override
    public String toString(){
        return String.format("Planet name: %s%nPlanet Distance: %f%nPlanet X Coordinates: %f%nPlanet Y Coordinates: %f",
                this.name, this.distance, this.x, this.y);
    }
}
