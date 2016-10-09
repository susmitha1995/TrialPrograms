public static void main(String[] args) {
        // TODO code application logic here
       int x=10,y=20;
      int sum=x+y;
       System.out.print("sum using arithmetic"+sum);
       while(y!=0)
       {
           int carry=x&y;
           x=x^y;
           y=carry<<1;
       }
         System.out.print("sum using bitwise"+x);
         
    }
    