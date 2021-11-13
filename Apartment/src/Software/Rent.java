package Software;

import java.util.ArrayList;

import Hardware.Unit;

public class Rent {

	//Variables
	private double monthlyRent;
	private double waterBill;
	private double disposalBill;
	private double lateFine;
	private boolean isLate;
	private Unit unit;
	public ArrayList<Integer> paymentSchedule;

	//Constructor
	public Rent() {
		monthlyRent = 0;
		waterBill = 0;
		disposalBill = 0;
		lateFine = 0;
		isLate = false;
		unit = new Unit();
		paymentSchedule = new ArrayList<Integer>(); 
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
	public boolean paymentIsLate() {
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

	//Add payment
	public void addPaymentDate(int i) {
		this.paymentSchedule.add(i);
	}	

	//Get Payment
	public ArrayList<Integer> getPaymentSchedule() {
		return this.paymentSchedule;	
	}

	//Get the next PAYMENT dATE
	public int getNextPaymentDate() {
		//implement function
		return 0;	
	}

	//GET THE TOTAL RENT
	public double getTotalRent() {
		//add up all the rent categories to get total
		return 0;	
	}



}
