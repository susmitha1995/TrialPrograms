import java.util.Scanner;
class gcd
{
    public static void main(String Args[])
    {
        System.out.println("Enter 2 numbers");
        Scanner input=new Scanner(System.in);
        int m=input.nextInt();
        int n=input.nextInt();
	        int h=1;
	int 
	p=m*n;
	for(int i=2;i<p;i++)
	{
	if((m%i==0)&&(n%i==0))
	{
	h=i;
	}
	}
	System.out.println(h);
	
    }
}
	