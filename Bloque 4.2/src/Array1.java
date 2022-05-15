import java.util.Scanner;

//Calcular la media de los elementos de un vector. 
public class Array1 {

	public static void main(String[] arg) {
		
		int num; 
		Scanner S = new Scanner(System.in); 
		
		System.out.println("Introduce la longitud del vector");
		num = S.nextInt(); 
		
		double [] vec = new double[num]; 
		double total = 0; 
		for(int i = 0; i< num; i++) {
			System.out.println("Introduce un numero");
			vec[i]= S.nextDouble(); 
		}
		for(int i = 0; i< num; i++) {
			total += vec[i]; 
		}
		total = total/num; 
		System.out.print("La media del vector es: "+total);
		S.close();
	}
}
