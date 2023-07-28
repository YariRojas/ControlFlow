import java.util.Scanner;
public class String 

public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner console = new Scanner(System.in);
    String nombre;
 
    System.out.print("Escibe el nombre: ");
    nombre = console.next();
    
   // System.out.println(nombre.length());
    
    for(int i=0;i<nombre.length();i++) {
    	 System.out.println(nombre.charAt(i));
         
    }
}