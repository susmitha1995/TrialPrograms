   Scanner in=new Scanner(System.in);
 int n=in.nextInt();
 int a1[][]=new int[n][n];
 int a2[][]=new int[n][n];
 for(int i=0;i<n;i++)
 {
     for(int j=0;j<n;j++)
     {
         a1[i][j]=in.nextInt();
     }
 }
 for(int i=0;i<n;i++)
 {
     for(int j=0;j<n;j++)
     {
         a2[i][j]=a1[i][j];
     }
 }
 for(int i=0;i<n;i++)
 {
     for(int j=0;j<n;j++)
     {
        if(a1[i][j]==0)
        {
            for(int w=0;w<n;w++)
            {
                a2[i][w]=0;
               a2[w][j]=0;
            }
        }
     }
 }
 for(int i=0;i<n;i++)
 {
     for(int j=0;j<n;j++)
     {
       System.out.print(a2[i][j]+" ");
     }
     System.out.println();
 }
    }}

    
    

