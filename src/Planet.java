class Planet {
    private String name;
    private double radius;
    private double mass;
    private double distance;
    private double x;
    private double y;
    private double veloX;
    private double veloY;

    public Planet(String name, double radius, double mass, double distance, double veloX, double veloY) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
        this.distance = distance;
        this.veloX = veloX;
        this.veloY = veloY;
        this.y = 0.0;
        this.x = distance;
    }

    public double getXPos() {
        return x;
    }

    public double getYPos() {
        return y;
    }

    public void moveTo(double newX, double newY) {
        this.x = newX;
        this.y = newY;
    }

    public double getVeloX() {
        return this.veloX;
    }

    public double getVeloY() {
        return this.veloY;
    }

    public void setXVelo(double newVeloX) {
        this.veloX = newVeloX;
    }

    public void setYVelo(double newVeloY) {
        this.veloY = newVeloY;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Position: (%f, %f), Velocity: (%f, %f), Mass: %f", name, x, y, veloX, veloY, mass);
    }
}
