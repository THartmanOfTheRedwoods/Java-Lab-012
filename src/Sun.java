class Sun extends CelestialBody {
    public double temperature;

    public Sun(String name, double mass, double temperature) {
        super(name, mass);
        this.temperature = temperature;
    }
    public double getMass() {
        return mass;
    }
}
