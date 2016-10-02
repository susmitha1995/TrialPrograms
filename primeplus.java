 public static void main(String[] args) {
        // TODO code application logic here
         Scanner in=new Scanner(System.in);
        int n,i,cnt=0;
        String str="";
        boolean prime;
        
       // n=in.nextInt();
        for(i=2;i<=99;i++)
        {
           prime=true;
            for(int j=2;j<=i/2;j++)
                if(i%j==0)
                {
                    prime=false;
                    break;
                }
            if(prime==true)
            {
                int b=i;
                int len=0;
                while(b!=0)
                {
                    int r=b%10;
                    b=b/10;
                    len++;
                }
                if(len==2)
                {
                    str=str+i+" ";
                }
               
            }
             
        //System.out.print(cnt);
    }
    //for(int k=0;k<21;k++)
      //              System.out.print(arr[k]+" ");
        String[] str1=str.split(" ");
       
        Integer[] arr1=new Integer[str1.length];
       for(int k=0;k<str1.length;k++)
        {try{
            arr1[k]=Integer.parseInt(str1[k]);
            System.out.print(arr1[k]+" ");
        }
        catch(NumberFormatException nfe){
            System.out.printf(nfe.getMessage());
        }
        }
       int target;
         target=in.nextInt();
         int count=0;
         for(int x=0;x<arr1.length-1;x++)
         {
             for(int y=x+1;y<arr1.length;y++)
             {
                 try{
                 if(arr1[x]+arr1[y]==target)
                 {
                     count++;
                     System.out.print(arr1[x]+"+"+arr1[y]+"="+target);
             }
                 }
             
                 catch(NullPointerException ex)
                 {
                     ex.getStackTrace();
                 }
             }
                 if(count==0)
                     System.out.print("no number ");
             
             
         
        }
    }