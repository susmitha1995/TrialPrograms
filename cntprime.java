public class Cntprime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        int cnt=0;
        
        for(int i=2;i<=n;i++){
            boolean prime=true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    prime= false;
                    break;
                    
                
                 
                    }
                
        }
            
            if(prime)
            {
                cnt++;
               // System.out.print(i + ", ");

            }
    }
    System.out.print(cnt);
}
}