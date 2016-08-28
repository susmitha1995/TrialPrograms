public class CharRemove4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in=new Scanner(System.in);
        String name="susmitha";
        String str,tempname,replacestring="";
        str=in.nextLine();
        char[] ch=str.toCharArray();
        tempname=name;
        for(int i=0;i<str.length();i++)
        {
          replacestring=tempname.replace(""+ch[i],"");
          tempname=replacestring;
        }
       System.out.print(replacestring);
    }
    
}
