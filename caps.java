 public static void main(String[] args) {
        // TODO code application logic here
        String str="i like java";
        char ch;
        String[] str1=str.split(" ");
        for(int i=0;i<str1.length;i++)
        {
            ch= str1[i].charAt(0);
           int temp=(byte)ch;
           temp=temp-32;
           ch=(char)temp;
                System.out.print(ch);
                for(int j=1;j<str1[i].length();j++)
                {
                    System.out.print(str1[i].charAt(j));
                }
                System.out.print(" ");
                    
    }