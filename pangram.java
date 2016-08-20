import java.util.Scanner;

/**
 *
 * @author ANJALI
 */
public class Atoz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws java.lang.Exception{
        // TODO code application logic here
        String str;
        String result="no";
        Scanner in=new Scanner(System.in);
        str=in.nextLine();
        String line=str.toLowerCase();
       int len=line.length();
       for(char i='a';i<'z'+1;i++){
           if(line.contains(""+i)){
               //System.out.println("is panogram");
               result="is pangram";
           }
           else
           {
               
               //System.out.println("is not panogram");
              result="is not pangram";
           }

           }
                        System.out.println(result);

       }
        
    }


