import java.util.Scanner;
class swap
{
	public static void main(String[] args)
	{
	int x,y;
	Scanner input=new Scanner(System.in);
	x=input.nextInt();
	y=input.nextInt();
	x=x^y;
	y=x^y;
	x=x^y;
	System.out.print("x="+x+"y="+y);
	}
}