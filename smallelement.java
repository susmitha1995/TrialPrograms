public static void main(String[] args) {
        // TODO code application logic here
        int n;
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        int num[]=new int[n];
        for(int i=0;i<n;i++)
        {
            num[i]=in.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(i<n-1)
            {
            if(num[i]>num[i+1])
            {
                System.out.print(num[i+1]);
                
            }
            else
                System.out.print("-1");
            
            }
            else
            {
                if(num[n-1]>num[0])
                {
                    System.out.print(num[0]);
                    
                }
                else
                    System.out.print("-1");
            }
            System.out.print(" ");
        }
        //System.out.print(num[n-1]);
        
    }
    
