package People;

import java.util.ArrayList;

import Hardware.Unit;
import Software.BankAccount;
import Software.BankCard;
import Software.Maintenance;
import Software.Payment;

public class CurrResident extends User {
	
	//Variables
		private Unit unit;
		private BankCard bankCard;
		private BankAccount bankAccount;
		private ArrayList<Payment> paymentList;
		private String[] paymentType = {"Card Payment", "eCheckPayment"};

		//Constructors
		public CurrResident () {
			unit = new Unit();
			bankCard = new BankCard();
			bankAccount = new BankAccount();
			paymentList = new ArrayList<Payment>();
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
		
		public ArrayList<Payment> getPaymentList() {
			return this.paymentList;
		}
		
		public void addPayment(Payment p) {
			this.paymentList.add(p);
		}
		
		public void printPaymentHistory() {
			System.out.println("Payment History: ");
			for(Payment p : this.paymentList) {
				System.out.println(this.paymentType[p.getMethod()-1] + ": $" + p.getAmount());
			}
		}
}
