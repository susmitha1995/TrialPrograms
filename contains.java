public class Contains {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str;
        Scanner in=new Scanner(System.in);
        str=in.nextLine();
       char ch=in.next().charAt(0);
       if(str.contains(""+ch))
           System.out.print("char is present");
       else
           System.out.print("char is not present");
                   
               
        
    }
    
}