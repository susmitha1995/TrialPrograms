import java.util.Scanner;
class vowels
{
	public static void main(String[] arg)throws Exception
	{
	char ch;
	Scanner in = new Scanner(System.in);
	ch = (char)System.in.read();
	switch(ch)
	{
	case 'a':case 'e':case 'i':case 'o':case 'u':
		System.out.println("vowels");
		break;
	default:
		System.out.println("consonents");
		
		
	}
	}
}