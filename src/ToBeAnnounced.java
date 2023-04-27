public class ToBeAnnounced {


    public class Simulation {
        public static void main(String[] args) {
            SolarSystem solarSystem = new SolarSystem();
            Sun sun = new Sun("The Sun", 696340000.0, 1.9885e30, 5778.0);
            Planet earth = new Planet("Earth", 6371000.0, 5.97e24, 1.496e11, 0.0, 29783.0);
            Planet mars = new Planet("Mars", 3389000.0, 6.39e23, 2.28e11, 0.0, 24130.0);

            solarSystem.addSun(sun);
            solarSystem.addPlanet(earth);
            solarSystem.addPlanet(mars);

            for (int i = 0; i < 10000; i++) {
                solarSystem.movePlanets();
            }
        }
    }

    class SolarSystem {
        private List<Planet> planets;
        private Sun sun;

        public SolarSystem() {
            this.planets = new ArrayList<Planet>();
        }

        public void addPlanet(Planet planet) {
            this.planets.add(planet);
        }

        public void addSun(Sun sun) {
            this.sun = sun;
        }

        public void showPlanets() {
            for (Planet planet : planets) {
                System.out.println(planet);
            }
        }

        public void movePlanets() {
            double G = 6.67e-11; // gravitational constant
            double dt = 3600.0; // time step in seconds

            for (Planet planet : planets) {
                planet.moveTo(planet.getXPos() + dt * planet.getXVel(),
                        planet.getYPos() + dt * planet.getYVel());

                double rx = sun.getXPos() - planet.getXPos();
                double ry = sun.getYPos() - planet.getYPos();
                double r = Math.sqrt(Math.pow(rx, 2) + Math.pow(ry, 2));

                double accX = G * sun.getMass() * rx / Math.pow(r, 3);
                double accY = G * sun.getMass() * ry / Math.pow(r, 3);

                planet.setXVel(planet.getXVel() + dt * accX);
                planet.setYVel(planet.getYVel() + dt * accY);
            }
        }
    }

    class Planet {
        private String name;
        private double radius;
        private double mass;
        private double distance;
        private double x;
        private double y;
        private double velX;
        private double velY;

        public Planet(String name, double radius, double mass, double distance, double velX, double velY) {
            this.name = name;
            this.radius = radius;
            this.mass = mass;
            this.distance = distance;
            this.x = distance;
            this.y = 0.0;
            this.velX = velX;
            this.velY = velY;
        }

        public double getXPos() {
            return this.x;
        }

        public double getYPos() {
            return this.y;
        }

        public void moveTo(double newX, double newY) {
            this.x = newX;
            this.y = newY;
        }

        public double getXVel() {
            return this.velX;
        }

        public double getYVel() {
            return this.velY;




