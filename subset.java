public static void main(String[] args) {
        // TODO code application logic here
        int m,n,cnt=0;
        Scanner in =new Scanner(System.in);
        m=in.nextInt();
        n=in.nextInt();
        int[]a=new int[m];
        int[]b=new int[n];
        for(int i=0;i<a.length;i++)
            a[i]=in.nextInt();
          for(int j=0;j<b.length;j++)
            b[j]=in.nextInt();
          for(int i=0;i<b.length;i++)
              for(int j=0;j<a.length;j++)
                  if(b[i]==a[j])
                      cnt++;
          if(cnt==b.length)
              System.out.print("is subset");
          else
              System.out.print("is not subset");
                      
    }
    
}
