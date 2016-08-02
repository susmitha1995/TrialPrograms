import static java.lang.Math.pow;
import java.util.Scanner;
class pow
{
    public static void main(String Args[])
    {
        System.out.println("Enter number");
        Scanner input=new Scanner(System.in);
	int num,p,a;
	num=input.nextInt();
	System.out.println("Enter power of number");
	p=input.nextInt();
	a=(int)pow(num,p);
	System.out.println(a);
    }
}
	
	