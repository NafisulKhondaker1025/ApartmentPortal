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
	private BankCard bankcard;
	private BankAccount bankaccount;

	//Constructors
	public CurrResident () {
		this.setBankaccount(null);
		this.setBankcard(null);
		this.setBuilding(null);
		this.roommateList = new ArrayList<CurrResident>();
		this.setUnit(null);
	}

	//Getter for building
	public Building getBuilding() {
		return building;
	}

	//Setter for building
	public void setBuilding(Building building) {
		this.building = building;
	}

	//Getter for unit
	public Unit getUnit() {
		return unit;
	}

	//Setter for unit
	public void setUnit(Unit unit) {
		this.unit = unit;
	}

	//Detect conflict in unit
	public boolean detectConflict (Unit u) {
		return false;
	}

	//Getter for roommate
	public ArrayList<CurrResident> getRoommateList() {
		return roommateList;
	}

	//Add Roomate List
	public void addRoomate(CurrResident c) {

	}

	//Getter for BankCard
	public BankCard getBankcard() {
		return bankcard;
	}

	//Setter for bankCad
	public void setBankcard(BankCard bankcard) {
		this.bankcard = bankcard;
	}

	//Getter for BankAccount
	public BankAccount getBankaccount() {
		return bankaccount;
	}

	//Setter for BankAccount
	public void setBankaccount(BankAccount bankaccount) {
		this.bankaccount = bankaccount;
	}


}
