
import java.util.Scanner;

public class CifradoCesar {
	public static void main(String[] arg) {
		
		Scanner S = new Scanner(System.in); 
		String a; 
		
		System.out.print("Introduce una frase: ");
		a = S.nextLine(); 
		
		System.out.println(a);
		
		//Algoritmo de encriptado de cifrado de Cesar
		String frase1, frase2; 
		int desplazamiento; 
		
		frase2 = ""; 
		
		String min = "abcdefghijklmnopqrstuvwxyz"; 
		String max = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
		
		System.out.print("Introduce una frase: ");
		frase1 = S.nextLine(); 
		
		System.out.print("Introduce la clave de desplazamiento: ");
		desplazamiento = S.nextInt(); 
		
		for(int i = 0; i < frase1.length(); i++) {
			for(int j = 0; j < min.length(); j++) {
				if(frase1.charAt(i) == min.charAt(j)) {
					if(j + desplazamiento >= min.length()) {
						frase2 += min.charAt((j + desplazamiento) % min.length()); 
					}
					else {
						frase2 += min.charAt(j + desplazamiento); 
					}
				}
				else if(frase1.charAt(i) == max.charAt(j)) {
					if(j + desplazamiento >= max.length()) {
						frase2 += max.charAt((j + desplazamiento) % max.length()); 
					}
					else {
						frase2 += max.charAt(j + desplazamiento); 
					}
				}
			}
			
		}//FIN DEL FOR
		System.out.println(frase1);
		System.out.println(frase2);
		
		S.close();
	}
		
}
