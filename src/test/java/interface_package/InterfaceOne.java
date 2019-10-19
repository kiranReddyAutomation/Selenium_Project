package interface_package;

public interface InterfaceOne {
	
	public default void methodOne() {
		
		System.out.println("New default method is added in interface");
	}
	
	public static void methodTwo() {
		
		System.out.println("Static methods is added in interface");
	}
	
	public void methodThree();
	
	public void methodFour();

}
