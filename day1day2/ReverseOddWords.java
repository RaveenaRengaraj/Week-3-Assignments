package week3.day1day2;

public class ReverseOddWords {
	public static void main(String args[]) {
		String test = "I am a software tester";
		String[] words = test.split(" ");
		test = "";
		for (int i=0; i<words.length; i++) {
			if (i%2 != 0 ) {
				String temp = "";
				char[] charArray = words[i].toCharArray();
				for (int j=charArray.length-1; j>=0; j--) {
					temp = temp + charArray[j];
				}
				words[i] = temp;
			}
			test = test + words[i] + " ";
		}
		System.out.println(test);
	}
}