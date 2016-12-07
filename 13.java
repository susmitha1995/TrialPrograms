 public static void main(String[] args)throws StringIndexOutOfBoundsException {
        // TODO code application logic here.StringIndexOutOfBoundsException
        int n,sum=0;
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
      int num[]=new int[n];
      for(int i=0;i<n;i++)
      {
          num[i]=in.nextInt();
          if(num[i]!=13)
          sum=sum+num[i];
          else
              break;
      }
      System.out.print(sum);
    }