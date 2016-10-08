 public static void main(String[] args) {
        // TODO code application logic here
        String str[]={"aa","b","cc","ddd"};
        int n=2,cnt=0,len;
        for(int i=0;i<str.length;i++)
        {
            len=str[i].length();
            if(len==n)
                cnt++;
        }
        System.out.print(cnt);
    }