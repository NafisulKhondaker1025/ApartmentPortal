package Software;

import People.CurrResident;

public class Payment {

	//Variables
	private double amount;
	private int method;
	private BankCard bankCard;
	private BankAccount banckAccount;
	private CurrResident currResident;
	
	//Constructor
	public Payment() {
		this.setAmount(500.0);
		this.setBanckAccount(null);
		this.setBankCard(null);
		this.setCurrResident(null);
		this.setMethod(5);
	}

	//Getter for Amount
	public double getAmount() {
		return amount;
	}

	//Setter for Amount
	public void setAmount(double amount) {
		this.amount = amount;
	}

	//Getter for Method
	public int getMethod() {
		return method;
	}

	//Setter for Method 
	public void setMethod(int method) {
		this.method = method;
	}

	//Getter for BankCard
	public BankCard getBankCard() {
		return bankCard;
	}

	//Setter for BankAccount
	public void setBankCard(BankCard bankCard) {
		this.bankCard = bankCard;
	}

	//Getter for BankAccount
	public BankAccount getBanckAccount() {
		return banckAccount;
	}

	//Setter for BankAccount
	public void setBanckAccount(BankAccount banckAccount) {
		this.banckAccount = banckAccount;
	}

	//Getter for currResident
	public CurrResident getCurrResident() {
		return currResident;
	}

	//Setter for currResident
	public void setCurrResident(CurrResident currResident) {
		this.currResident = currResident;
	}
}
