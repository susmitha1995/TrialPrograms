import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ANJALI
 */
public class Anagram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s1;
        String s2;
        Scanner in=new Scanner(System.in);
        s1=in.nextLine();
        s2=in.nextLine();
        String copyofs1=s1.replaceAll("\\s", "");
        String copyofs2=s2.replaceAll("\\s","");
        boolean status=true;
        if(copyofs1.length()!=copyofs2.length())
        {
            status=false;
        }
        
        
                
       char[] s1Array=copyofs1.toLowerCase().toCharArray();
       char[] s2Array=copyofs2.toLowerCase().toCharArray();
       Arrays.sort(s1Array);
       Arrays.sort(s2Array);
       status=Arrays.equals(s1Array,s2Array);
       if(status)
           System.out.println("is Anagram");
       else
           System.out.println("notAnagram");
       
       
        
                }
    }
    

