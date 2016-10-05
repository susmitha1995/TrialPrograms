public static void main(String[] args) {
        // TODO code application logic here
        Scanner in=new Scanner(System.in);
        String str;
        
        str=in.nextLine();
        String str1[]=str.split(" ");
        for(int i=0;i<str1.length;i++)
        {
            int n=0,m=0;
            char[] ch=str1[i].toCharArray();
            if(str1[i].length()%2==0)
            {
            for(int j=0;j<ch.length;j++)
            {
                if(ch[j]>=(int)'a'&&ch[j]<=(int)'m'||ch[j]>=(int)'A'&&ch[j]<=(int)'M')
                    n++;
                else if(ch[j]>=(int)'n'&&ch[j]<=(int)'z'||ch[j]>=(int)'N'&&ch[j]<=(int)'Z')
                    m++;
            }
            if(n==m)
                System.out.print(str1[i]+"is balanced\n");
            else
                System.out.print(str1[i]+"not balanced\n");
            }
        
        else
                System.out.print(str1[i]+"is not balanced\n");
        
        
    }
    
}