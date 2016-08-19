import java.util.Scanner;

/**
 *
 * @author ANJALI
 */
public class PowerOftwo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int number,square=1,flag=0;
        Scanner in=new Scanner(System.in);
        number=in.nextInt();
        
        while(number>=square){
            if(number==square){
                flag=1;
                        }
            square=square*2;
            
            }
        if(flag==1)
        System.out.println("is power of two");
        else
            System.out.println("is not power of two");
    }
}
        