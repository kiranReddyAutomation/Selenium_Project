package abstractPackage;

public class Child extends Parent1 {
	
	public void method1() {
		
		System.out.println("Child class method1");
	}
	
    public void method2() {
		
		System.out.println("Child class method2");
	}
    
    public static void mail(String args[]) {
    	
        Child obj = new Child();
             
        obj.method1();
        
        obj.method2();
    }

	@Override
	void myMethod() {
		
		System.out.println("This is abstract method");
	}

}
