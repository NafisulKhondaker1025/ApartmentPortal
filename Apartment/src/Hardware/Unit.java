package Hardware;

import java.util.ArrayList;

import Software.Maintenance;
import Software.Rent;

public class Unit {

	//Varaibles
	private int number;
	private Building building;
	private Rent rent;
	private boolean occupied;
	public ArrayList<Maintenance> maintanainceList;
	
	//Constructor
	public Unit() {
		this.setBuilding(null);
		this.maintanainceList = null;
		this.setNumber(0);
		this.setOccupied(true);
		this.setRent(null);
	}

	//Getter for number
	public int getNumber() {
		return number;
	}

	//Setter for number
	public void setNumber(int number) {
		this.number = number;
	}

	//Getter for building
	public Building getBuilding() {
		return building;
	}

	//Setter for building
	public void setBuilding(Building building) {
		this.building = building;
	}

	//Getter for rent
	public Rent getRent() {
		return rent;
	}

	//Setter for rent
	public void setRent(Rent rent) {
		this.rent = rent;
	}

	//getter for boolean isOccupied
	public boolean isOccupied() {
		return occupied;
	}

	//Setter for boolean isOccupied
	public void setOccupied(boolean occupied) {
		this.occupied = occupied;
	}
	
}

