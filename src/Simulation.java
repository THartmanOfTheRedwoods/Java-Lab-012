public class Simulation {
    public static void main(String[] args) {
        SolarSystem ss = new SolarSystem();
        Sun sun = new Sun("The Sun", 10.0, 100.0, 200);
        Planet Jupiter = new Planet("Jupiter", 0.2, 0.002, 5000.0, 3.0, 3.0);
        ss.addSun(sun);
        ss.addPlant(Jupiter);

        for(int t=1; t<10; t++){
            ss.showSun();
            ss.showPlanets();
            ss.movePlanets();

        }
    }
}
