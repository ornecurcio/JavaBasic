
public class Ordenamiento {
	public static void main(String[] arg) {
		
		int [] vec = {7, 8, 5, 2, 0, 7, 6, 9, 11, 34}; 
		int aux; 
		
		for(int i=0; i<vec.length; i++) {
			for(int j=i+1; j<vec.length-1; j++) {
				if(vec[j]<vec[i]) {
					aux = vec[j]; 
					vec[j]=vec[i];
					vec[i]=aux; 
				}
			}
		}
		for(int i = 0; i< vec.length; i++) {
			System.out.print(vec[i]+" ");
			
		}
	}

}
