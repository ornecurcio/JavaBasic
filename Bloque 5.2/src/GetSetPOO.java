
public class GetSetPOO {
	public static void main(String[] arg) {
		Libro lib1 = new Libro(); 
		Libro lib2 = new Libro(); 
		
		lib1.setTitulo("Chaman");
		lib2.setTitulo("La Dra Cole");
		
		
		System.out.println("El titulo del libro 1 es: "+lib1.getTitulo());
		System.out.println("El titulo del libro 2 es: "+lib2.getTitulo());
	}
}
