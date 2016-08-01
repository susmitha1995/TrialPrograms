import java.util.Scanner;
class PowerOfDigit
{
	static int sum=0;
	public static void main(String[] args)
	{
	int num;
	System.out.print("Enter the digit");
	Scanner input=new Scanner(System.in);
	num=input.nextInt();
	int lastdigit=num%10;
	while(num>0)
	{
	sumCalc(num%10,lastdigit);
	num=num/10;
	}
	System.out.println(sum);
}

private static void sumCalc(int x,int lastdigit)
{
int pow=1;
for(int i=0;i<lastdigit;i++)
{
pow*=x;
}sum+=pow;
}
}
	