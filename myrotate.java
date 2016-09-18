  public static void main(String[] args) {
        // TODO code application logic here
        Scanner in=new Scanner(System.in);
       System.out.print("len");
       int len=in.nextInt();
       System.out.print("index");
        int index=in.nextInt();
        int n[]=new int[len];
        for(int i=0;i<len;i++)
            n[i]=in.nextInt();
        for(int i=0;i<len;i++)
            if(i>=index)
                System.out.print(n[i]+" ");
        for(int i=0;i<len;i++)
            if(i<index)
                System.out.print(n[i]+" ");
}