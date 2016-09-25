public static void main(String[] args) {
        // TODO code application logic here
        Scanner in=new Scanner(System.in);
        int n;
        n=in.nextInt();
        int[] num=new int[n];
        int t;
        t=in.nextInt();
        int cnt=0;
        for(int i=0;i<n;i++)
        {
            num[i]=in.nextInt();
            //System.out.print(num[i]+" ");
        }
        for(int i=0;i<n-1;i++)
            for(int j=i+1;j<n;j++)
            {
                if(num[i]+num[j]==t)
                {
                 cnt++;
                 System.out.print(num[i]+"+"+num[j]+"="+t);
                }
            }
        if(cnt==0)
        {
            System.out.print("no number in target");
        }
    }
 