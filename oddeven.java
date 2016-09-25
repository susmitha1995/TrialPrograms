    public static void main(String[] args) {
        // TODO code application logic 
        Scanner in=new Scanner(System.in);
	System.out.println("Enter the num");
        int num;
        num=in.nextInt();
        int odd[]=new int[num/2+1];
        int l=0,result=0;
        for(int i=0;i<=num;i++)
        {
            if(i%2==1)
            {
                odd[l]=i;
                l++;
            }
        }
        for(int k=0;k<l-1;k++)
        {
            if(k%2==0)
            {
                odd[k+1]=odd[k]+odd[k+1];
            }
            if(k%2==1)
            {
                odd[k+1]=odd[k]-odd[k+1];
            }
            result=odd[k+1];
        }
        System.out.print(result);
        
	
			
    }
