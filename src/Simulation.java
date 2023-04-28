/**
 * @author Trevor Hartman
 * @author Linh Dinh
 *
 * @since version 1.0
 */
public class Simulation {
    public static void main(String[]args){
        SolarSystem ss = new SolarSystem();
        Sun theSun = new Sun("The Sun", 696000.0, 1989.0 , 273);
        Planet mercury = new Planet("Mercury", 2440.0, 3285.0, 50.0, 1.0, 1.0);
        Planet earth = new Planet("Earth", 6371.0,597219.0, 38.0, 2.0, 3.0);
        ss.addSun(theSun);
        ss.addPlanet(mercury);
        ss.addPlanet(earth);
        for(int t = 1; t<10; t++){
            ss.movePlanets();
            ss.showSun();
            ss.showPlanets();

        }
    }
}
