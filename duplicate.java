public class Duplicate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       String str;
       Scanner in=new Scanner(System.in);
       str=in.nextLine();
       String r=" ";
       for(int i=0;i<str.length();i++)
       {
           if(!r.contains(""+str.charAt(i)))
               r=r+str.charAt(i);
       }
       System.out.print(r);
    }
    
}
