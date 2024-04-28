class Simulation {
    public SolarSystem solarSystem;
    public Simulation(SolarSystem solarSystem) {
        this.solarSystem = solarSystem;
    }
    public void runSimulation() {
        solarSystem.movePlanets();
    }
}
