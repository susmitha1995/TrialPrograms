public static void main(String[] args) {
        // TODO code application logic here
        int n,j=0;
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        int[] num=new int[n];
        int[] num1=new int[n];
        for(int i=0;i<n;i++)
            num[i]=in.nextInt();
        for(int i=0;i<n;i++)
            num1[i]=num[i];
        for(int i=0;i<n-1;i++)
        {
            for(j=i+1;j<n;j++)
            {
            if(num1[i]>num1[j])
            {
                int temp;
                temp=num1[i];
                num1[i]=num1[j];
                num1[j]=temp;
            }
            }
        }
      //  for(int i=0;i<n;i++)
        //    System.out.print(num1[i]+" ");
        String str="sorted";
        for(int i=0;i<n;i++)
            if(num[i]==num1[i])
                str="sorted";
        else
                str="not sorted";
        System.out.println(str);
            
        
        
    }
    
