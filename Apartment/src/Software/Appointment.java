package Software;

import People.PotResident;

public class Appointment {
	
	//Variables
		private int dateTime;
		private String description;
		private PotResident potResident;
		
		//Constructors
		public Appointment () {
			dateTime = 0;
			description = "NULL";
			potResident = new PotResident();
		}
		
		//Add Description for the Appointment
		public void addDescription (String s) {
			this.description = s;
		}

		//Getter for dateTime
		public int getDateTime() {
			return this.dateTime;
		}

		//Setter for dateTime
		public void setDateTime(int dateTime) {
			this.dateTime = dateTime;
		}

		//Getter for description
		public String getDescription() {
			return this.description;
		}

		//Getter for potential resident
		public PotResident getPotenResident() {
			return this.potResident;
		}

		//Setter for potential Resident
		public void setPotenResident(PotResident p) {
			this.potResident = p;
		}
}
