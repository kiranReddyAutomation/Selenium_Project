package overloading;

public class ChildClass1 extends Parent{
	
    public int methodOne(int a,int b){
		
    	int c = a+b;
    	
        System.out.println(c);
        
		return c;
    }
    
    public static void main(String [] args){
    	
    	ChildClass1 obj = new ChildClass1();
    	
    	obj.methodOne(100, 200);
    	
    	obj.methodOne("This is Kiran Reddy");
    }

}
