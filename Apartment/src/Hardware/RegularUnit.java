package Hardware;

import java.util.ArrayList;

import People.CurrResident;

public class RegularUnit {

	//Varaibles
	private int numBeds;
	private int numBaths;
	private int maxOccupants;
	private ArrayList<CurrResident> currResidentList;

	//Constructor
	public RegularUnit() {
		currResidentList = new ArrayList<CurrResident>();
		maxOccupants = 0;
		numBaths = 0;
		numBeds = 0;
	}

	//Getter for numBeds
	public int getNumBeds() {
		return this.numBeds;
	}

	//Setter for numBeds
	public void setNumBeds(int numBeds) {
		this.numBeds = numBeds;
	}

	//Getter for numBath
	public int getNumBaths() {
		return this.numBaths;
	}

	//Setter for numBaths
	public void setNumBaths(int numBaths) {
		this.numBaths = numBaths;
	}

	//Getter of max Occupants
	public int getMaxOccupants() {
		return this.maxOccupants;
	}

	//Setter of max Occupants
	public void setMaxOccupants(int maxOccupants) {
		this.maxOccupants = maxOccupants;
	}

	//Getter for current resident
	public ArrayList<CurrResident> getCurrResidentList() {
		return currResidentList;
	}

	//Add a resident (Current)
	public void addCurrResident(CurrResident c) {
		this.currResidentList.add(c);
		//check for conflict
	}

	//Detect Conflict
	public void detectConflict(CurrResident c) {
		//implement later
	}


}
