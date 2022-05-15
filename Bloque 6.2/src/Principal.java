import java.util.Random;

public class Principal {
	public static void main(String[] arg) {
		
		Random rand = new Random(System.nanoTime()); 
		int aux1, aux2; 
		
		aux1 = rand.nextInt(10); 
		aux2 = rand.nextInt(10); 
		
		Vertice v1 = new Vertice(aux1, aux2);
		
		aux1 = rand.nextInt(10); 
		aux2 = rand.nextInt(10); 
		
		Vertice v2 = new Vertice(aux1, aux2);
		
		aux1 = rand.nextInt(10); 
		aux2 = rand.nextInt(10); 
		
		Vertice v3 = new Vertice(aux1, aux2);
		
		Triangulo t1 = new Triangulo(v1, v2, v3); 
		
		System.out.println("El valor vertice de v1 es: "+t1.getA()+" vertice 2 es: "+t1.getB()+" vertice 3 es: "+t1.getC());
	}
}
