package collectionsPackage;

import java.util.ArrayList;
import java.util.Collections;

public class OwnClassObject {
	
	int eno;
	
	String ename;
	
	OwnClassObject(int eno, String ename){
		
		this.eno = eno;
		
		this.ename = ename;
	}
	
	public String toString() {
		
		return eno+":"+ename;
	}

	public static void main(String[] args) {
		
		OwnClassObject obj = new OwnClassObject(100,"Kirru");
		
		System.out.println(obj);
		
        ArrayList<OwnClassObject> al = new ArrayList<OwnClassObject>();
		
		al.add(new OwnClassObject(10,"Kirru"));
		
		al.add(new OwnClassObject(0,"Reddy"));
		
		al.add(new OwnClassObject(15,"Remo"));
		
		al.add(new OwnClassObject(5,"Raju"));
		
		al.add(new OwnClassObject(20,"King"));
		
        System.out.println("Before Sorting :"+al);
		
		Collections.sort(al,(e1,e2)->(e1.eno<e2.eno)?-1:(e1.eno>e2.eno)?1:0);
		
		System.out.println("After Sorting :"+al);
	}
}
