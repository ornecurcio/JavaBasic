
public class Numero {
	private int num1=0; 
	private double num2=0; 
	
//sobrecarga	
	public void set(int num) {
		num1 = num; 
	}
	
	public void set(double num) {
		num2 = num; 
	}
	public void set(int num1, double num2) {
		this.num1=num1; 
		this.num2=num2; 
	}
	
//get
	public double getNum2() {
		return num2;
	}

	public int getNum1() {
		return num1;
	}
	
}
