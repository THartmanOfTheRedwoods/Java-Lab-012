public class Sun {
    private String name;
    private double radius;
    private double mass;
    private double temp;
    private double xPos;
    private double yPos;

    public Sun(String name, double radius, double mass, double temp, double xPos, double yPos) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
        this.temp = temp;
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public String getName() {
        return name;
    }

    public double getRadius() {
        return radius;
    }

    public double getMass() {
        return mass;
    }

    public double getXPos() {
        return xPos;
    }

    public double getYPos() {
        return yPos;
    }

    public void moveTo(double newXPos, double newYPos) {
        this.xPos = newXPos;
        this.yPos = newYPos;
    }
}