package interface_package;

public interface InterfaceTwo extends InterfaceOne {
	
    public default void method_A() {
		
		System.out.println("New default method is added in interfaceTwo");
	}
	
	public static void method_B() {
		
		System.out.println("Static methods is added in interface");
	}
	
	public void method_C();
	
	public void method_D();

}
