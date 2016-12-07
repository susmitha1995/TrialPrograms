 public static void main(String[] args)throws IOException {
        // TODO code application logic here
       int n,sum=0,r,cnt=0;
       Scanner in=new Scanner(System.in);
       n=in.nextInt();
      while(n!=0)
      {
          r=n%10;
          cnt++;
          n=n/10;
      }
       System.out.print(cnt);

        
    }
    