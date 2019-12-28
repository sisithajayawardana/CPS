package CPS;
import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        CarParkManager first = new WestminsterCarParkManager();
        char x;
        do {
            System.out.println("Welcome to the Car parking System");
            System.out.println("---------------------------------");
            System.out.println("[1] Add a new vehicle");
            System.out.println("[2] Delete a vehicle");
            System.out.println("[3] Print the list of vehicles");
            System.out.println("[4]Statistics");
            int n = scan.nextInt();
            switch (n) {
                case 1:
                    first.AddNewVehicle();
                case 2:
                    first.DeleteVehicle();
                case 3:
                    first.CreateList();
                case 4:
                    first.Statistics();
            }
            System.out.println("Do you wish to back to main menu[y/n]");
            x = scan.next().charAt(0);
        } while (x == 'y' || x == 'Y');


    }

}
