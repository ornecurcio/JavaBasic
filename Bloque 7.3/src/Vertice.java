
public class Vertice {
	private int x, y;
	
	//contructor 
	public Vertice(int x, int y) {
		setX(x);
		setY(y);
	}
	
	//constructor copia
	public Vertice(Vertice copia) {
		x = copia.x; 
		y = copia.y; 
	}

	//GETTERS
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
