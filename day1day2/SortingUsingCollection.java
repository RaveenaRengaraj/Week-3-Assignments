package week3.day1day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {
	public static void main(String args[]) {
		List<String> array = new ArrayList<>();
		array.add("HCL");
		array.add("Wipro");
		array.add("Aspire Systems");
		array.add("CTS");
		Collections.sort(array);
		for (int i=array.size() -1 ; i>=0; i--) {
			System.out.print(array.get(i) + " ");

		}
	}

}
