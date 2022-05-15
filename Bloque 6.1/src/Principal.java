
public class Principal {
	public static void main(String[] arg) {
		Triangulo t1 = new Triangulo(15, "T1"); 
		Triangulo t2 = new Triangulo(10, "T2"); 
		
		System.out.println("El valor del triangulo t1 es "+t1.getArea()+" el nombre es "+Triangulo.getNombre());
		System.out.println("El valor del triangulo t1 es "+t2.getArea()+" el nombre es "+Triangulo.getNombre());
		
		Triangulo.setNombre("Nuevo Triangulo");
		
		System.out.println("El valor del triangulo estatico  es "+t1.getArea()+" el nombre es "+Triangulo.getNombre());
	}
}
