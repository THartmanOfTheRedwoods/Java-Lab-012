class Simulation {
    public static void main(String[] args) {
        SolarSystem ss = new SolarSystem();
        Sun theSun = new Sun("The Sun", 10.0, 100.0, 273);
        Planet earth = new Planet("Earth", 0.5, .01, 50.0, 1.0, 1.0);
    ss.addSun(theSun);
        ss.addPlanet(earth);
        ss.showPlanets();
        ss.movePlanets();
        ss.showPlanets();
    }
}
