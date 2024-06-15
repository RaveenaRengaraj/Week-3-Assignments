package week3.day1day2;

public class Elements {
	public static void main(String[] args) {
		WebElement webElement = new WebElement();
		webElement.click();
		
		Button button = new Button();
		button.click();
		button.submit();
		
		TextField textField = new TextField();
		textField.click();
		textField.getText();
		
		CheckBoxButton checkBoxButton = new CheckBoxButton();
		checkBoxButton.click();
		checkBoxButton.clickCheckButton();
		checkBoxButton.submit();
		
		RadioButton radioButton = new RadioButton();
		radioButton.click();
		radioButton.selectRadioButton();
		radioButton.submit();
		
	}


}
