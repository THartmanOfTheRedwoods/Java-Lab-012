public class Sun {

    private String name;
    private double radius, mass, temp, x, y;

    public Sun(String name, double radius, double mass, double temp) {
        this.name = name;
        this.radius = radius;
        this.mass = mass * 5.972e24; // earths mass ratio * earths mass
        this.temp = temp;
        this.x = 0.0;
        this.y = 0.0;
    }

    public double getXPos() {
        return x; // Sun is assumed to be at the center (0, 0)
    }

    public double getYPos() {
        return y; // Sun is assumed to be at the center (0, 0)
    }

    public double getMass() {
        return mass;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Position: (%.0f, %.0f), Mass: %.3e kg, Temp: %,.0f K", name, x, y, mass, temp);
    }
}