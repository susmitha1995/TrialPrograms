public class Project1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double pounds,kg,meter,yd ,celsius,fahrenheit;
        Scanner in=new Scanner(System.in);
        System.out.print("enter pounds=");
        pounds=in.nextDouble();
        kg=pounds*0.454;
        System.out.println("kg="+kg);
        kg=0;
        System.out.println("enter kg=");
        kg=in.nextDouble();
        pounds=kg*2.20264;
        System.out.println("pounds="+pounds);
        System.out.println("enter meter=");
        meter=in.nextDouble();
        yd=meter*1.0936;
        System.out.println("yard="+yd);
        yd=0;
        System.out.println("enter yard=");
        yd=in.nextDouble();
        meter=yd*0.9144;
        System.out.println("meter="+meter);
        System.out.println("enter celsius=");
        celsius=in.nextDouble();
        fahrenheit=celsius*9/5+32;
        System.out.println("fahrenheit is="+fahrenheit);
        fahrenheit=0;
        System.out.println("enter fahrenheit=");
        fahrenheit=in.nextDouble();
        celsius=(fahrenheit-32)*5/9;
        System.out.println("celsius="+celsius);
        
        
                
    }
    
}
