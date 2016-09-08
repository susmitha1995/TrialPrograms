public class A2b2c2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws java.lang.Exception {
        // TODO code application logic here
        String name="a3b3c4";
        int x=0;
        int i;
        for( i=1;i<name.length();i+=2)
        {
            x=Character.getNumericValue(name.charAt(i));
        while(x>0)
        {
            System.out.print(name.charAt(i-1));
            x--;
        
    }
        }
}
}
