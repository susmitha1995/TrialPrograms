import java.util.Scanner;
class Numbers
{
	public static void main(String[] args)
	{
	Scanner input=new Scanner(System.in);
	int num,count=0;
	num=input.nextInt();
	int b=num;
	while(b!=0)
	{
	b=b/10;
	count++;
	}
	System.out.println(count);
	}
}