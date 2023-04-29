import java.util.ArrayList;

public class SolarSystem {
    private Sun sun;
    private ArrayList<Planet> planets;

    public SolarSystem(Sun sun) {
        this.sun = sun;
        planets = new ArrayList<>();
    }

    public void addPlanet(Planet planet) {
        planets.add(planet);
    }

    public void movePlanets() {
    }

    public void showPlanets() {
        for (Planet p : planets) {
            System.out.printf("%s - Position: (%.2f, %.2f) - Velocity: (%.2f, %.2f)\n",
                    p.getName(), p.getXPos(), p.getYPos(), p.getXVel(), p.getYVel());
        }
    }
}
