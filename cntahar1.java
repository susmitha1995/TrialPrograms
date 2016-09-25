 public static void main(String[] args)throws IOException {
        // TODO code application logic here
       
      String str="susmitha";
      for(char i='a';i<='z';i++)
      {
          int cnt=0;
          for(int j=0;j<str.length();j++)
          {
              char ch=str.charAt(j);
              if(ch==i)
              {
                  cnt++;
              }
          }
          if(cnt!=0)
          {
              System.out.print(i);
              System.out.print(cnt);
          }
              
      }
        
        
    }