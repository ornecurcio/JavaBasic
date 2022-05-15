
import java.util.Scanner; 

public class ForWhile {

	public static void main(String[] arg) {
	//mostrar todos los numeros introducidos por teclado
		int a, b, i;  
		Scanner S = new Scanner(System.in); 
		
		System.out.println("Ingrese el numero menor");
		a = S.nextInt(); 
		System.out.println("Ingrese el numero mayor");
		b = S.nextInt(); 
		
		i = a; 
		
		while(i < b) {
			System.out.print(i+" ");
			i++; 
		}
		System.out.println("Fin del while");
		for(int j = a; j < b; j++) {
			System.out.print(j+" ");
		}
		System.out.println("Fin del for");
		
	//sumar todos los numeros que hay entre dos numeros introducidos
		
		int num1, num2, k, suma=0; 
		
		System.out.println("Ingrese el numero menor");
		num1 = S.nextInt(); 
		System.out.println("Ingrese el numero mayor");
		num2 = S.nextInt(); 
		
		k = num1; 
		
		while(k < b) {
			suma += k; 
			k++; 
			System.out.print(k+" "+suma+", ");
		}
		System.out.println("Fin del while suma");
		
		suma = 0; 
		for(int z = num1; z < num2; z++) {
			suma += z;
			System.out.print(z+" "+suma+", ");
		}
		System.out.println("Fin del for");
		
		S.close();
	}
	
}
