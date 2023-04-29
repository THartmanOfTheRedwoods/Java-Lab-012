public class Simulation {
    public static void main(String[] args){
        Sun theSun = new Sun("sol", 1, 1, 1);
        Planet thePlanet = new Planet("Farth", 1,1,1,1,1,1,1);
        Planet thatPlanet = new Planet("Furth", 1,1,1,2,2,1,1);
        Planet[] thePlanets = new Planet[]{thePlanet};
        SolarSystem starSystem = new SolarSystem(theSun, thePlanets);
        starSystem.showPlanets();
        starSystem.addPlanet(thatPlanet);
        starSystem.movePlanets();
        starSystem.showPlanets();


    }
}
