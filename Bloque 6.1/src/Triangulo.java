
public class Triangulo {
	private int area;
	private static String nombre; 

	public Triangulo(int area, String nombre) {
		this.area = area;
		Triangulo.nombre = nombre; 
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public static String getNombre() {
		return nombre;
	}

	public static void setNombre(String nombre) {
		Triangulo.nombre = nombre;
	} 
	

}
