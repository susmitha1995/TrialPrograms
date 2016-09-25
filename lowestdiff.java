public static void main(String[] args) {
        // TODO code application logic here
        Scanner in=new Scanner(System.in);
        int n,l=0;
        n=in.nextInt();
        int num[]=new int[n];
        int diff[]=new int[2*n];
        for(int i=0;i<n;i++)
        {
            num[i]=in.nextInt();
        }
        for(int i=0;i<n-1;i++)
            for(int j=i+1;j<n;j++)
            {
                diff[l]=Math.abs(num[i]-num[j]);
                l++;
            }
       /* for(int i=0;i<2*n;i++)
        {
            System.out.print(diff[i]+" ");
        }*/
        java.util.Arrays.sort(diff);
        System.out.print(diff[0]);
        
            
        
                
    }
    