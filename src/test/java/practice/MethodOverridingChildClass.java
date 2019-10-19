package practice;

public class MethodOverridingChildClass extends MethodOverridingParentClass  {

	public void myMethod(){
		System.out.println("I am a method from Child Class");
	}
	
	public static void main(String [] args){
		
		MethodOverridingChildClass obj = new MethodOverridingChildClass();
		
		// It calls the child class method myMethod()
		obj.myMethod();
		
		/* When parent class reference refers to the child class object
		 * then the method of the child class (overriding method) is called.
		 * This we call as runtime polymorphism
		 */
		 MethodOverridingParentClass obj1 = new MethodOverridingChildClass();
		 
		 // It calls the child class method myMethod()
		 
		 obj1.myMethod();
		 
		 
		 /* When Parent class reference refers to the parent class object
		 * then the method of parent class (overriden method) is called.
		 */
		 MethodOverridingParentClass obj2 = new MethodOverridingParentClass();
		 
		 obj2.myMethod();
    }
}
