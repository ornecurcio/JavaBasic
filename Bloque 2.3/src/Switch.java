
public class Switch {

	public static void main(String[] arg) {
		
		char letra; 
		
		letra = 'p'; 
		
		switch (letra) {
		case 'a':
			System.out.println("Ingreso a opcion a");
			break;
		case 'b':
			System.out.println("Ingreso a opcion b");
			break;
		default:
			System.out.println("No ingreso a ninguna opcion valida");
			break;
		}
	}
}
