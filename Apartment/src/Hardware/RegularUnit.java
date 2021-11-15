package Hardware;

import java.util.ArrayList;
import People.CurrResident;

public class RegularUnit extends Unit {
	
	//Varaibles
		private int numBeds;
		private int numBaths;
		private int maxOccupants;

		//Constructor
		public RegularUnit() {
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
			return this.residentList;
		}

		//Add a resident (Current)
		public void addCurrResident(CurrResident c) {
			if (this.occupied) {
				System.out.println("This unit is already occupied.");
			}
			else {
				this.residentList.add(c);
				c.setUnit(this);
				this.setOccupied();
				System.out.println("Resident was successfully added to Unit.");
			}
			return;
		}
		
		public void setOccupied() {
			if (this.residentList.size() == this.maxOccupants) {
				this.occupied = true;
			}
			else {
				this.occupied = false;
			}
			return;
		}
}
