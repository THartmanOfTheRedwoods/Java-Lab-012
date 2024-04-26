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
        this.x = 0; // Sun is at the center (0, 0)
        this.y = 0;
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

    @Override
    public String toString() {
        return "Sun{" +
                "name='" + name + '\'' +
                ", radius=" + radius +
                ", mass=" + mass +
                ", temp=" + temp +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
