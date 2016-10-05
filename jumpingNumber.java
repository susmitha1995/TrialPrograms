 public static void main(String[] args) {
        // TODO code application logic here
        int n;
        Scanner in=new Scanner(System.in);
        
        n=in.nextInt();
        int b=n;
        int cnt=0,i=0;
        int num[]=new int[5];
        int diff[]=new int[num.length-1];
        String result="";
        //boolean tf;
        while(b!=0)
        {
            
            num[i]=b%10;
            b=b/10;
            cnt++;
            i++;
        }
        if(cnt==1)
          System.out.print("jumping Number is:"+n);
       else
        {
            for(int x=0;x<5;x++)
                System.out.print(num[x]);
         for(int k=0;k<4;k++)
         {
            diff[k]= num[k]-num[k+1];
            System.out.print(diff[k]);
             
                  
        }
         for(int s=0;s<diff.length;s++)
         {
             if(diff[s]==1||diff[s]==-1)
                 result="jumping number is :"+n;
              else
                 result="not";
         }
        
    }
    System.out.print(result);
}
}