import java.util.Scanner;
class Reverse
{
	public static void main(String[] args)
	{
	int num,r,sum=0;
	Scanner input=new Scanner(System.in);
	num=input.nextInt();
	
	while(num!=0)
	{
	r=num%10;
	sum=sum*10+r;
	num=num/10;
	}
	
	System.out.println(sum);
	}
}