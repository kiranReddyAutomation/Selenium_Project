package abstractPackage;

public class Child1 extends Parent1{

	public static void main (String [] args){

        // Here we cannot instantiate the AbstractSuperClass class but we can instantiate the AbstractChildClass class
        // Using the instance of AbstractChildClass we can access methods and data members of AbstractSuperClass class

     Parent1 obj = new Child1();

     System.out.println("I am a data member from Super class and my value is " + obj.a);
     
     obj.myMethod();
     
     obj.myMethod(20);

   }

   @Override
   void myMethod() {

       System.out.println("I am in child class");

   }
}
