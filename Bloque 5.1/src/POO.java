
public class POO {
	public static void main(String[] arg) {
		Guerrero g1 = new Guerrero(); 
		Guerrero g2 = new Guerrero(); 
		
		g1.Nombre = "Goku"; 
		g1.fuerza = 99; 
		g1.salud = 99; 
		
		g2.Nombre = "Vegeta"; 
		g2.fuerza = 99; 
		g2.salud = 99; 
		
		System.out.println("El guerrero 1 se llama: "+g1.Nombre);
		System.out.println("El guerrero 2 se llama: "+g2.Nombre);
	}

}
