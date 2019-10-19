package practice;

public class MethodOverridingParentClass {
	
	/*
	  Declaring a method in child class which is already present in the parent class is called Method Overriding.

       In simple words, overriding means to override the functionality of an existing method.

       In this case, if we call the method with child class object, then the child class method is called. 
       To call the parent class method we have to use super keyword.
       
    Assume we have multiple child classes.In case one of the child classes want to use the parent class method and other class 
    want to use their own implementation then we can use overriding feature.

    Method overriding is also known as runtime polymorphism. Let’s see why we call it as runtime polymorphism.
    
    ParentClass obj = new ChildClass();
    
    When a parent class reference refers to the child class object then the call to the overridden method is determined 
    at the runtime.So it is called runtime polymorphism.It is because during method call which method 
    (parent class or child class) is to be executed is determined by the type of an object.
       
	 */
	
	public void myMethod(){
		
		System.out.println("I am a method from Parent Class");
	}

}
