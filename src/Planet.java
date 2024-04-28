public class Planet {
    private String name;
    private double mass;
    private double distance;
    private double positionX;
    private double positionY;
    private double velocityX;
    private double velocityY;

    public Planet(String name, double mass, double distance, double positionX, double positionY, double velocityX) {
        this.name = name;
        this.mass = mass;
        this.distance = distance;
        this.positionX = positionX;
        this.positionY = positionY;
        this.velocityX = velocityX;
        this.velocityY = velocityY;
    }

    public Planet(String earth, int mass, double distance, double positionX, int positionY, double velocityX) {
    }

    public void move() {
        positionX += velocityX;
        positionY += velocityY;
    }

    public void setPosition(double x, double y) {
        positionX = x;
        positionY = y;
    }

    public void setVelocity(double x, double y) {
        velocityX = x;
        velocityY = y;
    }

    public double[] getPosition() {
        return new double[]{positionX, positionY};
    }

    public double[] getVelocity() {
        return new double[]{velocityX, velocityY};
    }
}

