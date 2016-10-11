public static void main(String[] args) {
        // TODO code application logic here
        int n,sum=0;
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        int num[][]=new int[n][n];
        for(int i=0;i<n;i++)
            for( int j=0;j<n;j++)
                num[i][j]=in.nextInt();
         for(int i=1;i<n-1;i++)
         {
            for( int j=1;j<n-1;j++)
            sum+=num[i][j];  
                
         }
         System.out.print(sum);
        
                
        
    }