package Software;

import Hardware.Unit;

public class Rent {
	
	//Variables
		private double monthlyRent;
		private double waterBill;
		private double disposalBill;
		private double lateFine;
		private boolean isLate;
		private Unit unit;

		//Constructor
		public Rent() {
			monthlyRent = 0;
			waterBill = 0;
			disposalBill = 0;
			lateFine = 0;
			isLate = false;
			unit = new Unit(); 
		}

		//Getter for Monthly Rent
		public double getMonthlyRent() {
			return this.monthlyRent;
		}

		//Setter for monthly Rent
		public void setMonthlyRent(double monthlyRent) {
			this.monthlyRent = monthlyRent;
		}

		//Getter for water bill
		public double getWaterBill() {
			return this.waterBill;
		}

		//Setter for water bill
		public void setWaterBill(double waterBill) {
			this.waterBill = waterBill;
		}

		//Getter for Disposal Bill
		public double getDisposalBill() {
			return this.disposalBill;
		}

		//Setter for Disposal Bill
		public void setDisposalBill(double disposalBill) {
			this.disposalBill = disposalBill;
		}

		//Getter for LateFine
		public double getLateFine() {
			return this.lateFine;
		}

		//Setter for LateFine
		public void setLateFine(double lateFine) {
			this.lateFine = lateFine;
		}

		//getter for isLate
		public boolean getIsLate() {
			return this.isLate;
		}

		//Setter for isLate
		public void setIslate(boolean isLate) {
			this.isLate = isLate;
		}

		//Getter for unit
		public Unit getUnit() {
			return this.unit;
		}

		//Setter for Unit
		public void setUnit(Unit unit) {
			this.unit = unit;
		}

		//GET THE TOTAL RENT
		public double getTotalRent() {
			if (this.isLate) {
				return (this.disposalBill + this.lateFine + this.monthlyRent + this.waterBill);
			}
			else {
				return (this.disposalBill + this.monthlyRent + this.waterBill);
			}
		}
}
