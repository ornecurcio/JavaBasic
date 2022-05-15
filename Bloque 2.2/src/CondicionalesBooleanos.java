import java.util.Scanner; 

public class CondicionalesBooleanos {

	public static void main(String[] arg) {
		double temp; 
		Scanner S = new Scanner(System.in); 
		
		System.out.println("Ingrese una temperatura");
		temp = S.nextDouble(); 
		
		if(temp>32) {
				System.out.println("Hace calor");
		}
		else {
			if(temp > 25) {
				System.out.println("Temperatura normal");
			}
			else {
				System.out.println("Hace frio");
			}
		}
		System.out.println("Afuera de la condicion");
		S.close();
		boolean resultado, resultado2; 
		resultado = true; 
		resultado2 = false; 
		
		if(resultado)
		{
			System.out.println("es verdadero");
		}
		if(!resultado2)
		{
			System.out.println("es falso");
		}
	}
}
