import java.util.Scanner;
class enter
{
	public static void main(String[] args)throws Exception
	{
	Scanner input=new Scanner(System.in);
	char[] ch;
	ch=new char[100];
	int i=0;
	do{
	ch[i]=(char)System.in.read();
	if(ch[i]!='q')
	i++;
	else
	break;
	}while(true);
	}
}