 public static void main(String[] args) {
        // TODO code application logic here
        int n;
        Scanner in =new Scanner(System.in);
        n=in.nextInt();
        int num[]=new int[n];
        for(int i=0;i<n;i++)
            num[i]=in.nextInt();
        int sum1=0,sum2=0,cnt1=0,cnt2=0,avg1=0,avg2=0;
        for(int i=0;i<n/2;i++)
        {
           sum1=sum1+num[i];
           cnt1++;
        }
        avg1=sum1/cnt1;
        for(int i=n/2;i<n;i++)
        {
            sum2=sum2+num[i];
            cnt2++;
        }
        avg2=sum2/cnt2;
        if(avg1==avg2)
            System.out.print("average is equal");
        else
            System.out.print("average is not equal");
        
    }
