package week3.day1day2;

public class StringProgram {
	public static void main(String[] args) {
		String selenium = "changeme";
		char[] arrayString = selenium.toCharArray();
		String expected = "";
		for(int i=0; i<arrayString.length; i++ ) {
			if (i%2 != 0) {
				arrayString[i] = Character.toUpperCase(arrayString[i]);
				System.out.println();
			}
			expected = expected + arrayString[i];
		}
		System.out.println(expected);

}
}