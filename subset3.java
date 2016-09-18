 public static void main(String[] args) {
        // TODO code application logic here
   Scanner in=new Scanner(System.in);
  String str1,str2;
   int cnt=0;
   str1=in.nextLine();
   str2=in.nextLine();
  /* char[] ch1=str1.toCharArray();
   char[] ch2=str2.toCharArray();
   for(int i=0;i<ch2.length;i++)
       for(int j=0;j<ch1.length;j++)
           if(ch1[j]==ch2[i])
               cnt++;
   if(cnt==ch2.length)*/
   if(str1.contains(str2))
       System.out.print("is subset");
   else
        System.out.print("is not subset");
   }