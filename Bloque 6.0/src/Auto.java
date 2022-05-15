
public class Auto {
	private String nombre;
	private int velocidad, aceleracion; 
	
	//constructor
	public Auto(String nombre, int velocidad, int aceleracion) {
		this.nombre = nombre; 
		this.velocidad = velocidad; 
		this.aceleracion = aceleracion; 	
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int getAceleracion() {
		return aceleracion;
	}

	public void setAceleracion(int aceleracion) {
		this.aceleracion = aceleracion;
	}
}
