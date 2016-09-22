public class Removepal {

    /**
     * @param args the command line arguments
     */
   static String rev(String str)
    {
        String res="";
        for(int i=str.length()-1;i>=0;i--)
        {
            res+=str.charAt(i);
        }
        return res;
    }
   
       
public static void main(String[] args)
{ 
    Scanner in=new Scanner(System.in);
    String str;
    str=in.nextLine();
    StringBuffer sb=new StringBuffer(str);
    for(int i=0;i<str.length();i++)
    {
        sb=sb.deleteCharAt(i);
        String res="";
        res=rev(sb.toString());
        if(sb.toString().equals(res))
        {
            System.out.print(res+" ");
        }
                sb=new StringBuffer(str);
    }
	
	
}
    }
    

