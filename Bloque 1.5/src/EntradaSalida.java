
import java.util.Scanner; 

public class EntradaSalida {
	
	public static void main(String[] arg) {
		
		int a;
		double b; 
		Scanner S = new Scanner(System.in); 
		
		System.out.println("Ingrese un numero entero"); 
		
		a = S.nextInt();
		System.out.println("Ingrese un numero decimal"); 
		
		b = S.nextDouble(); 
		
		System.out.println("El valor de a es: "+ a); 
		System.out.println("El valor de b es: "+ b); 
		
		S.close();
	}

}
