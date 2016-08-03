import java.util.Scanner;
class lcm
{
	public static void main(String[] args)
	{
	int a,b,big,small;
	Scanner input=new Scanner(System.in);
	a=input.nextInt();
	b=input.nextInt();
	if(a>b)
	{
	big=a;
	small=b;
	}
	else
	{
	big=b;
	small=a;
	}
	for(int i=1;i<=big;i++)
	{
	if(((big*i)%small)==0)
	{
	int lcm=big*i;
	System.out.println(lcm);
	break;
	}
	}
	}
}
	