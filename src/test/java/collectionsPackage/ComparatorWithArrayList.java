package collectionsPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorWithArrayList implements Comparator<Integer> {

	
	public int compare(Integer I1, Integer I2) {
		
		return (I1>I2)?-1:(I1<I2)?1:0;
	}

    public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(10);
		al.add(0);
		al.add(15);
		al.add(5);
		al.add(20);
		
		al.forEach((x)->
		{
		System.out.println(x);	
		});
		
		System.out.println("Before Sorting :"+al);
		
		Collections.sort(al, new ComparatorWithArrayList());
		
		System.out.println("After Sorting :"+al);
	}
}
