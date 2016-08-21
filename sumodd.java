import java.util.Scanner;

/**
 *
 * @author ANJALI
 */
public class Sumofodd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        int sum=0;
        for(int i=0;i<=n;i++){
            if(i%2!=0)
                 sum=sum+i;
        }
        System.out.println(sum);
        
    }
    
}
