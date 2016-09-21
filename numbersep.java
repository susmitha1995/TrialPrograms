public static void main(String[] args) {
        // TODO code application logic here
        String str;
        Scanner in=new Scanner(System.in);
        str=in.nextLine();
        String[] str1=str.split(",");
        int[] num=new int[10];
        int n=0;
        
        for(int i=0;i<str1.length;i++)
        {
            str1[i]=str1[i].replaceAll("[^1-9]","");
           //System.out.print(str1[i]);
            n= Integer.parseInt(str1[i]);
            //System.out.print(n);
        }
       
     int sum=0;
       while(n!=0)
               {
                   int a=n%10;
                   sum=sum+a;
                   n=n/10;
               }
       System.out.print(sum);
    }