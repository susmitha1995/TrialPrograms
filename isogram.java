import java.util.Scanner;

/**
 *
 * @author ANJALI
 */
public class isograms{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s;
       int flag=0;
        Scanner in=new Scanner(System.in);
        s=in.nextLine();
for(int i=0;i<s.length();i++) 
    for(int j=i+1;j<s.length();j++)
        if(s.charAt(i)==s.charAt(j))
           flag=1;
if(flag==1)
    System.out.println("is not isogram");
else
    System.out.println("is  isogram");

        
        
       
    
    
}
}