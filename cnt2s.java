public static void main(String[] args) {
        // TODO code application logic here
        Scanner in=new Scanner(System.in);
        int n;
        n=in.nextInt();
        int num,cnt=0,a;
        for(int i=0;i<=n;i++)
        {
            num=i;
            while(num!=0)
            {
                a=num%10;
                if(a==2)
                    cnt++;
                num=num/10;
            }
        }
        System.out.print(cnt);
        
    }