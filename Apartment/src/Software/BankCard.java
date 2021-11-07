package Software;

public class BankCard {

	//Variables
	private String name;
	private long cardNumber;
	private int expiryDate;
	private int cvv;
	
	//Constructors
	public BankCard() {
		this.setCardNumber(123456789789456123L);
		this.setCvv(444);
		this.setExpiryDate(12/26);
		this.setName("Chase");
	}
	
	//Check card number method
	public boolean checkCardNumber(long i) {
		return true;
		
	}
	
	//Check expiration date
	public boolean checkExpiryDate(int  i) {
		return true;
		
	}
	
	//Check cvv
	public boolean checkCvv(int i) {
		return true;
		
	}

	//Getter for name
	public String getName() {
		return name;
	}

	//Setter for name
	public void setName(String name) {
		this.name = name;
	}

	//Getter for Card number
	public long getCardNumber() {
		return cardNumber;
	}

	//Setter for card number
	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}

	//Getter for expiry date
	public int getExpiryDate() {
		return expiryDate;
	}

	//Setter for expiry date
	public void setExpiryDate(int expiryDate) {
		this.expiryDate = expiryDate;
	}

	//Getter for cvv
	public int getCvv() {
		return cvv;
	}

	//Setter for cvv
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
}
