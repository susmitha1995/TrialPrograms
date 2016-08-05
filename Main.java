import java.util.Scanner;
public class Main {

  public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
    String str;
    int counter = 0;
	str=input.nextLine();
    for (int i = 0; i < str.length(); i++) {
      if (Character.isLetter(str.charAt(i)))
        counter++;
}
System.out.println(counter);
}
}
