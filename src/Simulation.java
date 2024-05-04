/**
 * @author Alexei Iachkov
 */
public class Simulation {
    public static void main(String[] args) {
        Sun sun = new Sun("Sun", 695510, 1.989e30, 5778);
        Planet earth = new Planet("Earth", 6371.0, 5.972e24, 1.496e8, 29783.0);

        SolarSystem solarSystem = new SolarSystem();
        solarSystem.addSun(sun);
        solarSystem.addPlanet(earth);

        for (int i = 0; i < 10000; i++) {
            solarSystem.movePlanets();
        }

        solarSystem.showSun();
        solarSystem.showPlanets();
    }
}