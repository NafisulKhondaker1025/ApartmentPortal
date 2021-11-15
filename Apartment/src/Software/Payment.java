package Software;

import People.CurrResident;

public class Payment {
	
	//Variables
		private double amount;
		private int method;
		private BankCard bankCard;
		private BankAccount bankAccount;
		private CurrResident currResident;
		
		//Constructor
		public Payment() {
			amount = 0;
			method = 0;
			bankCard = new BankCard();
			bankAccount = new BankAccount();
			currResident = new CurrResident();
		}

		//Getter for Amount
		public double getAmount() {
			return this.amount;
		}

		//Setter for Amount
		public void setAmount(double amount) {
			this.amount = amount;
		}

		//Getter for Method
		public int getMethod() {
			return this.method;
		}

		//Setter for Method 
		public void setMethod(int method) {
			this.method = method;
		}

		//Getter for BankCard
		public BankCard getBankCard() {
			return this.bankCard;
		}

		//Setter for BankAccount
		public void setBankCard(BankCard bankCard) {
			this.bankCard = bankCard;
		}

		//Getter for BankAccount
		public BankAccount getBanckAccount() {
			return this.bankAccount;
		}

		//Setter for BankAccount
		public void setBankAccount(BankAccount banckAccount) {
			this.bankAccount = banckAccount;
		}

		//Getter for currResident
		public CurrResident getCurrResident() {
			return this.currResident;
		}

		//Setter for currResident
		public void setCurrResident(CurrResident currResident) {
			this.currResident = currResident;
		}
}
