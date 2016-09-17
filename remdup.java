public static void main(String[] args) {
        // TODO code application logic here
        String str="Engineering";
        String r="",s="";
        for(int i=0;i<str.length();i++)
        {
            if(!r.contains(str.charAt(i)+""))
                r=r+str.charAt(i);
            else
                s=s+str.charAt(i);
        }
            for(int i=0;i<r.length();i++)
                if(!s.contains(r.charAt(i)+""))
                    System.out.print(r.charAt(i));
        
       
    }