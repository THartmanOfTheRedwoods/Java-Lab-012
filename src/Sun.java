class Sun {
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
        this.x = 0;
        this.y = 0;
    }

    public double getXVel() {
        return 0;
    }

    public double getYVel() {
        return 0;
    }

    public double getXPos() { return 0; }
    public double getYPos() { return 0; }

    public double getMass() {
        return mass;
    }

    public String toString() {
        return String.format("Name: %s, Position: (%f, %f), Mass: %f, Temp: %f", name, x, y, mass, temp);
    }

}