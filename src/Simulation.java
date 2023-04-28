/**
 * @author Adrienne van S
 * @since  version 1.0
 */

import java.util.Scanner;
public class Simulation {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        SolarSystem ourSystem = new SolarSystem();
        while (true){
            ourSystem.movePlanets();
            ourSystem.showPlanets();
            System.out.println("\nWould you like to run the simulation again?\nPress Y to repeat, Anything else to quit");
            String response = in.nextLine();
            if (!response.equalsIgnoreCase("y")){
                break;
            }
        }
    }
}