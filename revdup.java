public static void main(String[] args) {
        // TODO code application logic here
        String str,r="";
        Scanner in = new Scanner(System.in);
        str=in.nextLine();
        
        for(int i=0;i<str.length();i++)
            if(!r.contains(str.charAt(i)+""))
                r=r+str.charAt(i);
        //System.out.print(r);
        for(int i=r.length()-1;i>=0;i--)
            System.out.print(r.charAt(i));
            
        
    }
    
}
