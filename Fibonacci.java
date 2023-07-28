import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
        int num;
     
        System.out.print("Digite un numero: ");
        num = console.nextInt();
        int cont=0;
		int posicion1=0;
		int posicion2=1;
		int aux=0;
        do{
        	
		aux = posicion1+posicion2;
		System.out.println(cont + " " + posicion1);
		posicion1=posicion2;
		posicion2=aux;
		cont++;
		
		}while(cont<=num);

	}

}