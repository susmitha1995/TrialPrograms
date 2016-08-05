import java.util.Scanner;
import java.util.StringTokenizer;
class Tokens
{
	public static void main(String[] args)
	{
	Scanner input=new Scanner(System.in);
	String stmt;
	StringTokenizer st;
	System.out.println("Enter the sentence");
	stmt=input.nextLine();
	st=new StringTokenizer(stmt," ");
	System.out.println("No of words:"+st.countTokens());
	}
}