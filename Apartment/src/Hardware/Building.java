package Hardware;

import Software.Maintenance;

import java.util.ArrayList;


public class Building {

	//Variables
	private int iD;
	private String address;
	private ArrayList<Unit> unitList;
	private ArrayList<Maintenance> maintenanceList;
	private ArrayList<Integer> maintenanceSchedule;
	
	//Constructor
	public Building() {
		iD = 0;
		address = "NULL";
		unitList = new ArrayList<Unit>();
		maintenanceList = new ArrayList<Maintenance>();
		maintenanceSchedule = new ArrayList<Integer>();
	}

	//Getter for Building ID
	public int getiD() {
		return this.iD;
	}

	//Setter for Building ID
	public void setiD(char iD) {
		this.iD = iD;
	}

	//Getter for Address
	public String getAddress() {
		return this.address;
	}

	//Setter of Address
	public void setAddress(String address) {
		this.address = address;
	}
	
	//Add Unit
	public void addUnit(Unit u) {
		this.unitList.add(u);
		//check for conflict;
	}
	
	public ArrayList<Unit> getUnitList() {
		return this.unitList;
	}
	
	//Add Maintenance
	public void addMaintencance(Maintenance m) {
		this.maintenanceList.add(m);
		//check for conflict
		//add to schedule
	}
	
	public ArrayList<Maintenance> getMiantenanceList() {
		return this.maintenanceList;
	}
	
	//Detect Maintenance Conflict
	public void detectConflict(Maintenance m) {
		//implement later
	}
	
}
