package inheritance;

public class Toofan extends Car {

	public static void main(String args[]) {
		
		Toofan obj = new Toofan();
		
		obj.twoRowSeats();
		
		obj.stearing();
		
		obj.Wheals();
	}
	
    public void twoRowSeats() {
		
		System.out.println("Toofan has 4 rows Seats");
	}
}
