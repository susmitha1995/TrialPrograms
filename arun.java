  public static void main(String[] args) {
        // TODO code application logic here
        String str="arun#12#12#12";
        String str2="deepak#13#12#12";
        String[] str1=str.split("#");
        String[] str3=str2.split("#");
        int tot=0,tot1=0;
        for(int i=1;i<str1.length;i++)
            tot=tot+Integer.parseInt(str1[i]);
        //System.out.print(str1[0]+"="+tot);
         for(int i=1;i<str3.length;i++)
            tot1=tot1+Integer.parseInt(str3[i]);
        // System.out.print(tot1);
        // System.out.print(tot);
         if(tot1>tot)
             System.out.print(str3[0]+"="+tot1);
         else
             System.out.print(str1[0]+"="+tot);
         
            
            
        
    
}
