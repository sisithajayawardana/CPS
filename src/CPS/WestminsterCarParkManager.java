package CPS;
import java.util.*;
public class WestminsterCarParkManager implements CarParkManager {
    Scanner scan=new Scanner(System.in);
    car car1=new car();
    van van1=new van();
    bike bike1=new bike();

    public void AddNewVehicle() {
        System.out.println("[1]- Bike");
        System.out.println("[2]- Car");
        System.out.println("[3]- Van");
        int n=scan.nextInt();
        switch (n){
            case 1:bike1.GetInfo();
            case 2:car1.GetInfo();
            case 3:van1.GetInfo();
        }

    }

    public void DeleteVehicle() {
        System.out.println("[1]- Bike");
        System.out.println("[2]- Car");
        System.out.println("[3]- Van");
        int n=scan.nextInt();
        switch (n){
            case 1:bike1.deleteData();
            case 2:car1.deleteData();
            case 3:van1.deleteData();
        }

    }

    public void CreateList() {

    }
    public void Statistics() {

    }
}
