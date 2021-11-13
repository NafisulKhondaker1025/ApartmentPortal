package Hardware;

import People.CurrResident;

public class StudioUnit {

	//Variables
	private CurrResident resident;

	//Constructor
	public StudioUnit() {
		resident = new CurrResident();
	}
	
	//Getter for Resident
	public CurrResident getCurrResident() {
		return this.resident;
	}

	//Setter for resident
	public void addCurrResident(CurrResident resident) {
		this.resident = resident;
		//detect conflict first
	}
	
	//DetectConflict
	public void detectConflict(CurrResident c) {
		//implement the function here
	}
	 
}


