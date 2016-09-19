 public static void main(String[] args) {
        // TODO code application logic here
        String str1="Abi";
        String str2="Bhuvana";
        String str="";
        if(str1!=str2)
            if(str1.length()<str2.length())
            {
               int len=str2.length()-str1.length();
                for(int i=1;i<=len;i++)
                    str1=str1+i;
            }
            else{
                int len=str1.length()-str2.length();
                for(int i=1;i<=len;i++)
                    str2=str2+i;
            }
       // System.out.print(str1);
        for(int i=0;i<str1.length();i++)
        {
            str=str+str1.charAt(i)+str2.charAt(i);
        }
        System.out.print(str);
      
    }
    
}
