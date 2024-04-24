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
        this.x = 0.0;
        this.y = 0.0;
    }

    public double getXvel(){
        return x;
    }

    public double getYvel(){
        return y;
    }

    public double getMass(){
        return mass;
    }

    @Override
    public String toString(){
        return String.format("Name: %s, Position: (%f, %f), Mass: %f, Temp: %f", name, x, y, mass, temp);
    }
}
