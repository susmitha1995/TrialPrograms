import java.util.Scanner;
class fib
{
	public static void main(String[] args)
	{
	Scanner input=new Scanner(System.in);
	int n,i,a,b,c;
	a=0;
	b=0;
	c=0;
	System.out.print("Enter an integer:");
	n=input.nextInt();
	for(i=1;i<=n;i++)
	{
		c=a+b;
		System.out.println(c);
	a=b;
	b=c;
	if(b==0 && c==0)
		++a;
	
	}
	}
}
