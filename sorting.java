public class Sorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str="The price of bread is 100 rs";
        
        String[] str1=str.split(" ");
        for(int i=0;i<str1.length;i++)
            if(Character.isAlphabetic(str1[i].charAt(0)))
            {
                char[] tmp=str1[i].toCharArray();
                Arrays.sort(tmp);
                System.out.print(tmp);
                System.out.print(" ");
            }
        else
            {
                System.out.print(str1[i]);
            }
        
    }
    
}
