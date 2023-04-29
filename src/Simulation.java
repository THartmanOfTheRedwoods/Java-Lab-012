/**
 *
 * @author Trevor Hartman
 * @author Jeff Grimm
 *
 * @since Version 1.0
 */
import java.util.Scanner;

public class Simulation {

    public static void main(String[] args) throws InterruptedException {

        SolarSystem sS = new SolarSystem();

        sS.addSun();

        while (true) {

            sS.addPlanet();

            Scanner in = new Scanner(System.in);

            System.out.println("Are you done entering planets(Y/N)?");

            String exit = in.next();

            if (exit.equalsIgnoreCase("y")) {

                break;

            } if (exit.equalsIgnoreCase("n")) {

                continue;
            } else {

                continue;

            }

        }

        sS.showSun();

        // Loop to simulate solar system rotation
        for (int i = 0; i < 25; i++) {

            Thread.sleep(500);

            sS.movePlanets();

            sS.showPlanets();

        }

        System.out.println("End Orbit");


    }

}
