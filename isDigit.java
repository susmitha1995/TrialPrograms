public class IsDigit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in=new Scanner(System.in);
        String str;
        str=in.nextLine();
        char ch[]=str.toCharArray();
        boolean tf=Character.isDigit(ch[0]);
        System.out.print(tf);
    }
    