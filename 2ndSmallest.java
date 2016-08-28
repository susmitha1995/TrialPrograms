public class Ascendingorder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a[]=new int[25];
        Scanner in=new Scanner(System.in);
        int i,n,j;
        System.out.print("enter n th num");
        n=in.nextInt();
        for(i=0;i<n;i++)
            a[i]=in.nextInt();
        for(i=0;i<n-1;i++)
            for(j=i+1;j<n;j++)
                if(a[i]>a[j])
                {
                    int temp;
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
                //for(i=0;i<n;i++)
        {
                    System.out.print(a[2]);
                   // System.out.print(" ");
                }
            
            
    }
    
}
