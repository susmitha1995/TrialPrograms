import java.util.Scanner;
class Prime
{
	public static void main(String[] args)
	{
	int i,n;
	Scanner input=new Scanner(System.in);
	n=input.nextInt();
	for(i=2;i<=n/2;i++)
	{
	if(n%i==0)
	{
		System.out.println(n+"is not a prime");
	return;
	}
	}
		System.out.println(n+"is a prime");
	}
	
}