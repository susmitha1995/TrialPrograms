public class Sum1ofdigits {

    public static int output;
    static int x;
    public static void main(String[] args) {
        // TODO code application logic here
        Sum1ofdigits s=new Sum1ofdigits();
        s.looping(1234);
        System.out.print(output);
      }
    public void looping(int n)
    {
        int a=n;
        while(a!=0)
        {
            x+=a%10;
            a=a/10;
            
        }
            n=n/10;
            if(n>0)
            {
                looping(n);
            }
            output=x;
    }
    
}
