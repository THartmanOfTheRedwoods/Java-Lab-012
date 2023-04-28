/**
 * @author Trevor Hartman
 * @author Rachelle Iloff
 * created 4/28/2023
 * @since version 1.0
 */
public class Simulation {
    public static void main(String[] args){
        SolarSystem ss = new SolarSystem();
        Sun theSun = new Sun("The Sun", 10.0, 100.0, 575);
        Planet mercury = new Planet("Mercury", 0.75, 0.75, 75.0, 2.0, 1.0);

        ss.addSun(theSun);
        ss.addPlanet(mercury);


        for(int t=1; t<10; t++){
            ss.movePlanets();
            ss.showPlanets();
            ss.showSun();
        }

    }
}
