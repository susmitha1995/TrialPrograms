import java.util.Scanner;
class evenodd
{	
	public static void main(String[] args)
	{
	Scanner input=new Scanner(System.in);
	int x;
	x=input.nextInt();
	if(x%2==0)
		System.out.println("no. is even");
	else
		System.out.println("no.is odd");
	}
}
