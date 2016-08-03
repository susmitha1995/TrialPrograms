import java.util.Scanner;
class large
{
	public static void main(String[] args)
	{
	int i,n;	
	float large;
	float[] a;
	a=new float[100];
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the nth element pos");
	n=input.nextInt();
	for(i=0;i<n;i++)
	a[i]=input.nextFloat();
	large=a[0];
	for(i=1;i<n;i++)
	{
	if(a[i]>large)
	large=a[i];
	}
	System.out.println("large is"+large);
	}
}
	
	
	