package superKeyword;

public class Child extends Parent {

	int i = 20;
	
	Child(){
		
		//super(); //this method is optional.by default java compiler will provide super() to call parent class Constructor
		//from child class onstructor
		
		System.out.println("This is child Class Constructor");
	}
	
	public void m1() {
		
		System.out.println("This is Child class Method");
		
		super.m1();
	}
	
	public void m2() {
		
		System.out.println("Value of i in child class: "+ i);
		
		System.out.println("Value of i in parent class: "+ super.i);
	}
	
    public static void main(String args[]) {
		
		Child obj = new Child();
		
		obj.m1();
		
		obj.m2();
	}
}
