package encapsulation;

public class Encapsulation {
	
	private String name;
	   private String id;
	   private int age;
	 
	   // Class getters   
	 
	   public int getAge() {
	      return age;
	   }
	 
	   public String getName() {
	      return name;
	   }
	 
	   public String getIdNum() {
	      return id;
	   }
	 
	   // Class setters
	   public void setAge( int newAge) {
	      age = newAge;
	   }
	 
	   public void setName(String newName) {
	      name = newName;
	   }
	 
	   public void setIdNum( String newId) {
	      id = newId;
	   }

	   public static void main(String args[]) {
		   
		   Encapsulation obj = new Encapsulation();
		   
		   obj.setAge(34);
		   
		   obj.setName("Kiran Reddy");
		   
		   obj.setIdNum("420");
		   
		   System.out.println(obj.getAge());
		   
		   System.out.println(obj.getName());
		   
		   System.out.println(obj.getIdNum());
		   
		   
	   }
}
