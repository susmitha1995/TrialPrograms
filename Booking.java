package busres;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Susmitha Raj
 */
public class Booking {
    
    String PassName;
    int BusNum;
    Date date;
    
    Booking(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name of Passenger..");
        PassName = sc.next();
        System.out.print("Enter Bus Number");
        BusNum= sc.nextInt();
        System.out.print("Enter Date DD-MM-YYYY");
        String d = sc.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        try {
            date = dateFormat.parse(d);
        } catch (ParseException ex) {
            Logger.getLogger(Booking.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    public boolean isAvailable(ArrayList<Bus>buses,ArrayList<Booking>book){
        int capacity=0;
        for(Bus bus:buses)
        {
            if(bus.getBusNum()==BusNum)
                capacity=bus.getCap();
        }
        int booked=0;
        for(Booking b:book)
        {
            if(b.BusNum==BusNum&&b.date.equals(date))
               booked++;
        }
        return booked<capacity?true:false;
    }
}

    