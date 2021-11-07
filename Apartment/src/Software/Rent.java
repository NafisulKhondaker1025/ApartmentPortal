package Software;

import java.util.ArrayList;

import Hardware.Unit;

public class Rent {

	//Variables
	private double monthlyRent;
	private double waterBill;
	private double disposalBill;
	private double lateFine;
	private boolean islate;
	private Unit unit;
	public ArrayList<Integer> paymentSchedule;

	//Constructor
	public Rent() {
		this.setDisposalBill(2.0);
		this.setIslate(true);
		this.setLateFine(40.0);
		this.setMonthlyRent(400.0);
		this.setWaterBill(50.0);
		this.paymentSchedule = new ArrayList<Integer>();
		this.setUnit(null);
	}

	//Geeter for Monthly Rent
	public double getMonthlyRent() {
		return monthlyRent;
	}

	//Setter for monthly Rent
	public void setMonthlyRent(double monthlyRent) {
		this.monthlyRent = monthlyRent;
	}

	//Getter for water bill
	public double getWaterBill() {
		return waterBill;
	}

	//Setter for water bill
	public void setWaterBill(double waterBill) {
		this.waterBill = waterBill;
	}

	//Getter for Disposal Bill
	public double getDisposalBill() {
		return disposalBill;
	}

	//Setter for Disposal Bill
	public void setDisposalBill(double disposalBill) {
		this.disposalBill = disposalBill;
	}

	//Getter for LateFine
	public double getLateFine() {
		return lateFine;
	}

	//Setter for LateFine
	public void setLateFine(double lateFine) {
		this.lateFine = lateFine;
	}

	//Booleen for isLate
	public boolean isIslate() {
		return islate;
	}

	//Setter for isLate
	public void setIslate(boolean islate) {
		this.islate = islate;
	}

	//Getter for unit
	public Unit getUnit() {
		return unit;
	}

	//Setter for Unit
	public void setUnit(Unit unit) {
		this.unit = unit;
	}

	//Add payment
	public void addPaymentDate(int i) {	
	}	

	//Get Payment
	public ArrayList<Integer> getPaymentSchedule() {
		return paymentSchedule;	
	}

	//Get the next PAYMENT dATE
	public ArrayList<Integer> getNextPaymentDate() {
		return paymentSchedule;	
	}

	//GET THE TOTAL RENT
	public double totalRent (int total) {
		return total;	
	}



}
