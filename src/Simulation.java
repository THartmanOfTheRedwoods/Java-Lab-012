public class Simulation {
    public static void main(String[] args) {
        SolarSystem milkyWay= new SolarSystem();

        // miles, kg*10^24, kelvin
        Sun star = new Sun("Sol", 432661.0,2000000, 5772 );
        //miles, kg*10^24, miles*10^6
        Planet earth=new Planet("Earth", 3963, 5.972,930, 0,0 );

        for (int i=0; i<10;i++){
            earth.moveTo(i,i+1);
            System.out.println(star.toString());
            System.out.println(earth.toString());
        }
    }
}
