import java.util.Scanner;

public class Parte2 {

	public static void main(String[] args) {
		
		Scanner  in = new Scanner(System.in);
		System.out.println("edad : ");
		int edad = in.nextInt();
		float costo = 0.0F;
		
		if(edad>0 && edad < 5) {
			costo = (float) (7 - (7 * .60)); 
			
	    System.out.print("Precio del boleto: ");
	    System.out.print(costo);
	    }else if(edad>=5 && edad<60) {
	    
	    System.out.print("Precio del boleto: 7");
	    }else if(edad > 60 && edad<100) {
	        costo = (float) (7 - (7 * .55));
	    
	    System.out.print("Precio del boleto: ");
		System.out.print(costo);
	    }else {
	    
	    System.out.print("Edad incorrecta");
	    	} //if else

	}//class Parte2
}
