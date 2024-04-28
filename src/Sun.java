public class Sun {
    private String name;
    private double mass;
    private double positionX;
    private double positionY;

    public Sun(String name, double mass, double positionX, double positionY) {
        this.name = name;
        this.mass = mass;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public void setPosition(double x, double y) {
        positionX = x;
        positionY = y;
    }

    public double[] getPosition() {
        return new double[]{positionX, positionY};
    }

    public double getMass() {
        return mass;
    }
}
