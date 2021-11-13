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
	private ArrayList<Maintenance> maintenanceList;
	
	//Constructor
	public Unit() {
		number = 0;
		building = new Building();
		rent = new Rent();
		occupied = false;
		maintenanceList = new ArrayList<Maintenance>();
	}

	//Getter for number
	public int getNumber() {
		return this.number;
	}

	//Setter for number
	public void setNumber(int number) {
		this.number = number;
	}

	//Getter for building
	public Building getBuilding() {
		return this.building;
	}

	//Setter for building
	public void setBuilding(Building building) {
		this.building = building;
	}

	//Getter for rent
	public Rent getRent() {
		return this.rent;
	}

	//Setter for rent
	public void setRent(Rent rent) {
		this.rent = rent;
	}

	//getter for boolean isOccupied
	public boolean isOccupied() {
		return this.occupied;
	}

	//Setter for boolean isOccupied
	public void setOccupied(boolean occupied) {
		this.occupied = occupied;
	}
	
	public void addMaintenance(Maintenance m) {
		this.maintenanceList.add(m);
	}
	
	public ArrayList<Maintenance> getMaintenanceList() {
		return this.maintenanceList;
	}
}

