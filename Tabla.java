import java.util.Scanner;
public class Tabla {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
        int num;
        
        System.out.print("Enter any positive integer: ");
        num = console.nextInt();
                
        System.out.println("Multiplication Table of " + num);
        
       
        
        int cont=1;
        while(cont<=10) {
        	
        	int multiplicacion = 0;
        	multiplicacion= cont*num;
        	System.out.println(num + " x " + cont + " = " + multiplicacion);
        	cont++;
        	
        }//While
       //TODO implement While loop to get print result

	}

}