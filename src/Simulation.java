public class Simulation {
    public static void main(String[] args) {
        Planet Mars = new Planet("Mars", 5,5 , 5,5,5,5,5);
        Planet Venus = new Planet("Venus", 5,5 , 5,5,5,5,5);
        Sun theSun = new Sun("theSun", 20,200,50,0,0);

        SolarSystem s = new SolarSystem();
        s.addSun(theSun);
        s.addPlanet(Mars);
        s.addPlanet(Venus);

        s.showPlanets();
        System.out.println("");
        System.out.println("The planets are moving");
        System.out.println("");
        s.movePlanets();
        s.showPlanets();


    }
}
