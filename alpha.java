import java.util.Scanner;
class alpha
{
	public static void main(String[] arg)throws Exception
	{
	char ch;
	Scanner input=new Scanner(System.in);
	ch=(char)System.in.read();
	if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z'))
		System.out.println("alphabet");
	else
		System.out.println("not an alphabet");
	}
}
