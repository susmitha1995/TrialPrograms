public class SecToUpper {

        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
            // TODO code application logic here
            String str;
            Scanner in=new Scanner(System.in);
            str=in.nextLine();
            str=str.toLowerCase();
            int i=0;
            char  ch=' ';
            int temp;
            //String rev=" ";
            for (i=0;i<str.length();i++)
            {
                ch=str.charAt(i);
            if(ch==str.charAt(1))
            {
                temp=(int)ch;
                temp=temp-32;
                ch=(char)temp;
            }
               System.out.print(ch);

        }

        }
}
