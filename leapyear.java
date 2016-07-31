import java.util.Scanner;
class leapyear
{
	public Static void main(String[] args)
	{
	int year;
	Scanner input=new Scanner(System.in);
	year=input.nextInt();
	if(year%4==0&&year%100!=0&&year%400==0)
		System.out.println("year is not leapyear");
	else
		System.out.println("year is a leapyear");
	}
}