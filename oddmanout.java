public static void main(String[] args) {
        // TODO code application logic here
        int n;
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        int[] num=new int[n];
        int l[],a=0,b=0,s=0,s1=0;
        for(int i=0;i<n;i++)
        {
            num[i]=in.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(num[i]%2==0)
            {
                a=num[i];
                s++;
            }    
            if(num[i]%2!=0)
            {
                b=num[i];
                s1++;
            }
        }
        if(s==1)
            System.out.print(a);
        else
            System.out.print(b);
    }
    