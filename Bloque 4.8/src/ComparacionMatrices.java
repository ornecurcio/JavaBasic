
import java.util.Scanner;
public class ComparacionMatrices {
	public static void main(String[] arg) {
		Scanner S = new Scanner(System.in); 
		int a, b, cont = 1; 
		boolean igual = true; 
		
		System.out.print("Introduce un valor para a");
		a = S.nextInt(); 
		System.out.print("Introduce un valor para b");
		b = S.nextInt(); 
		
		int[][] m1 = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		}; 
		
		int[][] m2 = new int[a][b];  
		
		for(int i = 0; i < m2.length; i++) {
			for(int j = 0; j < m2[0].length; j++) {
				m2[i][j] = cont;
				cont ++; 
			}
		}
		
		if(m1.length==m2.length && m1[0].length==m2[0].length) {
			for(int i = 0; i < m1.length && igual; i++) {
				for(int j = 0; j < m1[0].length && igual; j++) {
					if(m1[i][j] != m2[i][j]) {
						igual = false;  
					}
				}
			}
		}
		else {
			igual = false; 
		}
		
		if(igual) {
			System.out.print("Las matrices son iguales");
		}
		else {
			System.out.print("Las matrices son distintas");
		}
		S.close();
	}
}
