public class Chsr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
		
		String str= s.nextLine();
		char ch[] = new char[str.length()];
		
		int flag;
		int k = 0;
		for (int i = 0; i < str.length(); i++) {
			flag = 0;
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					flag = 1;
				}
			}
			if (flag == 0) {
				ch[k] = str.charAt(i);
				k++;
			}
		}
                
		int cnt[] = new int[k];
		for (int  i = 0; i < cnt.length; i++) {
			cnt[i] = 0;
			for (int j = 0; j < str.length(); j++) {
				if (ch[i] == str.charAt(j)) {
					cnt[i]++;
				}
			}
		}
		
    




    int n = 0;int i=0;
		for (i = 0; i < cnt.length; i++) {
			if (cnt[i]==1) {
				n++;
			}
		}
				System.out.println(n);

	}
}

    

