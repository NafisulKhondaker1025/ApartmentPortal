package Hardware;

import java.util.ArrayList;

import People.CurrResident;

public class RegularUnit {

	//Varaibles
	private int numBeds;
	private int numBaths;
	private int maxOccupants;
	public ArrayList<CurrResident> currResidentList;

	//Constructor
	public RegularUnit() {
		this.currResidentList = new ArrayList<CurrResident>();
		this.setMaxOccupants(100);
		this.setNumBaths(100);
		this.setNumBeds(100);
	}

	//Getter for numBeds
	public int getNumBeds() {
		return numBeds;
	}

	//Setter for numBeds
	public void setNumBeds(int numBeds) {
		this.numBeds = numBeds;
	}

	//Getter for numBath
	public int getNumBaths() {
		return numBaths;
	}

	//Setter for numBaths
	public void setNumBaths(int numBaths) {
		this.numBaths = numBaths;
	}

	//Getter of max Occupants
	public int getMaxOccupants() {
		return maxOccupants;
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
		//HELP ME
	}

	//Detect Conflict
	public void detectConflict(CurrResident c) {

	}


}
