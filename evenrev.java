  public static void main(String[] args) {
        // TODO code application logic here
        String str="This is an example for this question";
        String[] str1=str.split(" ");
        for(int i=0;i<str1.length;i++)
        {
            
            
             /* char ch[]= str1[i].toCharArray();
               Arrays.sort(ch);
               System.out.print(ch);
               System.out.print(" ");*/
                String r="";
                if(i%2==0)
                {
                for(int j=str1[i].length()-1;j>=0;j--)
                {
                    r=r+str1[i].charAt(j);
                }
                    System.out.print(r);
                    System.out.print(" ");
      
        }
                
           else{
               System.out.print(str1[i]);
               System.out.print(" ");
            }
            
    
    
        }
    }
}
