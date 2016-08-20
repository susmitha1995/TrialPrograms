public class Revvowrem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str;
        Scanner in=new Scanner(System.in);
        str=in.nextLine();
        
        int len=str.length();
        String rev="";
        for(int i=0;i<len;i++){
                       char ch=str.charAt(i);
            if(ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u'&&ch!='A'&&ch!='E'&&ch!='I'&&ch!='O'&&ch!='U')
           rev=ch+rev;
        }
            System.out.print(rev);

        
    }
    
}
