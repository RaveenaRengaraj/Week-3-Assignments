package week3.day1day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElement {
	public static void main(String args[]) {
	List<Integer> list = new ArrayList<>();
	list.add(1);
	list.add(2);
	list.add(4);
	list.add(10);
	list.add(6);
	list.add(8);
	Collections.sort(list);
	for (int i=0; i<list.size()-1; i++) {
		if (list.get(i+1) != list.get(i) + 1) {
			int missing = list.get(i) + 1;
			System.out.println("The missing element is " + missing);
		}
	}
}

}
