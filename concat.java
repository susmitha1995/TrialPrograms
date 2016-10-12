public static void main(String[] args) {
        // TODO code application logic here
         String str="programming";
         int cnt=2;
         for(int i=1;i<str.length();i++)
         {
           if(cnt==2)
           {
                 System.out.print(str.charAt(0)+""+str.charAt(i));
                 System.out.print("  ");
           }
    }
    }