public static void main(String[] args) {
        // TODO code application logic here
        int n;
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        
        String[] str=new String[n];
        for(int i=0;i<n;i++)
            str[i]=in.nextLine();
        String str1[]=new String[str.length];
        int num[]=new int[str.length];
        for(int i=0;i<n;i++)
        {
            String s="",r="";
            //int num=0;
            for(int j=0;j<str[i].length();j++)
            {
            if(Character.isAlphabetic(str[i].charAt(j)))
                  s+=(str[i].charAt(j));
            else if(Character.isDigit(str[i].charAt(j)))
                   r+=str[i].charAt(j);
            }
            str1[i]=s;
            //System.out.print(str1[i]+" ");
            //System.out.print(r);
            try
            {
            num[i]=Integer.parseInt(r);
            }
            catch(NumberFormatException ex)
            {
            }
            //System.out.print(num[i]+"  ");
        }
           
         for(int i=0;i<str1.length;i++)
             System.out.print(str1[i]+" ");
         System.out.print("\n");
         for(int i=0;i<num.length;i++)
             System.out.print(num[i]+" ");
         for(int i=1;i<num.length-1;i++)
             for(int j=i+1;i<num.length;j++)
                 if((num[i]-num[j])==1||(num[i]-num[j])==-1)
                     System.out.print("frds are"+str1[i]+"and"+str1[j]);
           
        }
        
   