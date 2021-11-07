package Hardware;

import Software.Maintenance;

import java.util.ArrayList;


public class Building {

	//Variables
	private char iD;
	private String address;
	public ArrayList<Unit> unitList;
	public ArrayList<Maintenance> maintenaceList;
	public ArrayList<Integer> maintencanceSchedule;
	
	//Constructor
	public Building() {
	this.setAddress("unknown");
	this.setiD((char) 0);
	this.maintenaceList = new ArrayList<Maintenance>();
	this.maintencanceSchedule = new ArrayList<Integer>();
	}

	//Getter for Building ID
	public char getiD() {
		return iD;
	}

	//Setter for Building ID
	public void setiD(char iD) {
		this.iD = iD;
	}

	//Getter for Address
	public String getAddress() {
		return address;
	}

	//Setter of Address
	public void setAddress(String address) {
		this.address = address;
	}
	
	//Add Unit
	public void addUnit(Unit u) {
		
	}
	
	//Add Maintenance
	public void addMaintencance(Maintenance m) {
		
	}
	
	//Detect Maintainance Conflict
	public void detectConflict(Maintenance m) {
		
	}
	
}
