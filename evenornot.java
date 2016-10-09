 public static void main(String[] args) {
        // TODO code application logic here
        int n=10;
        int num=n>>1<<1;
        if(n==num)
            System.out.print(n+"is even");
        else
            System.out.print(n+"is not even");
    }