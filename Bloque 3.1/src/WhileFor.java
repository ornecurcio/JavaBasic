
public class WhileFor {
	
	public static void main(String[] arg) {
		
		int i = 0; 
		int j; 
		
		while(i<5) {
			System.out.println(i+" ");
			i++; 
		}
		System.out.println("Estoy fuera del bucle while");
		
		for(j=0; j < 5; j++) {
			System.out.println(j+" "); 
		}
		System.out.println("Estoy fuera del bucle for");
	}

}
