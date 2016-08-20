public static void main(String[] args) {
        // TODO code application logic here
        
        String str;
        
        int i;
        Scanner input=new Scanner(System.in);
        str=input.nextLine();
        for(i=1;i<str.length()-1;i+=2)
            System.out.print(str.charAt(i+1));
       
        for(i=0;i<str.length()-1;i+=2)
             System.out.print(str.charAt(i+1));
        
        System.out.print(str.charAt(0));
}

        