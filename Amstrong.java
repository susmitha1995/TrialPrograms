import java.util.Scanner;
class Amstrong
{
	public static void main(String[] args)
	{
	int num,r,temp,sum=0;
	Scanner input=new Scanner(System.in);
	num=input.nextInt();
	temp=num;
	while(temp!=0)
	{
	r=temp%10;
	sum=sum+r*r*r;
	temp=temp/10;
	}
	if(num==sum)
	System.out.println(num+"is a amstrong num");
	else
	System.out.println(num+"is not a amstrong num");
	}
}