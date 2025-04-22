package week1.day1;

public class Calculator {
	public static void main(String[] args) {
		Calculator c= new Calculator();
		c.add(125, 24);
		c.subtraction(125,24);
		c.multiply(125, 24);
		c.divide(125,24);
		c.remainder(125, 24);
	}

	
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	
	public void subtraction(int a,int b) {
		System.out.println(a-b);
	}
	
	public void multiply(int a,int b) {
		System.out.println(a*b);
	}
	
	public void divide(float a,float b) {
		System.out.println(a/b);
	}
	public void remainder(float a,float b) {
		System.out.println(a%b);
	}

}
