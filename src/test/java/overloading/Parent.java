package overloading;

public class Parent {
	
	public void methodOne(int a){
		
        System.out.println(a);
    }
    
	public String methodOne(String a)
    {
       System.out.println(a);
       
	   return a;
    }	

}
