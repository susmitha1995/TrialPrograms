 public static void main(String[] args) {
        // TODO code application logic here
        String str="programming",r="",s="";
        for(int i=0;i<str.length();i++)
            if(!r.contains(str.charAt(i)+""))
                r=r+str.charAt(i);
        else
                s=s+str.charAt(i);
       // System.out.print(r);
        //System.out.print(s);
        for(int i=0;i<s.length();i++)
        {
            int cnt=0;
            for(int j=0;j<r.length();j++)
            {
                if(s.charAt(i)==r.charAt(j))
                cnt++;
            }
            System.out.print(s.charAt(i)+":");
            System.out.print(cnt+1);
             
        
    }
    