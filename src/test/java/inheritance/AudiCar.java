package inheritance;

public class AudiCar extends Car {
	
    public static void main(String args[]) {
		
		AudiCar obj = new AudiCar();
    	
    	//Car obj = new Car();
		
		obj.twoRowSeats();
		
		obj.stearing();
		
		obj.Wheals();
	}
	
    public void twoRowSeats() {
		
		System.out.println("Audi has 2 rows Seats");
	}

}
