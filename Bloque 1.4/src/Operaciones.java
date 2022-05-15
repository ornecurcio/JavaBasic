
public class Operaciones {

	public static void main(String[] arg) {
		
		int a, b, suma, resta, mult, resto;
		double div; 
		
		a = 21; 
		b = 22; 
		
		suma = a + b;
		resta = a - b;
		mult = a * b;
		div = (double)a / b;	
		resto = a % b;
		
		
		System.out.println("El valor de suma es: "+ suma); 
		System.out.println("El valor de resta: "+ resta);
		System.out.println("El valor de multiplicacion es: "+ mult);
		System.out.println("El valor de division es: "+ div);
		System.out.println("El valor de resto es: "+ resto);
	}
}
