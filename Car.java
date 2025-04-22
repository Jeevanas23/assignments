package week1.day1;

public class Car {
	//method creation syntax
	 //access modifier return type methodName(){
	//}
	public static void main(String[] args) {
		//object creation syntax
		  //className objectName =new ClassName();
		Car c=new Car();
		c.applyingBrake();
		c.applyingAccelarator();
		c.add(10, 20); //int default value is 0
	} //it will print in the order
	
	public void applyingBrake() {  
		//shortcut write methodname and click control shift
		System.out.println("Brakes Applied");
		
	}
	public void applyingAccelarator() {
		System.out.println("Applying Accelarator");
		
	}
	
	public void add(int a,int b) {
		System.out.println(a+b);
	}
  
}

//to delete a line click control D