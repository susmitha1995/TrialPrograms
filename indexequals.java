 public static void main(String[] args) {
        // TODO code application logic here
        int n;
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        int num[]=new int[n];
        for(int i=0;i<n;i++)
            num[i]=in.nextInt();
        for(int i=0;i<n;i++)
        {
            if(i==num[i])
                System.out.print("index value"+i+"equals"+num[i]);
        }
    }