public class Simulation {

    public static void main(String[] args) {
        // radius in miles, mass in ratio to earth's, distance in AU translated later to miles, temp in Kelvin, velX init at 1 and velY is velocity around the sun in mph
        SolarSystem ss = new SolarSystem();
        Sun theSun = new Sun("The Sun", 432690.0, 333000.0, 5772);

        Planet mercury = new Planet("Mercury", 1516.0,0.0553, 0.387, 107082.29, 0.01);
        Planet venus = new Planet("Venus", 3760.0, 0.815, 0.723, 78373.18, 0.01);
        Planet earth = new Planet("Earth", 3959.0, 1.0, 1.0, 66792.72, 0.01);
        Planet mars = new Planet("Mars", 2106.0, 0.107, 1.52, 54000, 0.01);
        Planet jupiter = new Planet("Jupiter", 43441.0, 317.8, 5.20, 28914.94, 0.01);
        Planet saturn = new Planet("Saturn", 36184.0, 95.2, 9.54, 21685.43, 0.01);
        Planet uranus = new Planet("Uranus", 15759.0, 14.5, 19.22, 15288, 0.01);
        Planet neptune = new Planet("Neptune", 15299.0, 17.1, 30.06, 12134.68, 0.01);

        ss.addSun(theSun);
        ss.addPlanet(mercury);
        ss.addPlanet(venus);
        ss.addPlanet(earth);
        ss.addPlanet(mars);
        ss.addPlanet(jupiter);
        ss.addPlanet(saturn);
        ss.addPlanet(uranus);
        ss.addPlanet(neptune);

        for(int t=1; t<10; t++) {
            ss.movePlanets();
            System.out.println();
            ss.showSun();
            ss.showPlanets();
        }
    }
}
