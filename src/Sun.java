public class Sun {
    private String name;
    private double radius;
    private double mass;
    private double temp;
    private double x;
    private double y;

    public Sun(String name, double radius, double mass, double temp){
        this.name = name;
        this.radius = radius;
        this.mass = mass;
        this.temp = temp;
    }
    public double getXVel(){
        return x;
    }
    public double getYVel(){
        return y;
    }
    public double getMass(){
        return mass;
    }
    public String toString(){
        return String.format("Name: %s%nRadius: %f%nMass: %f%nTemp: %f%nX: %f%nY: %f%n", name, radius, mass, temp, x, y);
    }
}