package CPS;
import java.util.*;
public class bike extends vehicle {
    String eng_capacity;
    Scanner scan=new Scanner(System.in);
    public void GetInfo(){
        System.out.println("Enter the bike number");
        id=scan.next();
        id_plate.add(id);
        System.out.println("Enter the brand of the bike");
        brand_=scan.next();
        brand.add(brand_);
        System.out.println("Enter the color of the bike");
        color_=scan.next();
        color.add(color_);
        System.out.println("Enter the engine capacity of the bike");
        eng_capacity=scan.next();
        cap_doo_vol.add(eng_capacity);
        System.out.println("Enter the entry time of the bike");
        time=scan.next();
        entry_time.add(time);
    }
    public void deleteData(){
       System.out.println("Enter the bike number");
       id=scan.next();
       id_plate.remove(id);
       for(int i=0;i<id_plate.size();i++){
           if(id_plate.get(i)==id){
               brand.remove(i);
               color.remove(i);
               cap_doo_vol.remove(i);
           }
       }
    }

}
