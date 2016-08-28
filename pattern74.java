public class Pattern74 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String num;
        Scanner in=new Scanner(System.in);
        num=in.next();
        int i=0,j=num.length()-1;
        while(i<num.length())
        {
            if(num.charAt(i)!=num.charAt(j))
            {
                System.out.print(num.charAt(i));
                System.out.print(num.charAt(j));
            }
        else
            {
             System.out.print(num.charAt(i));
            }
        i++;
        j--;
            
	
	
        }	
    }
    
}
