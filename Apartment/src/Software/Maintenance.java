package Software;

import Hardware.Unit;

public class Maintenance {
	
	//Variables
		private String description;
		private Unit unit;
		
		//Constructor
		public Maintenance() {
			description = "NULL";
			unit = new Unit();
		}

		//Getter for description
		public String getDescription() {
			return this.description;
		}

		//Setter for description
		public void setDescription(String description) {
			this.description = description;
		}

		//Getter for Unit
		public Unit getUnit() {
			return this.unit;
		}

		//Setter for unit
		public void setUnit(Unit unit) {
			this.unit = unit;
		}
}
