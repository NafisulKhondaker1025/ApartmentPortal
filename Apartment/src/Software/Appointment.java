package Software;

import People.PotResident;

public class Appointment {

	//Variables
	private int dateTime;
	private String description;
	private PotResident potenResident;
	
	//Constructors
	public Appointment () {
		this.setDateTime(5);
		this.setDescription("unknown");
		this.setPotenResident(null);
	}
	
	//Add Description for the Appointment
	public void addDescription (String s) {
		
	}

	//Getter for dateTime
	public int getDateTime() {
		return dateTime;
	}

	//Setter for dateTime
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

	//Getter for potential resident
	public PotResident getPotenResident() {
		return potenResident;
	}

	//Setter for potential Resident
	public void setPotenResident(PotResident potenResident) {
		this.potenResident = potenResident;
	}

}