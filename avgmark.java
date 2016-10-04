public class Avgmarks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in=new Scanner(System.in);
        int n;
        n=in.nextInt();
        int[] marks=new int[n];
        for(int i=0;i<n;i++)
            marks[i]=in.nextInt();
        double avg=(marks[0]+marks[1]+marks[2]+marks[3]+marks[4]+marks[5])/6;
        System.out.print(avg);
    }
    