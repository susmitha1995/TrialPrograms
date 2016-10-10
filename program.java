 public static void main(String[] args) {
        // TODO code application logic here
        int i1=366;
        int a[]={11,13,17,19,23,29,31,37,41,43,47,51,53,59,61,67,71,73,79,83,87,89,91,97};
        for(int i=0;i<a.length;i++)
            if(i1==a[i])
                System.out.print("1");
        if(i1<22)
            System.out.print("-1");
        for(int i=0;i<a.length;i++)
            for(int j=0;j<a.length;j++)
            {
                int c=a[i]+a[j];
                if(c==i1)
                    System.out.print("2");
            }
            for(int i=0;i<a.length;i++)
                for(int j=0;j<a.length;j++)
                    for(int k=0;k<a.length;k++)
                    {
                        int c=a[i]+a[j]+a[k];
                        if(c==i1)
                            System.out.print("3");
                    }
            for(int i=0;i<a.length;i++)
                for(int j=0;j<a.length;j++)
                    for(int k=0;k<a.length;k++)
                    for(int l=0;l<a.length;l++)
                    {
                         int c=a[i]+a[j]+a[k]+a[l];
                        if(c==i1)
                            System.out.print("4");
                    }
             for(int i=0;i<a.length;i++)
                for(int j=0;j<a.length;j++)
                    for(int k=0;k<a.length;k++)
                    for(int l=0;l<a.length;l++)
                        for(int m=0;m<a.length;m++)
                    {
                         int c=a[i]+a[j]+a[k]+a[l];
                        if(c==i1)
                            System.out.print("5");
                    }
            
                    }
            
    }
