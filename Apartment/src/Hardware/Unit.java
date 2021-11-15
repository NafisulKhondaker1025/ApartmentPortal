package Hardware;

import java.util.ArrayList;

import People.CurrResident;
import Software.Maintenance;
import Software.Rent;

public class Unit {
	
	//Varaibles
		protected int number;
		protected Building building;
		protected Rent rent;
		protected boolean occupied;
		protected ArrayList<Maintenance> maintenanceList;
		protected ArrayList<CurrResident> residentList; 
		
		//Constructor
		public Unit() {
			number = 0;
			building = new Building();
			rent = null;
			occupied = false;
			maintenanceList = new ArrayList<Maintenance>();
			residentList = new ArrayList<CurrResident>();
		}

		//Getter for number
		public int getNumber() {
			return this.number;
		}

		//Setter for number
		public void setNumber(int number) {
			this.number = number;
		}

		//Getter for building
		public Building getBuilding() {
			return this.building;
		}

		//Setter for building
		public void setBuilding(Building building) {
			this.building = building;
		}

		//Getter for rent
		public Rent getRent() {
			return this.rent;
		}

		//Setter for rent
		public void setRent(Rent rent) {
			this.rent = rent;
			rent.setUnit(this);
		}

		//getter for boolean isOccupied
		public boolean isOccupied() {
			return this.occupied;
		}
		
		public void addMaintenance(Maintenance m) {
			this.maintenanceList.add(m);
			m.setUnit(this);
		}
		
		public ArrayList<Maintenance> getMaintenanceList() {
			return this.maintenanceList;
		}
		
		public void printResidentList() {
			System.out.println("Unit: " + this.number);
			for (CurrResident r : this.residentList) {
				System.out.println("Name: " + r.getName() + "\nID: " + r.getiD() + "\n");
			}
		}
		
		public void printMaintenanceList() {
			int i = 0;
			System.out.println("Maintenance List");
			for (Maintenance m : this.maintenanceList) {
				System.out.println(i + ": " + m.getDescription());
				i++;
			}
		}
}
