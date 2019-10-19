package abstractPackage;

public class Two extends One {

	@Override
	void studentName() {
		
		System.out.println("Student Name is Kiran");
	}

	@Override
	void studentRollnumber() {
		
		System.out.println("Student RollNumber is 007");
	}

	public static void main(String args[]) {
		
		Two obj = new Two();
		
		obj.Students();
		
		obj.collegeName();
		
		obj.studentName();
		
		obj.studentRollnumber();
	}
}
