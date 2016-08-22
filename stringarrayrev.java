 public static void main(String[] args) {
        // TODO code application logic here
       String str1;
       Scanner in=new Scanner(System.in);
       str1=in.nextLine();
        String[] str2=str1.split(" ");
        String[] str3=new String[str2.length];
        for(int m=0;m<str2.length;m++)
        {int n=0;
            char ch[]=new char[str2[m].length()];
            for(int i=str2[m].length()-1;i>=0;i--  )
            {
                ch[n]=str2[m].charAt(i);
                n++;
            }
            str3[m]=new String(ch);
        }
            for(int i=0;i<str2.length;i++)
            {
                System.out.print(str3[i]+" ");
            }
            
            
        }
        
            
        
        
    }
    

