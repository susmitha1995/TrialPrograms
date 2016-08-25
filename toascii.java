public class toascii {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner in=new Scanner(System.in);
        String str;
        str=in.nextLine();
        //char[] ch=str.toCharArray();
        char ch[]=new char[str.length()];
       // int i=0;
         int[] cnt=new int[ch.length];
        for(int i=0;i<str.length();i++ ){
         //ch = in.next().charAt(i);
           
           
        cnt[i]=(byte)str.charAt(i)-1;
       // System.out.print("   ");
        
        
        }
        String r="";
        for(int k=0;k<cnt.length-1;k++){
           int c=cnt[k];
           char s=(char)c;
	if(s=='a')
		r=r+'z';
	else
           r=r+s;
        }
        System.out.print(r+str.charAt(str.length()-1));
    }
   
}
