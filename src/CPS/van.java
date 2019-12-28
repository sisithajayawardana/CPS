package CPS;

import java.util.Scanner;

public class van extends vehicle {
    String cargo_vol;
    Scanner scan=new Scanner(System.in);
    public void GetInfo(){
        System.out.println("Enter the van number");
        id=scan.next();
        id_plate.add(id);
        System.out.println("Enter the brand of the van");
        brand_=scan.next();
        brand.add(brand_);
        System.out.println("Enter the color of the van");
        color_=scan.next();
        color.add(color_);
        System.out.println("Enter the cargo volume of the van");
        cargo_vol=scan.next();
        cap_doo_vol.add(cargo_vol);
        System.out.println("Enter the entry time of the van");
        time=scan.next();
        entry_time.add(time);
    }
    public void deleteData() {
        System.out.println("Enter the van number");
        id = scan.next();
        id_plate.remove(id);
        for (int i = 0; i < id_plate.size(); i++) {
            if (id_plate.get(i) == id) {
                brand.remove(i);
                color.remove(i);
                cap_doo_vol.remove(i);
            }
        }
    }
    public void PrintList(){
        for(int i=(id_plate.size()-1);i>=0;i--){
            System.out.print(id_plate.get(i));
            System.out.print(" ");
            System.out.print(entry_time.get(i));
            System.out.print("Type");
        }

    }

}
