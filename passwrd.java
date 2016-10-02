   public static void main(String[] args) {
        // TODO code application logic here
        String str;
        
        Scanner in=new Scanner(System.in);
        str=in.nextLine();
        int sum=0,avg;
        int ch[]=new int[str.length()];
        for(int i=0;i<str.length();i++)
        {
            ch[i]=(byte) str.charAt(i);
            sum=sum+ch[i];
            
           // System.out.print(ch[i]);
        
    }
        avg=sum/str.length();
        System.out.print((char)avg);
    
}