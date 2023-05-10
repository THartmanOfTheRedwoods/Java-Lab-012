/**
 * Sun class for the solar system simulation.
 *
 * @author Ricky G
 * @version 1.0
 * @date 2023-04-28
 * @course CIS12
 */
public class Sun {
    private String name;
    private double radius;
    private double mass;
    private double temp;
    private double x;
    private double y;

    /**
     * Constructor for the Sun class.
     */
    public Sun(String name, double radius, double mass, double temp) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
        this.temp = temp;
        this.x = 0.0;
        this.y = 0.0;
    }

    /**
     * Gets the x position of the Sun.
     */
    public double getXPos(){
        return x;
    }

    /**
     * Gets the y position of the Sun.
     */
    public double getYPos(){
        return y;
    }

    /**
     * Gets the mass of the Sun.
     */
    public double getMass(){
        return mass;
    }

    /**
     * Returns the string representation of the Sun.
     */
    @Override
    public String toString(){
        return String.format("Name: %s, Position: (%f, %f), Mass: %f, Temp: %f", name, x, y, mass, temp);
    }
}
