 public static void main(String[] args) {
        // TODO code application logic here
        String str;
        Scanner in=new Scanner(System.in);
        str=in.nextLine();
        String str1[]=str.split(" ");
        for(int i=0;i<str1.length;i++)
        {
            if(i%2==0)
            {
                StringBuffer rev=new StringBuffer(str1[i]);
                System.out.print(rev.reverse()+" ");
            }
            if(i%2!=0)
            System.out.print(str1[i]+" ");
        
        
    }
    