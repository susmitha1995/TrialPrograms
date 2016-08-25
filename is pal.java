public class SumisPalin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=123;
        int ch=0;
        while(n!=0)
        {
            
            int r=n%10;
            ch+=r;
            n=n/10;
            
        }
       int rev=0;
       while(ch!=0)
       {
           int a=ch%10;
           rev=rev*10+a;
           ch=ch/10;
       }
      // System.out.println(rev);
       if(rev==n)
           System.out.println("is palindrome");
       else
           System.out.println("is not palindrome");
    
}
}
