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

    public double getXVel() {
        return 0.0;
    }

    public double getYVel() {
        return 0.0;
    }

    public double getMass() {
        return this.mass;
    }

    public double getXPos() {
        return this.x;
    }

    public double getYPos() {
        return this.y;
    }

    public String toString() {
        return "Sun{name=" + this.name + ", radius=" + this.radius + ", mass=" + this.mass + ", temp=" + this.temp + "}";
    }
}