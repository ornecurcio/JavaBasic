
public class Principal {
	public static void main(String[] arg) {
		
		Numero num=new Numero(); 
		
		num.set(10);
		
		System.out.println("El valor de los atributos"); 
		System.out.println("num1 = "+num.getNum1());
		System.out.println("num2 = "+num.getNum2());
		
		num.set(10,11.1);
		
		System.out.println("El valor de los atributos"); 
		System.out.println("num1 = "+num.getNum1());
		System.out.println("num2 = "+num.getNum2());
	}
}
