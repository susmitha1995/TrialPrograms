import java.util.Scanner;
class even
{
	public static void main(String[] args)
	{
	Scanner input=new Scanner(System.in);
	int a,b,i;
	a=input.nextInt();
	b=input.nextInt();
	System.out.print(" the range from \n"+a+"to"+b);
	if(a%2==0)
	{
	for(i=a;i<=b;i+=2)
	 
	System.out.println(i);
	}
	else 
	{
	for(i=a+1;i<=b;i+=2)

	System.out.println(i);
	}
	}
}
	