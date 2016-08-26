public class WithoutLoop {

    /**
     * @param args the command line arguments
     */
    
    public  static void looping(int n)
    {
        int a=1;
        if(a<=n)
        {
            System.out.println(a);
            ++a;
           looping(int n);

        }
         
    }
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner in=new Scanner(System.in);
       WithoutLoop num=new WithoutLoop();
       num.looping(in.nextInt());
    }
    
}
