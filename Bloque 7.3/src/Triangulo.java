

public class Triangulo {
	private Vertice a,b,c;
	
	public Triangulo(Vertice a, Vertice b, Vertice c ) {
		this.a= new Vertice(a); 
		this.b= new Vertice(b); 
		this.c= new Vertice(c); 
	}

	public Vertice getA() {
//		Vertice copia = new Vertice(a); 
//		return copia;
		return new Vertice(a);
	}

	public void setA(Vertice a) {
		this.a = a;
	}

	public Vertice getB() {
//		return b;
		return new Vertice(b);
	}

	public void setB(Vertice b) {
		this.b = b;
	}

	public Vertice getC() {
//		return c;
		return new Vertice(c);
	}

	public void setC(Vertice c) {
		this.c = c;
	}	
	
}
