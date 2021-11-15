package People;

import Hardware.Unit;
import Software.BankAccount;
import Software.BankCard;
import Software.Maintenance;

public class CurrResident extends User {
	
	//Variables
		private Unit unit;
		private BankCard bankCard;
		private BankAccount bankAccount;

		//Constructors
		public CurrResident () {
			unit = new Unit();
			bankCard = new BankCard();
			bankAccount = new BankAccount();
		}

		//Getter for unit
		public Unit getUnit() {
			return this.unit;
		}

		//Setter for unit
		public void setUnit(Unit unit) {
			this.unit = unit;
		}

		//Getter for BankCard
		public BankCard getBankcard() {
			return this.bankCard;
		}

		//Setter for bankCard
		public void setBankcard(BankCard b) {
			this.bankCard = b;
		}

		//Getter for BankAccount
		public BankAccount getBankaccount() {
			return this.bankAccount;
		}

		//Setter for BankAccount
		public void setBankaccount(BankAccount b) {
			this.bankAccount = b;
		}
		
		public void addMaintenance(Maintenance m) {
			this.unit.addMaintenance(m);
		}
}
