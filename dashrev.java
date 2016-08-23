public class Dash {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str;
        Scanner in=new Scanner(System.in);
        str=in.nextLine();
        int i;
        for(i=str.length()-1;i>=0;i--)
        {
            System.out.print(str.charAt(i));
            System.out.print("-");
        }
    }
    