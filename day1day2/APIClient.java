package week3.day1day2;

public class APIClient {
	public void sendRequest(String endpoint) {
		System.out.println("Method with one argument");
	}
	
	public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
		System.out.println("Method with three arguments");
	}
	
	public static void main(String args[]) {
		APIClient apiClient = new APIClient();
		apiClient.sendRequest("one");
		apiClient.sendRequest("one", "two", false);
	}


}
