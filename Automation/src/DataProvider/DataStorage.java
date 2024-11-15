package DataProvider;

import org.testng.annotations.DataProvider;

public class DataStorage {
	@DataProvider
	public String[][]  loginData() {
		String data[] []= {
				{"admin","admin"},
				{"admin","ad"},
				{"ad","admin"},
		       {"ad","ad"}
		};
		return data;
	}
		@DataProvider
		public String[][] registerData() {
		String registerData[][]= {
				{"john","smith","john123@gmail.com","john@1234","john@1234"},
				{"sam","smith","john123@gmail.com","john@1234","john@1234"},
				{"john","smith","john123@gmail.com","john@1234","john@1234"},
				{"john","smith","john123@gmail.com","john@1234","john@1234"}
		};
		return registerData;
		}
	}

