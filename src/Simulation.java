public class Simulation {

    public static void main(String[] args) {
        SolarSystem ss = new SolarSystem();
        Sun theSun = new Sun( "TheSun", 10.0, 100.0, 273);
        Planet murcury = new Planet("Mercury", .5, .01, 50.0, 1.0, 1.0);
        ss.addSun(theSun);
        ss.addPlanet(murcury);

        for(int t=1; t<10; t++){
            ss.movePlanets();
            ss.showSun();
            ss.showPlanets();

        }

    }
}
