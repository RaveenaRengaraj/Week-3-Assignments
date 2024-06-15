package week3.day1day2;

public class ExecuteTestData {
	
	public static void main(String[] args) {
		TestData testData = new TestData();
		testData.enterCredentials();
		testData.navigateToHomePage();
		
		LoginTestData loginTestData = new LoginTestData();
		loginTestData.enterCredentials();
		loginTestData.enterUsername();
		loginTestData.enterPassword();
		loginTestData.navigateToHomePage();
	}

}