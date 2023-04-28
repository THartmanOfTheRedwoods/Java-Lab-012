public class Sun {
    private String name;
    private double radius;
    private double mass;
    private double temp;
    private double x;
    private double y;

    public Sun(String name, double radius, double mass, double temp, double x, double y) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
        this.temp= temp;
        this.x = x;
        this.y = y;
    }

    public double getXPos() {
        return x;
    }

    public double getYPos() {
        return y;
    }

    public double getMass() {
        return mass;
    }
    public String toString() {
        return(" name: "+name+" radius: "+radius+" mass: "+mass+" temp: "+temp+" x cord: "+x+" y cord "+y);
    }
}
