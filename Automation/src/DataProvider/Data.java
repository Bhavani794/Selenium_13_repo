package DataProvider;

import org.testng.annotations.DataProvider;

public class Data {
	@DataProvider
	public String[][]  loginData() {
		String data[] []= {
				{"abhis1234@gmail.com","abhis@1234"},
				{"abhis1234@gmail.com","abhis@123"},
				{"abhis12@gmail.com","abhis@1234"},
		       {"abhis12@gmail.com","abhis34"}
		};
		return data;
	}
}


