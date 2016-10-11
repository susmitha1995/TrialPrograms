 public static void main(String[] args) {
        // TODO code application logic here
        int n;
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        int num[]=new int[n];
        for(int i=0;i<n;i++)
            num[i]=in.nextInt();
        int unique=0;
        for(int i:num)
        {
         unique^=i;   
        }
        System.out.print(unique);
    }
    