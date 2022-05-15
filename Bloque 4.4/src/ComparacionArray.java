
public class ComparacionArray {
	public static void main(String[] arg) {
		
		int [] v1 = {7, 8, 5, 2, 0, 7, 6, 9, 11, 34}; 
		int [] v2 = {7, 8, 5, 2, 0, 7, 6, 9, 11, 34, 37};
		boolean igual = true; 
		
		if(v1.length!=v2.length)
		{
			igual = false; 
		}
		
		for(int i=0; i<v1.length && igual; i++) {
			if(v1[i]!=v2[i]) {
				igual = false; 
			}
		}
		if(igual) {
			System.out.print("Los vectores son iguales");
		}
		else {
			System.out.print("Los vectores son distintos");
		}

	}
}
