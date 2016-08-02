import java.util.Scanner;
class temp
{
	public static void main(String[] args)
	{
	int x,y,temp;
	Scanner input=new Scanner(System.in);
	x=input.nextInt();
	y=input.nextInt();
	temp=x;
	x=y;
	y=temp;
	System.out.print("x="+x+"y="+y);
	}
}