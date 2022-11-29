import java.util.Scanner;

public class Menu {

public static void main(String[] args) {

    int userChoice;
    userChoice = menuData();

    do{
        switch(userChoice) {
            case 1:
                System.out.println("Option 1 is selected");
                break;
            case 2:
                System.out.println("Option 2 is selected");
                break;
            case 3:
                System.out.println("Option 3 is selected");
                break;
            default:
                break;

        }

    }
    while(userChoice > 3);

}

public static int menuData() {

    int selection;
    Scanner sc = new Scanner(System.in);
            System.out.println("+------------------------------------+");
            System.out.println("|         Menu Application           |");
            System.out.println("|      Please make a selection       |");
            System.out.println("+------------------------------------+");
            System.out.println("1 Option 1 - Select your destination");
            System.out.println("2 Option 2 - Select available flight");
            System.out.println("3 Option 3 - Cancel a booking");


            System.out.println("Your selected option is: ");
            selection = sc.nextInt();
            return selection;
}


}
