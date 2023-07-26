import java.util.Scanner;

public class Parte1 {

	public static void main(String[] args) {
		
		Scanner  in = new Scanner(System.in);
		System.out.println("Cantidad vendida: ");
		long venta = in.nextLong();
		double comision = 0.0;
		if(venta < 1000) {
	    	  System.out.println("Sin comisión");
	      
		}else if(venta>=1001 && venta<=4999) {
	    	comision = venta * .10; 
	    	System.out.print("La comisión es: ");
	    	System.out.print(comision);
	    	  
	     
		}else if(venta>=5001 && venta<9999) {
	    	  comision = venta * .20; 
	    	  System.out.print("La comisión es: ");
	    	  System.out.print(comision);
	      
		}else if(venta >= 10000) {
	    	  comision = venta * .30; 
	    	  System.out.print("La comisión es: ");
	    	  System.out.print(comision);
	      
		}else {
	    	  System.out.print("Un número correcto: ");
	    	 }//if else
	}
}

