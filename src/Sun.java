public class Sun {
    private String name;
    private double radius;
    private double mass;
    private double temp;
    private double x;
    private double y;
    public Sun(String name, double radius, double mass, double temp){

    }
    //the UML listed methods getXVel() and getYVel() but it seems that in this simulation the Sun has no velocity
    //So, I am assuming that these methods should get/set the x,y coordinates
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public void setX(double x){
        this.x = x;
    }
    public void setY(double y){
        this.y = y;
    }
    public double getMass(){
        return mass;
    }
    public String toString(){
        return name + ":\nX-Coordinate: " + x + "\t\tY-Coordinate: " + y;

    }
}
