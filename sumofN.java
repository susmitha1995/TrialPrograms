 public static void main(String[] args)throws IOException {
        // TODO code application logic here
       int n,sum=0,r;
       Scanner in=new Scanner(System.in);
       n=in.nextInt();
       for(;n!=0;)
       {
         r=n%10;
         sum=sum+r;
         n=n/10;
       }
       System.out.print(sum);
       

        
    }
    