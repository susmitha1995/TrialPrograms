public class star {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str="hello";
        int x;
        x=str.length()/2;
        for(int i=0;i<str.length();i++)
            if(i==x)
            System.out.print("*");
        else
                System.out.print(str.charAt(i));
        String reverse="";
        for(int i=str.length()-1;i>=0;i--)
            reverse=reverse+str.charAt(i);
        System.out.print("\n");
        for(int i=0;i<reverse.length();i++)
            if(i==x)
                System.out.print("*");
        else
                System.out.print(reverse.charAt(i));
     