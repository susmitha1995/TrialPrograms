 public static void main(String[] args) {
        // TODO code application logic here
        String[] input={"100","111","10100","10","1111"};
        int cnt=0;
        for(int i=0;i<input.length;i++)
        {
            if(input[i].charAt(0)=='1'&&input[i].charAt(1)=='0')
                cnt++;
                
        }
        int n=input.length;
        System.out.print(n-cnt);
       
    }
    