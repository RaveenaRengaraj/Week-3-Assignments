package week3.day1day2;

public class RemoveDuplicateWords {
	 public static void main(String[] args) {
			int count = 0;
			String text = "We learn Java basics as part of java sessions in java week1";
			String[] splittedText = text.split(" ");
			text = "";
			for (int i=0; i<splittedText.length; i++) {
				for (int j=0; j<i; j++) {
					if (splittedText[i].equalsIgnoreCase(splittedText[j])) {
						splittedText[i] = "";
						break;
					}
				}
				text = text + splittedText[i] + " ";
			}
			System.out.println(text);

		
 }	}
