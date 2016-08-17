package paragraphs;

import java.util.Scanner;

/**
 *
 * @author ANJALI
 */
public class Paragraphs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic hereS
        String name=null;
        int lines=1;
        Scanner in=new Scanner(System.in);
        name=in.nextLine();
        while(!name.contains("exit"))
        {
            name=in.nextLine();
            lines++;
        }
           System.out.println(lines);
    }
    
}
