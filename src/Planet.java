public class Planet {
    private String name;
    private double mass;
    private double size;
    private double xPos;
    private double yPos;
    private double xVel;
    private double yVel;

    public Planet(String name, double mass, double size, double xPos, double yPos, double xVel, double yVel) {
        this.name = name;
        this.mass = mass;
        this.size = size;
        this.xPos = xPos;
        this.yPos = yPos;
        this.xVel = xVel;
        this.yVel = yVel;
    }

    public String getName() {
        return name;
    }

    public double getMass() {
        return mass;
    }

    public double getSize() {
        return size;
    }

    public double getXPos() {
        return xPos;
    }

    public void setXPos(double xPos) {
        this.xPos = xPos;
    }

    public double getYPos() {
        return yPos;
    }

    public void setYPos(double yPos) {
        this.yPos = yPos;
    }

    public double getXVel() {
        return xVel;
    }

    public void setXVel(double xVel) {
        this.xVel = xVel;
    }

    public double getYVel() {
        return yVel;
    }

    public void setYVel(double yVel) {
        this.yVel = yVel;
    }
}
