
public class Principal {
	public static void main(String[] arg) {
		Auto renault = new Auto("Megane", 0, 0); 
		
		System.out.println(renault.getNombre()+" tiene una velocidad de "+renault.getVelocidad()+
				" y aceleracion de "+renault.getAceleracion());
	}
}
