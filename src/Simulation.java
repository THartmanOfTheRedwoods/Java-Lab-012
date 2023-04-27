/**
 * @author MK Ripley
 * @since Version 1.0
 * 4/27/2023
 */

public class Simulation {

    public static void main(String[] args) {

        Sun theSun = new Sun("sun", 5, 100, 12);
        Planet mercury = new Planet("mercury", 3, 5, 2, 2, 2);
        Planet venus = new Planet("venus", 4, 5, 4, 2, 2);
        Planet earth = new Planet("earth", 5, 4, 6, 2, 2);
        Planet mars = new Planet("mars", 2, 7, 8, 2, 2);
        Planet jupiter = new Planet("jupiter", 15, 10, 10, 2, 2);
        Planet saturn = new Planet("saturn", 10, 4, 12, 2, 2);
        Planet uranus = new Planet("uranus", 9, 5, 18, 2, 2);
        Planet neptune = new Planet("neptune", 8, 5, 22, 2, 2);
        Planet pluto = new Planet("pluto", 1, 5, 30, 2, 2);
        SolarSystem mySolarSystem = new SolarSystem();
        mySolarSystem.addPlanet(mercury);
        mySolarSystem.addPlanet(venus);
        mySolarSystem.addPlanet(earth);
        mySolarSystem.addPlanet(mars);
        mySolarSystem.addPlanet(jupiter);
        mySolarSystem.addPlanet(saturn);
        mySolarSystem.addPlanet(uranus);
        mySolarSystem.addPlanet(neptune);
        mySolarSystem.addPlanet(pluto);
        mySolarSystem.addSun(theSun);

        for (int t=1; t<5; t++){
            mySolarSystem.movePlanets();
            mySolarSystem.showPlanets();
        }

    }
}
