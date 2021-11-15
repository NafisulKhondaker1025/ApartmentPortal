package Hardware;

import People.CurrResident;

public class StudioUnit extends Unit {
	
	//Variables

		//Constructor
		public StudioUnit() {

		}
		
		//Getter for Resident
		public CurrResident getCurrResident() {
			return this.residentList.get(0);
		}

		//Setter for resident
		public void addCurrResident(CurrResident resident) {
			if (this.occupied) {
				System.out.println("This unit is already occupied.");
			}
			else {
				this.residentList.add(resident);
				resident.setUnit(this);
				this.setOccupied();
				System.out.println("Resident was successfully added to Unit.");
			}
			return;
		}
		
		public void setOccupied() {
			if (this.residentList.size() < 1) {
				this.occupied = false;
			}
			else {
				this.occupied = true;
			}
			return;
		}
}
