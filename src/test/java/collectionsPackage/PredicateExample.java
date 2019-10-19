package collectionsPackage;

import java.util.function.Predicate;

public class PredicateExample {
	
	public static void main(String[] args) {
	
	String[] str = {"Kirru","Reddy","Katrina","Kajal","Aarti","Sriya","Charmi"};
	
	Predicate<String> satrtWithK = s->s.charAt(0)=='K';
	
	System.out.println("The names starts with k are:");
	
	for(String s: str) {
		
		if(satrtWithK.test(s)) {
			
			System.out.println(s);
		}
	}
	
	}
}
