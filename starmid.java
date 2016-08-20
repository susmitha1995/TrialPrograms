public class Starmid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        // TODO code application logic here
        String line;
        
        int i;
        Scanner in=new Scanner(System.in);
        line=in.nextLine();
        for(i=0;i<line.length()-1;i++){
            System.out.print(line.charAt(i));
        if(line.charAt(i)==line.charAt(i+1))
            System.out.print("*");
        }
       System.out.print(line.charAt(line.length()-1));
}
}