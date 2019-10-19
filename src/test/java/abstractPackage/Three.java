package abstractPackage;

public class Three extends One {
	
	@Override
	void studentName() {
		
		System.out.println("Student Name is Reddy");
	}

	@Override
	void studentRollnumber() {
		
		System.out.println("Student RollNumber is 786");
	}

	public static void main(String args[]) {
		
		Three obj = new Three();
		
		obj.Students();
		
		obj.collegeName();
		
		obj.studentName();
		
		obj.studentRollnumber();
	}

}
