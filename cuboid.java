public static void main(String[] args) {
        // TODO code application logic here]
        int l,b,h,area;
        Scanner in=new Scanner(System.in);
        l=in.nextInt();
        b=in.nextInt();
        h=in.nextInt();
        int volume=l*b*h;
        area = 2 * ((l * b) + (b * h) + (h * l));
        
        System.out.print(area+" ");
        System.out.print(volume);
        
    }
    