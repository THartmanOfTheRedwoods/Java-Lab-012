public class Sun {
    private double mass;
    private double size;
    private double xPos;
    private double yPos;

    public Sun(double mass, double size, double xPos, double yPos) {
        this.mass = mass;
        this.size = size;
        this.xPos = xPos;
        this.yPos = yPos;
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
}
