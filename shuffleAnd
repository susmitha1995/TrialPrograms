public class ShuffleAnd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str="jack and jill went up and down the hill";
        String str1[]=str.split(" ");
        
        for(int i=0;i<str1.length;i++)
        {
            if(str1[i]==("and"))
                
            {
                
                 String first=str1[i-1];
                 String second=str1[i+1];
                 String temp;
                 temp=first;
                 first=second;
                 second=temp;
                 str1[i-1]=first;
                 str1[i+1]=second;
             
                
          }
              
            }
      for(int j=0;j<str1.length;j++)
      {
          System.out.print(str1[j]+" ");
      }
         
        }
            
    }
    

