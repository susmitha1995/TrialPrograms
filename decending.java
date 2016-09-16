   public static void main(String[] args) {
        // TODO code application logic here
        int a[]=new int[25];
        Scanner in=new Scanner(System.in);
        int i,n,j=0;
        System.out.print("enter n th num");
        n=in.nextInt();
        int pos;
        System.out.print("enter pos");
        pos=in.nextInt();
        for(i=0;i<n;i++)
            a[i]=in.nextInt();
        for(i=0;i<n-1;i++)
            for(j=i+1;j<n;j++)
                if(a[i]<a[j])
                {
                    int temp;
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            
        for(int k=0;k<n;k++)
        {
            System.out.print(a[k]);
            System.out.print(" ");
        
                }
                System.out.println();
            System.out.print(a[pos-1]);

    }
}
    

