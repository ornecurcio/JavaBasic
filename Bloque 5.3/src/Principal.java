import java.util.Random;

public class Principal {
	public static void main(String[] arg) {
		
		boolean buenos = true, malos = true; 
		Random rand = new Random(System.nanoTime()); 
		
		Personaje p1 = new Personaje();
		Personaje p2 = new Personaje();
		Personaje p3 = new Personaje();
		
		p1.setFisico(15);
		p1.setFuerza(30);
		p1.setNivel(3);
		p1.setNombre("Luke");
		p1.setPh(2);
		p1.setSalud(200);
		
		p2.setFisico(10);
		p2.setFuerza(40);
		p2.setNivel(2);
		p2.setNombre("Darth");
		p2.setPh(4);
		p2.setSalud(600);
		
		p3.setFisico(5);
		p3.setFuerza(60);
		p3.setNivel(10);
		p3.setNombre("Yoda");
		p3.setPh(10);
		p3.setSalud(300);
		
		System.out.println(p1.getNombre()+" tiene una vida de "+p1.getSalud());
		System.out.println(p2.getNombre()+" tiene una vida de "+p2.getSalud());
		System.out.println(p3.getNombre()+" tiene una vida de "+p3.getSalud());
		System.out.println();
		
		do {
			int salud; 
			int aleatorio = rand.nextInt(1); 
			if(aleatorio==0){
				salud=p1.ataque_fisico(); 
			}
			else {
				salud=p1.ataque_fuerza(); 
			}
			System.out.println(p1.getNombre()+" ha realizado un ataque de "+salud);
			p2.daño(salud);
			
			aleatorio = rand.nextInt(1); 
			if(aleatorio==0){
				salud=p3.ataque_fisico(); 
			}
			else {
				salud=p3.ataque_fuerza(); 
			}
			System.out.println(p3.getNombre()+" ha realizado un ataque de "+salud);
			p2.daño(salud);
			
			if(p2.getSalud()>0) {
				aleatorio = rand.nextInt(1); 
				if(aleatorio==0){
					salud=p2.ataque_fisico(); 
				}
				else {
					salud=p2.ataque_fuerza(); 
				}
				aleatorio = rand.nextInt(1); 
				if(aleatorio==0){
					p3.daño(salud);
					System.out.println(p2.getNombre()+" ha realizado un ataque de "+salud+" a "+p3.getNombre());
				}
				else {
					p1.daño(salud);
					System.out.println(p2.getNombre()+" ha realizado un ataque de "+salud+" a "+p1.getNombre());
				}	
			}
			if(p1.getSalud()<=0 && p3.getSalud()<=0) {
				buenos = false; 
			}
			else if(p2.getSalud()<=0) {
				malos = false; 
			}
			System.out.println();
			System.out.println(p1.getNombre()+" tiene un salud de "+p1.getSalud());	
			System.out.println(p2.getNombre()+" tiene un salud de "+p2.getSalud());	
			System.out.println(p3.getNombre()+" tiene un salud de "+p3.getSalud());	
			System.out.println("FIN DEL ROUND");	
			System.out.println();	
			
			try {
				System.in.read(); 
			}catch(Exception e) {}
		}while(buenos && malos); 
	}
}
