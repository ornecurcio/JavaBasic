
import java.util.Scanner; 

public class DoWhile {

	public static void main(String[] arg) {
		int a;  
		Scanner S = new Scanner(System.in); 
		
		do {
			System.out.println("1. Ingresar por pantalla hola mundo");
			System.out.println("2. Enseñar por pantalla numeros entre 5 y 10");
			System.out.println("3. Enseñar por pantalla 'Aprendiendo Java'");
			System.out.println("Introduce una opcion");
			a = S.nextInt(); 
		}while(a > 3 || a < 1); 
		
		switch (a) {
		case 1:
			System.out.println("Hola Mundo");
			break;
		case 2:
			for(int i = 5; i<10; i++) {
				System.out.print(i+" ");
			}
			break;
		case 3:
			System.out.println("Aprendiendo Java");
			break;
		default:
			break;
		}
		S.close();
	}
}
