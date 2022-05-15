
import java.util.Scanner; 

public class CondicionesMultiples {

	public static void main(String[] arg) {
		int hora, min, seg;  
		Scanner S = new Scanner(System.in); 
		
		System.out.println("Ingrese una hora");
		hora = S.nextInt(); 
		System.out.println("Ingrese min");
		min = S.nextInt(); 
		System.out.println("Ingrese seg");
		seg = S.nextInt(); 
		
		if(hora < 25 && hora > -1 && min > -1 && min < 61 && seg > -1 && seg < 61) {
			if(seg == 60){
				min++; 
				seg = 0; 
			}
			if(min>=60){
				hora++;
				min = 0; 
			}
			if(hora==25){
				hora = 0; 
			}
				System.out.println(hora+":"+min+":"+seg);
		}
		else {
				System.out.println("La Hora no es la correcta");
		}
		S.close();
	}
}
