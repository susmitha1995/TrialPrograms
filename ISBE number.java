public class Noofdays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String num;
        int sum=0,n=10;
        Scanner in=new Scanner (System.in);
        num=in.nextLine();
        for(int i=0;i<num.length();i++)
        {
            sum=sum+num.charAt(i)*n;
            n--;
            
        }
        if(sum%11==0)
            System.out.print("is is ISBE number");
        else
            System.out.print("is not ISBE number");
            
        
        

    }
    
}
