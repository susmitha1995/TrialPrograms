public class FrstAndLastSum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=1234,sum=0;
        
        int lastdigit=n%10;
        while(n!=0)
        {
            int r=n%10;
            sum=sum*10+r;
            n=n/10;
            
        }
        sum=sum%10;
        int frstlast=sum+lastdigit;
        System.out.print(frstlast); 
    }
    
}
