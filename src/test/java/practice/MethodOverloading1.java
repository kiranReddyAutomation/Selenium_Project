package practice;


/*A class having multiple methods with same name but different parameters is called Method Overloading.
  
  There are three ways to overload a method.

  1. Parameters with different data types
  
  2. Parameters with different sequence of a data types
  
  3. Different number of parameters
 
 */

public class MethodOverloading1 {
	
	    //1. Parameters with different data types

		public void methodOne(int a){
			
	        System.out.println(a);
	    }
	    
		public void methodOne(String a)
	    {
	       System.out.println(a);
	    }	
		
		public static void main(String[] args) {

			MethodOverloading1 obj = new MethodOverloading1();
			
			obj.methodOne(10);
			
			obj.methodOne("I am a String");
			
		}
	
	/*//2. Parameters with different sequence of a data types
	
		public void methodOne(int a, String b){
			
	        System.out.println(b);
	    }
	    
		public void methodOne(int a, double b)
	    {
			double c = (double)(a+b);
			
			System.out.println(c);
	    }	
		
		public void methodOne(double a, int b)
	    {
			double c = (double)(a+b);
			
			System.out.println(c);
	    }	
		
		public static void main(String[] args) {

			MethodOverloading1 obj = new MethodOverloading1();
			
			obj.methodOne(1, 0.5);
			
			obj.methodOne(1.5, 2);
			
		}*/
		
		/*//3. Different number of parameters

		public class MethodOverloadingDiffParameters {

			public void methodOne(int a){
		        System.out.println("Single Argument Method");
		    }
		    
			public void methodOne(int a, int b)
		    {
		       System.out.println("Multiple Argument Method");
		    }	
			
			public static void main(String[] args) {

				MethodOverloadingDiffParameters obj = new MethodOverloadingDiffParameters();
				
				obj.methodOne(10);
				obj.methodOne(10, 20);
				
			}
		}*/
}