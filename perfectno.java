import java.util.Scanner;
class perfectno
{
	public static void main(String[] args)
	{
	int n,i=1,sum=0;
	Scanner input=new Scanner(System.in);
	n=input.nextInt();
	while(i<n){
		if(n%i==0)
			sum=sum+i;
			i++;
		}
	if(sum==n)
		System.out.println(i+"is a perfect number");
	else
		System.out.println(i+"is not a perfect number");
	return;
	}
}