package Hardware;

import java.util.ArrayList;

public class Building {
	
	//Variables
		private int iD;
		private String address;
		private ArrayList<Unit> unitList;
		
		//Constructor
		public Building() {
			iD = 0;
			address = "NULL";
			unitList = new ArrayList<Unit>();
		}

		//Getter for Building ID
		public int getiD() {
			return this.iD;
		}

		//Setter for Building ID
		public void setiD(int iD) {
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
			u.setBuilding(this);
		}
		
		public ArrayList<Unit> getUnitList() {
			return this.unitList;
		}
		
		public void printUnits() {
			System.out.println("Units inside Building " + this.iD + ":");
			for (Unit u : this.unitList) {
				if (u instanceof RegularUnit) {
					System.out.println("Regular Unit " + u.number + " Bedrooms: " + ((RegularUnit)u).getNumBeds() + " Bathrooms: " + ((RegularUnit)u).getNumBaths() + " Rent: " + u.getRent().getMonthlyRent() + " Is fully occupied? " + u.isOccupied());
				}
				else if (u instanceof StudioUnit) {
					System.out.println("Regular Unit " + u.number + " Rent: " + u.getRent().getMonthlyRent() + " Is fully occupied? " + u.isOccupied());
				}
			}
		}
}
