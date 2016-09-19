  public static void main(String[] args) {
        // TODO code application logic here
        String str="p14a8xkpq";
        if(str.contains("x"))
        {
            int z=str.indexOf("x")-1;
            int y=Integer.parseInt(Character.toString(str.charAt(z)));
            String rep="";
            for(int i=0;i<y;i++)
                rep+=str.charAt(z+2);
            String front=str.substring(0,z);
            String last=str.substring(z+3,str.length());
            System.out.print(front+rep+last);
        }
    }
    
