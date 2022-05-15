import java.util.Scanner;

//Escribir en un vector y luego leerlo
//vector o array
public class Array {
	public static void main(String[] arg) {
		
		int [] vec = new int[5]; 
		Scanner S = new Scanner(System.in); 
		
		for(int i = 0; i< 5; i++) {
			System.out.println("Introduce un numero");
			vec[i]= S.nextInt(); 
		}
		for(int i = 0; i< 5; i++) {
			System.out.print(vec[i]+" ");
			
		}
		S.close();
	}

}
