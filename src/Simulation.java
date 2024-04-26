public class Simulation {
    public static void main(String[] args) {
        SolarSystem ss = new SolarSystem();
        Sun theSun = new Sun("The Sun", 20.0, 250.0, 300.0);
        Planet mercury = new Planet("Mercury", .5, .02, 50.0, 1.0, 1.0);
        Planet earth = new Planet("Earth", 1.0, 0.7, 100.0, 2.0, 2.0);
        Planet mars = new Planet("Mars", 0.7, 0.5, 150.0, 1.5, 1.5);
        Planet venus= new Planet("Venus", 0.8, 0.6, 75.0, 1.2, 1.2);
        ss.addSun(theSun);
        ss.addPlanet(mercury);
        ss.addPlanet(earth);
        ss.addPlanet(mars);
        ss.addPlanet(venus);

        for(int t=1; t<10; t++) {
            ss.movePlanets();
            ss.showSun();
            ss.showPlanets();
        }

    }
}
