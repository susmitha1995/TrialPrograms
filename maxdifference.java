  public static void main(String[] args) {
        // TODO code application logic here
        Scanner in=new Scanner(System.in);
        int n,c=0,s=0;
        n=in.nextInt();
        int num[]=new int[n];
        int diff[]=new int[2*n];
        for(int i=0;i<n;i++)
            num[i]=in.nextInt();
        for(int i=0;i<n-1;i++)
            for(int j=i+1;j<n;j++)
            {
                diff[c]=Math.abs(num[i]-num[j]);
                c++;
            }
       
        Arrays.sort(diff);
        // for(int i=0;i<2*n;i++)
           // System.out.print(diff[i]+" ");
         for(int i=0;i<2*n;i++)
             s=diff[i];
         System.out.print(s);
        
   
    }
  