 public static void main(String[] args) {
        // TODO code application logic here
        int n,i,j,sum=0;
        boolean prime;
        Scanner in=new Scanner(System.in);
        System.out.print("enter an int");
        n=in.nextInt();
        for( i=2;i<=n;i++)
        {
            prime=true;
            for(j=2;j<=i/2;j++)
            {
                if(i%2==0)
                {
                    prime=false;
                    break;
                }
            }
            if(prime==true)
                sum=sum+i;
        }
        System.out.print(sum);
        
        
    }
  