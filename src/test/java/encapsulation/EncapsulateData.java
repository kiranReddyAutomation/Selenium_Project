package encapsulation;

public class EncapsulateData {

	   private String Empname;
	   private int Empage;
	 
	   public int getEmpAge() {
		   
	      return Empage;
	   }
	 
	   public String getEmpname() {
		   
	      return Empname;
	   }
	 
	      public void setAge( int newAge) {
	    	  
	      Empage = newAge;
	   }
	 
	   public void setName(String newName) {
		   
	      Empname = newName;
	   }
	 
	   public static void main(String args[]) {
		   
	      EncapsulateData en = new EncapsulateData();
	      
	      en.setName("Prashant");
	      
	      en.setAge(33);
	      
	      System.out.print("Name : " + en.getEmpname() + " & " +" Age : " + en.getEmpAge());
	   }
}
