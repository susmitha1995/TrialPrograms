 Scanner in=new Scanner(System.in);
        String str1,str2,max="",min="",s="";
        str1=in.nextLine();
        str2=in.nextLine();
        if(str1.length()>str2.length())
        {
            max=str1;
            min=str2;
            s=s+str1.substring(str1.length()-str2.length())+min;
            System.out.print(s);
        }
        else if(str2.length()>str1.length())
        {
            max=str2;
            min=str1;
            s=s+str2.substring(str2.length()-str1.length())+min;
            System.out.print(s);
            
       		
			
		}
        else if(str1.length()==str2.length())
        {
            System.out.print(str1+str2);
        }
        
      
    
    
    
}