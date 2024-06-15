package week3.day1day2;

import java.util.ArrayList;
import java.util.List;

public class IntersectionClass  {
	public static void main(String args[]) {
		int[] array1 =  {3, 2, 11, 4, 6, 7};
		int[] array2 =  {1, 2, 8, 4, 9, 7};
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();

		for (int i=0; i< array1.length; i++) {
			list1.add(array1[i]);
		}
		for (int i=0; i< array2.length; i++) {
			list2.add(array2[i]);
		}
		for (int i=0; i< list2.size(); i++) {
			if (list1.contains(list2.get(i))) {
				System.out.println("The intersection elements are " + list2.get(i));
			}
		}
	}
}
