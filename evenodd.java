import java.util.Scanner;
class evenodd
{
	public static void main(String[] args)
	{
	int n;
	Scanner input=new Scanner(System.in);
	n=input.nextInt();
	if(n%2==0)
		System.out.println("no.is even");
	else
		System.out.println("no.is odd");
	}
}