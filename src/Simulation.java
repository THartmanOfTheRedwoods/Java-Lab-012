/**
 * Simulation class for the solar system simulation.
 *
 * @author Ricky G
 * @version 1.0
 * @date 2023-04-28
 * @course CIS12
 */
public class Simulation {

    /**
     * Main method to run the solar system simulation.
     */
    public static void main(String[] args) {
        SolarSystem ss = new SolarSystem();
        Sun theSun = new Sun("The Sun", 10.0, 100.0, 273);
        Planet mercury = new Planet("Mercury", 0.5, 1, 50.0, 1.0, 1.0);
        ss.addSun(theSun);
        ss.addPlanet(mercury);

        for (int t = 1; t < 10; t++) {
            ss.movePlanets();
            ss.showSun();
            ss.showPlanets();
        }
    }
}
