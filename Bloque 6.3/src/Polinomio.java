import java.util.Random;

public class Polinomio {
	private Vertice[] v;
	
	public Polinomio(int tam) {
		Random rand = new Random(System.nanoTime()); 
		int aux1, aux2; 
	
		v = new Vertice[tam]; 
		
		for(int i = 0; i <tam; i++) {
			aux1 = rand.nextInt(10); 
			aux2 = rand.nextInt(10); 
			v[i] = new Vertice(aux1, aux2); 
		}
	}	
	public void muestra (int i) {
		Vertice aux = v[i]; 
		System.out.println("El valor de la posicion i: "+i+" Es X: "+aux.getX()+" Y: "+aux.getY()); 
	}
	
	
}
