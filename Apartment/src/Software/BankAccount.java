package Software;

public class BankAccount {
	
	//Variables
		private String name;
		private long accountNumber;
		private long routingNumber;
		
		//Constructors
		public BankAccount () {
			name = "NULL";
			accountNumber = 0;
			routingNumber = 0;
		}
		
		//Check account number
		public boolean checkAccountNumber(long i) {
			long j = (999999999 * 10) + 9;
			if (i < 1000000000 || i > j) {
				return false;
			}
			else {
				return true;
			}	
		}
		
		//Check routing number
		public boolean checkRoutingNumber(int i) {
			if (i < 100000000 || i > 999999999) {
				return false;
			}
			return true;
		}

		//Getter for account number
		public long getAccountNumber() {
			return this.accountNumber;
		}

		//Setter for account number
		public void setAccountNumber(int accountNumber) {
			if (this.checkAccountNumber(accountNumber)) {
				this.accountNumber = accountNumber;
			}
			else {
				System.out.println("Invalid Account Number.");
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

		//Getter for routing number
		public long getRoutingNumber() {
			return this.routingNumber;
		}

		//Setter for routing number
		public void setRoutingNumber(int routingNumber) {
			if (this.checkRoutingNumber(routingNumber)) {
				this.routingNumber = routingNumber;
			}
			else {
				System.out.println("Invalid Routing Number.");
			}
		}
}
