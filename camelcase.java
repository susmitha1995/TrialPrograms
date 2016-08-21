public class Camelcase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String result="";
        String str;
        Scanner in = new Scanner(System.in);
        str=in.nextLine();
        System.out.print(str.charAt(0));
        for(int i=1;i<str.length();i++)
        {
            char current=str.charAt(i);
            char previous=str.charAt(i-1);
            if( previous==' ')
            {
                char currentup=Character.toUpperCase(current);
            result=result+currentup;
            }
            else
            {
            char currentlow=Character.toLowerCase(current);
            result=result+currentlow;
                    }
            
            
        }
                    System.out.print(result);

    }
    
}
