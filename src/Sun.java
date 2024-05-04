/**
 * @author Alexei Iachkov
 */
public class Sun {
    private String name;
    private double radius;
    private double mass;
    private double temp;
    private double x;
    private double y;

    public Sun(String name, double radius, double mass, double temp) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
        this.temp = temp;
        this.x = 0.0;
        this.y = 0.0;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getMass() {
        return mass;
    }

    @Override
    public String toString() {
        return String.format("Sun - Name: %s, Position: (%f, %f), Mass: %f, Temperature: %f", name, x, y, mass, temp);
    }
}