public static void main(String[] args) {
        // TODO code application logic here
         String n;
	Scanner input=new Scanner(System.in);
	n=input.nextLine();
        int cnt=0;
	for(int i=0;i<n.length();i++)
            if(Character.isLetter(n.charAt(i)))
                cnt++;
        System.out.print(cnt);
      
       }
       