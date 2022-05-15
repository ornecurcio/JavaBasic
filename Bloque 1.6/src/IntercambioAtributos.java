
import java.util.Scanner; 

public class IntercambioAtributos {
	
	public static void main(String[] arg) {
		
		int a, b, aux; 
		Scanner S = new Scanner(System.in); 
		
		System.out.println("Ingrese un numero entero"); 
		a = S.nextInt(); 
		
		System.out.println("Ingrese un numero entero"); 
		b = S.nextInt(); 
		
		aux = a; 
		a = b; 
		b = aux; 
		
		System.out.println("Los valores actuales de a y b son: "+a+", "+b); 
		S.close();
	}

}
