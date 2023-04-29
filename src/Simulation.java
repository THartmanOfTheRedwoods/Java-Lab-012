class Simulation {
    public static void main(String[] args) {
        SolarSystem SolarSystem = new SolarSystem();


        Sun theSun = new Sun("Sun", 696340000, 1989000000000000000.0, 10000);
        SolarSystem.addSun(theSun);

        Planets earth = new Planets("Earth", 6371000, 5.972E24, 149598261, 1.0, 1.0);
        earth.moveTo(-149598261, 0);
        SolarSystem.addPlanet(earth);

        Planets mars = new Planets("Mars", 3389500, 6.39E23, 227943824, 1.0, 1.0);
        mars.moveTo(0, -227943824);
        SolarSystem.addPlanet(mars);

        Planets jupiter = new Planets("Jupiter", 69911000, 1.898E27, 778340821, 1.0, 1.0);
        jupiter.moveTo(778340821, 0);
        SolarSystem.addPlanet(jupiter);

        Planets saturn = new Planets("Saturn", 58232000, 5.683E26, 1426666422, 1.0, 1.0);
        saturn.moveTo(0, 1426666422);
        SolarSystem.addPlanet(saturn);


        Planets neptune = new Planets("Neptune", 24622000, 1.024E26, 4498396441L, 1.0, 1.0);
        neptune.moveTo(0, -4498396441L);
        SolarSystem.addPlanet(neptune);


        for(int t = 0; t < 10; t++) {
            SolarSystem.movePlanets();
           SolarSystem.showSun();
           SolarSystem.showPlanets();
        }

    }
}

