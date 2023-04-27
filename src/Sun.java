/**
 * @author MK Ripley
 * @since Version 1.0
 * 4/27/2023
 */

public class Sun {
    private String name;
    private double radius;
    private double mass;
    private double temp;

    public Sun(String name, double radius, double mass, double temp){
    this.name = name;
    this.radius = radius;
    this.mass = mass;
    this.temp = temp;
    }
    public double getMass(){
        return this.mass;
    }
    public String toString(){
        return name + " " + radius + " " + mass + " " + temp;
    }
}
