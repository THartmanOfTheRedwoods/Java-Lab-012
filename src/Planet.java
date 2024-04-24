public class Planet {

    private String name;
    private double radius;
    private double mass;
    private double distance;
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
        this.x = 0.0;
        this.y = distance;
    }

    public double getXpos(){
        return x;
    }

    public double getYpos(){
        return y;
    }

    public void moveTo(double newX, double newY){
        this.x = newX;
        this.y = newY;
    }

    public double getXvel(){
        return this.velX;
    }

    public double getYvel(){
        return this.velY;
    }

    public void setXvel(double newXvel){
        this.velX = newXvel;
    }

    public void setYvel(double newYvel){
        this.velY = newYvel;
    }

    @Override
    public String toString(){
        return String.format("Name: %s, Position: (%f, %f), Velocity: (%f, %f), Mass: %f", name, x, y, velX, velY, mass);
    }
}

