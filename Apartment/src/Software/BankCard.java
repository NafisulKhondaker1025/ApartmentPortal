package Software;

public class BankCard {
	
	//Variables
		private String name;
		private long cardNumber;
		private String expiryDate;
		private int cvv;
		
		//Constructors
		public BankCard() {
			name = "NULL";
			cardNumber = 0;
			expiryDate = "NULL";
			cvv = 0;
		}
		
		//Check card number method
		public boolean checkCardNumber(long i) {
			long j = (999999999 * 10000000) + 9;
			long k = (100000000 * 100000000);
			if (i < k || i > j) {
				return false;
			}
			else {
				return true;
			}	
		}
		
		//Check cvv
		public boolean checkCvv(int i) {
			if (i < 100 || i > 999) {
				return false;
			}
			else {
				return true;
			}		
		}

		//Getter for name
		public String getName() {
			return this.name;
		}

		//Setter for name
		public void setName(String name) {
			this.name = name;
		}

		//Getter for Card number
		public long getCardNumber() {
			return this.cardNumber;
		}

		//Setter for card number
		public void setCardNumber(long cardNumber) {
			if (this.checkCardNumber(cardNumber)) {
				this.cardNumber = cardNumber;
			}
			else {
				System.out.println("Invalid Card Number.");
			}
		}

		//Getter for expiry date
		public String getExpiryDate() {
			return this.expiryDate;
		}

		//Setter for expiry date
		public void setExpiryDate(String expiryDate) {
			this.expiryDate = expiryDate;
		}

		//Getter for cvv
		public int getCvv() {
			return this.cvv;
		}

		//Setter for cvv
		public void setCvv(int cvv) {
			if (this.checkCvv(cvv)) {
				this.cvv = cvv;
			}
			else {
				System.out.println("Invalid CVV.");
			}
		}
}
