package busres;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Susmitha Raj
 */
public class BusRes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        ArrayList<Bus> buses = new ArrayList<>();
       // Bus[] buses = new Bus[50]; //ArrayList Collections  
       buses.add(new Bus(1,true,2));
       buses.add(new Bus(2,false,2));
       buses.add(new Bus(3,true,1));
       
       ArrayList<Booking> book = new ArrayList<>();
       
       
       
       for(Bus b:buses)
       {
          b.displayBusInfo();
       }
       
       System.out.println("Enter 1 to Book , 2 to Exit");
       Scanner sc= new Scanner(System.in);
       
       int n=1;
       while(n==1)
       {
           n= sc.nextInt(); 
           if(n==1){
               Booking booking = new Booking();
               if(booking.isAvailable(buses,book))
               {
                   book.add(booking);
                   System.out.println("Your Booking is confirmaed");
               }
               else
                   System.out.println("Sorry Bus is full, Try another bus or date");
               
               System.out.println("Enter 1 to Book , 2 to Exit");
           }
           
       }
    }
    
}
