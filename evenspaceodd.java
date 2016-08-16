import static com.sun.org.apache.xml.internal.security.keys.keyresolver.KeyResolver.length;
import java.util.Scanner;

/**
 *
 * @author ANJALI
 */
public class evenstring{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str;
        
        int i;
        Scanner input=new Scanner(System.in);
        str=input.nextLine();
        for(i=1;i<str.length();i+=2)
            System.out.print(str.charAt(i));
        System.out.print(" ");
        for(i=0;i<str.length();i+=2)
             System.out.print(str.charAt(i));
        
        
        
        
        
    }
    
}
