 public static void main(String[] args) {
        // TODO code application logic here
        Scanner in =new Scanner(System.in);
        int n;
        n=in.nextInt();
        int[] num=new int[n];
        for(int i=0;i<n;i++)
            num[i]=in.nextInt();
        for(int i=0;i<n-1;i++)
            for(int j=i+1;j<n;j++)
                if(num[i]<num[j])
                {
                    int temp;
                    temp=num[i];
                    num[i]=num[j];
                    num[j]=temp;
                    
                }
        for(int i=0;i<n;i++)
            System.out.print(num[i]+" ");
        System.out.print("its binary value is: "+Integer.toBinaryString(num[0]));
        System.out.print("Number of bits are:"+Integer.bitCount(num[0]));
        
        
    }
    
}
