/**
 *
 * @author Trevor Hartman
 * @author Geng Cha
 *
 * @since Version 1.0
 *
 */
public class Simulation {

    public static void main(String[] args) {
        SolarSystem ss = new SolarSystem();
        Sun theSun = new Sun ("Earth Oven", 10.0, 100.0, 343 );
        Planet mercury = new Planet("Mercury", 0.5, 0.043, 50.5, 1.0, 1.0 );

        ss.addSun(theSun);
        ss.addPlanet(mercury);

        for (int t = 1; t < 10; t++) {
            ss.movePlanets();
            ss.showSun();
            ss.showPlanets();

        }
    }
}
