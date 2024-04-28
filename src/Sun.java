public class Sun {

    private String name;
    private double radius;
    private double mass;
    private double temp;
    private double x;
    private double y;

    public Sun(String name, double radius, double mass, double temp){
        this.name=name;
        this.radius=radius;
        this.mass=mass;
        this.temp=temp;
        this.x=0.0;
        this.y=0.0;
        //Assuming the sun is the origin
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
@Override
    public String toString(){
        return String.format("%s has a radius of %.2f miles , a mass of %.2f kg, and a temperature of %.2f kelvin.", name, radius, mass, temp);
    }
}
