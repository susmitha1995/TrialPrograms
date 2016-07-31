import java.util.Scanner;
class greaterno
{
	public static void main(String[] args)
	{
	Scanner input=new Scanner(System.in);
	int x,y,z,max;
	x=input.nextInt();
	y=input.nextInt();
	z=input.nextInt();
	max=((x>y)&&(x>z))?x:((y>z)?y:z);
	System.out.println("maximum number is"+max);
	}
}