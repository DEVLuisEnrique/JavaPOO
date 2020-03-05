package Main;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   String cadena1 = "ClAve ";
       String cadena2 = "ClavE";
       boolean r;

      // String c1 = cadena1.toLowerCase().trim();
     //  String c2 = cadena2.toLowerCase().trim();
        

        r = cadena1.toLowerCase().trim().equals(cadena2.toLowerCase().trim());
        System.out.println(r);

       // System.out.println(c1);
       // System.out.println(c2);
        
        //r= c1.equals(c2);
        //System.out.println(r);
        
        cadena1.equalsIgnoreCase(cadena2);
        System.out.println(r);

	}

}
