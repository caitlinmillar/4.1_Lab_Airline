
import Enums.Destination;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        ArrayList<Flight> availableFlights = new ArrayList<>();

         Random passengerID = new Random();


        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to our flight booking system. \nPlease enter your name.");
        Passenger passengerNew = new Passenger();
        String name = scanner.nextLine();

        System.out.println("Your unique ID number is " + passengerID.nextInt(4000, 9000));

        System.out.println("Where would you like to go? \n" + Arrays.asList(Destination.values()));
        String destination = scanner.nextLine();


        try {
            String Destination;
            System.out.println();
        } catch (Exception exception) {
            System.out.println("Something went wrong");
        }


    }
}
