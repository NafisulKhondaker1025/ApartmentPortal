package Software;

import Hardware.Building;
import Hardware.Unit;

public class Maintenance {

	//Variables
	private int dateTime;
	private String description;
	private Building building;
	private Unit unit;
	
	//Constructor
	public Maintenance() {
		this.setUnit(null);
		this.setDateTime(2);
		this.setDescription("Unknwon");
		this.setBuilding(null);
	}

	//Getter for time
	public int getDateTime() {
		return dateTime;
	}

	//Setter for time
	public void setDateTime(int dateTime) {
		this.dateTime = dateTime;
	}

	//Getter for description
	public String getDescription() {
		return description;
	}

	//Setter for description
	public void setDescription(String description) {
		this.description = description;
	}

	//Getter for building
	public Building getBuilding() {
		return building;
	}

	//Setter for building
	public void setBuilding(Building building) {
		this.building = building;
	}

	//Getter for Unit
	public Unit getUnit() {
		return unit;
	}

	//Setter for unit
	public void setUnit(Unit unit) {
		this.unit = unit;
	}
}

