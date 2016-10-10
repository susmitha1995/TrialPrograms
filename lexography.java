public static void main(String[] args) {
        // TODO code application logic here
        Scanner in=new Scanner(System.in);
        String str=in.next();
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)<str.charAt(i+1))
            {
                System.out.print(str.substring(i+1));
                break;
            }
        }
    }
    