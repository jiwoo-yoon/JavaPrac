package practice.cardcompany;

public class Company {

	private static int serialNum = 10000;

	private Company() {}
	
	private static Company instance;
	
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
	
	public Card createCard() {
		++serialNum;
		return new Card(serialNum);
	}
	
	
	
	
} // end class