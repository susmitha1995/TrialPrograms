import java.util.Scanner;

/**
 *
 * @author ANJALI
 */
public class Plus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
	Scanner input=new Scanner(System.in);
	int n,i,a,b,c;
	a=0;
	b=0;
	c=0;
	System.out.print("Enter an integer:");
	n=input.nextInt();
        n=n+1;
        int ch=0;
	for(i=1;i<=n;i++)
	{
		c=a+b;
                ch+=c;
		//System.out.println(c);
	a=b;
	b=c;
	if(b==0 && c==0)
		++a;
	
	}
        System.out.println(ch);
	}
}