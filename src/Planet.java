class Planet extends CelestialBody {
    public double radius;
    public double distance;
    private Vector2D position;
    private Vector2D velocity;

    public Planet(String name, double mass, double radius,Vector2D velocity) {
        super(name, mass);
        this.radius = radius;
        this.position = position;
        this.velocity = velocity;
    }
    public double getXPos() {
        return velocity.x;
    }
    public double getYVel() {
        return velocity.y;
    }
    public void setXVel(double newVelX) {
        this.velocity.x =newVelX;
    }
    public void setYvel(double newVelY) {
        this.velocity.y = newVelY;
    }
}
