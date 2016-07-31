import java.util.Scanner;
class sum
{
	public static void main(String[] args)
	{
	Scanner input=new Scanner(System.in);
	
	int n,sum=0,i;
	n=input.nextInt();	
	for(i=0;i<=n;i++)
	{
	sum=sum+i;
	
	}
	System.out.println("sum is:"+sum);
	}
}
	