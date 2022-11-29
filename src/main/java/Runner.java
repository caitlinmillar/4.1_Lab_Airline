
import Enums.Destination;


import java.util.*;

import static Enums.Destination.*;
import static java.lang.System.in;

public class Runner{
    private int myChoice;

    public static void main(String[] args) {
        ArrayList<Destination> availableFlights = new ArrayList<>();
        Random passengerID = new Random();
        Scanner scanner = new Scanner(in);

        availableFlights.add(PARIS);
        availableFlights.add(ROME);
        availableFlights.add(BARCELONA);

        System.out.println("Welcome to our flight booking system. \nPlease enter your name.");
        Passenger passengerNew = new Passenger();
        String name = scanner.nextLine();

        System.out.println("Your unique ID number is " + passengerID.nextInt(4000, 9000));

        System.out.println(Menu.menuData());
        String menu = scanner.nextLine();



            if(menu.contains("1")) {
                System.out.println("Where would you like to go? \n" + Arrays.asList(Destination.values()));
            } else {
                if(menu.contains("2"))
                System.out.println("Here's a list of the available flights.\n" + availableFlights);
            }


//         System.out.println("Where would you like to go? \n" + Arrays.asList(Destination.values()));
        String destination = scanner.nextLine();

//         System.out.println("Here's a list of the available flights.\n" + availableFlights);

        System.out.println(name + " is booked onto " + destination + " flight");

        try {
            String Destination;
            System.out.println();
        } catch (Exception exception) {
            System.out.println("Something went wrong");
        }

    }


}
