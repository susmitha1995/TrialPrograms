 public static void main(String[] args) {
        // TODO code application logic here
        int n;
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        int num[]=new int[n];
        for(int i=0;i<n;i++)
        {
            num[i]=in.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                //if(i!=j)
                for(int k=j+1;k<n;k++)
                {
                 if(num[i]+num[j]==num[k])
                     System.out.print(num[i]+"+"+num[j]+"="+num[k]);
                }
            }
        }
    }