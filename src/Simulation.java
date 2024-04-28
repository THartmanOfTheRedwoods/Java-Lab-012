public class Simulation {
    public static void main(String[] args) {
        SolarSystem ss = new SolarSystem();
        Sun theSun = new Sun("The Sun", 20.0, 150.0, 250);
        Planet earth = new Planet("Earth", 10.0, 0.5, 200.0, 5.0, 3.0);
        ss.addSun(theSun);
        ss.addPlanet(earth);

        for(int t=1; t<10; t++) {
            ss.movePlanets();
            ss.showPlanets();
        }
    }

}
