package People;

import java.util.ArrayList;

import Hardware.Building;
import Hardware.Unit;
import Software.BankAccount;
import Software.BankCard;

public class CurrResident {

	//Variables
	private Building building;
	private Unit unit;
	private ArrayList<CurrResident> roommateList;
	private BankCard bankCard;
	private BankAccount bankAccount;

	//Constructors
	public CurrResident () {
		building = new Building();
		unit = new Unit();
		roommateList = new ArrayList<CurrResident>();
		bankCard = new BankCard();
		bankAccount = new BankAccount();
	}

	//Getter for building
	public Building getBuilding() {
		return this.building;
	}

	//Setter for building
	public void setBuilding(Building building) {
		this.building = building;
	}

	//Getter for unit
	public Unit getUnit() {
		return this.unit;
	}

	//Setter for unit
	public void setUnit(Unit unit) {
		this.unit = unit;
	}

	//Detect conflict in unit
	private boolean detectConflict (Unit u) {
		//implement this function
		return false;
	}
	
	//Getter for roommate
	public ArrayList<CurrResident> getRoommateList() {
		return roommateList;
	}

	//Add Roomate
	public void addRoomate(CurrResident c) {
		this.roommateList.add(c);
		//detect conflict first;
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


}
