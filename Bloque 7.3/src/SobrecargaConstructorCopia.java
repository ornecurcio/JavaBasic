import java.util.Random;

public class SobrecargaConstructorCopia {
	public static void main(String[] arg) {
		Random rand = new Random(System.nanoTime()); 
		int aux1, aux2; 
		
		aux1 = rand.nextInt(10); 
		aux2 = rand.nextInt(10); 
		
		Vertice a = new Vertice(5, 25); 
		
		aux1 = rand.nextInt(10); 
		aux2 = rand.nextInt(10); 
		
		Vertice b = new Vertice(aux1, aux2); 
		
		aux1 = rand.nextInt(10); 
		aux2 = rand.nextInt(10); 
		
		Vertice c = new Vertice(aux1, aux2); 
		
		Triangulo t1 = new Triangulo(a, b, c); 
		
		Vertice temp = new Vertice(t1.getA()); 
		
//		Vertice temp = new 
		System.out.println("El valor de X del objeto temp es: "+temp.getX()+
				" y el de Y es: "+temp.getY()); 
		
		temp.setX(20);
		temp.setY(32);
		
		System.out.println("El valor de X del objeto A es: "+t1.getA().getX()+
				" y el de Y es: "+t1.getA().getY()); 
	}
	
}
