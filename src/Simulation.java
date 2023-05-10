/**
 * @author crazyne55
 */
public class Simulation {
    public static void main(String[] args) {
        SolarSystem ss = new SolarSystem();
        ss.addSun(new Sun("Sun", 1000000, 1600000, 134500000)); //random values

        ss.addPlanet(new Planet("not earth", 100600000, 199999999, 12333333, 111, 222, 10, 155));

        ss.movePlanets();
        ss.showPlanets();
        ss.movePlanets();
    }
}
