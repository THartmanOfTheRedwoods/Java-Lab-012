/**
 *
 * @author Trevor Hartman
 * @author Jeff Grimm
 *
 * @since Version 1.0
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

    public double getXPos() {

        return x;

    }

    public double getYPos() {

        return y;

    }

    public double getMass() {

        return mass;

    }

    public String toString() {

        return String.format("Sun Name: %s, Sun Mass: %f, Sun Position: (%f, %f)", name, mass, x, y);

    }
}
