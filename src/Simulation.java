public class Simulation {

    public static void main(String[] args) {
        SolarSystem ss = new SolarSystem();
        Sun elSol = new Sun("El Sol", 10.0, 100.0, 273);
        Planet mercury = new Planet("Mercury", 0.5, 0.51, 50.0, 1.5, 1.5);
        Planet venus = new Planet("Venus", 0.8, 0.85, 90.0, 2.0, 2.0);
        Planet earth = new Planet("Earth", 0.85, 0.95, 145.0, 2.1, 2.1);
        Planet mars = new Planet("Mars", 0.75, 0.70, 190.0, 1.9, 1.9);
        Planet jupiter = new Planet("Jupiter", 3.8, 12.0, 345.0, 2.8, 2.7);
        Planet saturn = new Planet("Saturn", 3.0, 9.8, 450.5, 3.0, 3.2);
        Planet neptune = new Planet("Neptune", 2.1, 5.5, 699.7, 3.5, 3.0);
        Planet uranus = new Planet("Uranus", 1.8, 5.0, 780.5, 2.1, 2.1);
        Planet pluto = new Planet("Pluto", 0.4, 0.44, 955.0, 2.0, 3.0);

        ss.addSun(elSol);
        ss.addPlanet(mercury);
        ss.addPlanet(venus);
        ss.addPlanet(earth);
        ss.addPlanet(mars);
        ss.addPlanet(jupiter);
        ss.addPlanet(saturn);
        ss.addPlanet(neptune);
        ss.addPlanet(uranus);
        ss.addPlanet(pluto);

        for (int t=1; t<10; t++) {
            ss.movePlanets();
            ss.showSun();
            ss.showPlanets();

        }
    }
}
