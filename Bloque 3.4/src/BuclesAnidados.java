import java.util.Scanner; 

//mostrar las tablas de multiplicar del 1 al 10
public class BuclesAnidados {
	public static void main(String[] arg) {
		int mult;  
		Scanner S = new Scanner(System.in); 
		
		for(int i = 0; i<=10; i++) {
			for(int j = 1; j <= 10; j++) {
				mult  = i * j; 
				System.out.println(i+" * "+j+" = "+mult);
			}
			System.out.println();
		}
		S.close();
	}
		
}
