import java.util.Scanner;

public class IfElse {

	public static void main(String[] arg) {
		
		/*
		int x = 5; 
		if(x==4){
			System.out.println("Es verdadero"); 
		}
		else {
			System.out.println("Es falso");
		}
		
		System.out.println("Ya termino el codigo de evaluacion"); 
		*/
		
		//Comprobar si un numero dado por teclado es par
		int a; 
		Scanner S = new Scanner(System.in); 
		
		System.out.println("Ingrese un numero entero");
		a = S.nextInt(); 
		
		if(a%2==0) {
			System.out.println("El numero es par");
		}
		else {
			System.out.println("El nunmero es impar");
		}
		
		S.close();
	}
}
