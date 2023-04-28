public class Sun {
    private String name;
    private double radius;
    private double mass;
    private double temp;
    private double x = 0;
    private double y = 0;

    public  Sun(String name, double radius, double mass, double temp ) {
        this.name = name;
        this.radius = radius; //in miles
        this.mass = mass; //in kilograms
        this.temp = temp; //in centigrade
    }
    public double getXPos() {
        return this.x;
    }
    public double getYPos() {
        return this.y;
    }

    public double getXVel() {
        return 0.0;
    }
    public double getYVel() {
        return 0.0;
    }
    public double getMass() {
        return this.mass;
    }
    public String toString() {
        return this.name + " " + this.mass + " " + this.temp;
    }

}
