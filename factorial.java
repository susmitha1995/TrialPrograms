import java.util.Scanner;
class factorial
{
	public static void main(String[] args)
	{
	int fact=1,i,n;
	Scanner input=new Scanner(System.in);
	n=input.nextInt();
	for(i=1;i<=n;i++)
	fact=fact*i;
	System.out.println(fact);
	}
}
