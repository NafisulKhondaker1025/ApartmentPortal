package Software;

public class BankAccount {

	//Variables
	private String name;
	private int accountNumber;
	private int routingNumber;
	
	//Constructors
	public BankAccount () {
		name = "NULL";
		accountNumber = 0;
		routingNumber = 0;
	}
	
	//Check account number
	public boolean checkAccountNumber(int i) {
		return false;	
	}
	
	//Check routing number
	public boolean checkRoutingNumber(int i) {
		return false;
	}

	//Getter for account number
	public int getAccountNumber() {
		return this.accountNumber;
	}

	//Setter for account number
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	//Getter for name
	public String getName() {
		return this.name;
	}

	//Setter for name
	public void setName(String name) {
		this.name = name;
	}

	//Getter for routing number
	public int getRoutingNumber() {
		return this.routingNumber;
	}

	//Setter for routing number
	public void setRoutingNumber(int routingNumber) {
		this.routingNumber = routingNumber;
	}
}
