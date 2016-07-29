import java.util.Scanner;
class number
{	
	public static void main(String[] args)
	{
	Scanner input=new Scanner(System.in);
	int x;
	x=input.nextInt();
	if(x>0)
		System.out.println("no.is +ve");
	else if(x<0)
		System.out.println("no. is -ve");
	else 
		System.out.println("no.is 0");
	}
}
		