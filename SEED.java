  public static void main(String[] args) {
        // TODO code application logic here
        int n;
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        int sum=1;
        int a=n;
        while(a!=0)
        {
            int r=a%10;
            sum=sum*r;
            a=a/10;
            
        }
        System.out.print("the seed value of  "+n+"is"+(sum*n));
    }
    