public class Plus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=125;
        int sum=0,r=0;
        while(n!=0)
        {
            r=n%10;
            sum+=r*r;
            n=n/10;
        }
        System.out.println(sum);
    }
}