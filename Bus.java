package busres;

/**
 *
 * @author Susmitha Raj
 */
public class Bus {
    
   private int BusNum;
   private boolean AC;
    private int capacity;
    
    Bus(int Num,boolean ac, int cap){
        this.BusNum=Num;
        this.AC=ac;
        this.capacity=cap;
    }
    public int getBusNum(){ //accessor method
            return BusNum;
        }
    public void setBusNum(int Num){ //mutator method 
            BusNum=Num;}
    
    public boolean getAC(){
        return AC;}
        
    public void setAC(boolean ac){
            AC=ac;}
    
    public int getCap(){
        return capacity;
    }
    
    public void setCap(int cap){
        capacity=cap;
    }
    
    public void displayBusInfo(){
        System.out.print("Bus Number "+BusNum+" AC "+AC+" capacity "+capacity+"\n");
    }
            
        }
    
    
        
    