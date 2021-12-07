package Hardware;

import java.util.ArrayList;
import java.util.Collections;
import Software.Announcement;
import Software.Profile;
import People.Employee;
import People.PotResident;

public class Apartment {
	
	//Public and Private Variables
		private String name;
		private String address;
		private ArrayList<Building> buildingList;
		private ArrayList<PotResident> potResidentList;
		private ArrayList<Employee> employeeList;
		private ArrayList<Integer> appointmentSchedule;
		private ArrayList<Announcement> announcementList;
		private ArrayList<Profile> profileList;
		private String[] week = {"Mon", "Tue", "Wed", "Thu", "Fri"};
		private String[] slot = {"8:00am to 9:15am", "9:30am to 10:45am", "11:00am to 12:15pm", "12:30pm to 1:45pm", "2:00pm to 3:15pm", "3:30pm to 4:45pm"};

		//Constructor
		public Apartment () {
			name = "NULL";
			address = "NULL";
			announcementList = new ArrayList<Announcement>();
			appointmentSchedule = new ArrayList<Integer>();
			buildingList = new ArrayList<Building>();
			employeeList = new ArrayList<Employee>();
			potResidentList = new ArrayList<PotResident>();
			profileList = new ArrayList<Profile>();
		}

		//Getter for Name
		public String getName() {
			return this.name;
		}

		//Setter for Name
		public void setName(String name) {
			this.name = name;
		}

		//Getter for Address
		public String getAddress() {
			return this.address;
		}

		//Setter for Address
		public void setAddress(String address) {
			this.address = address;
		}

		//Add building to the Apartment
		public void addBuilding(Building b) {
			this.buildingList.add(b);
		}

		//Add a potential Resident
		public void addPotResident(PotResident p) {
			this.potResidentList.add(p);
			p.setApartment(this);
		}

		//Add an Employee	
		public void addEmployee (Employee e) {
			this.employeeList.add(e);
		}

		//Add an Appointment	
		public void addAppointmentSchedule (int a) {
			this.appointmentSchedule.add(a);
		}

		//Add an Announcement	
		public void addAnnouncement (Announcement a) {
			this.announcementList.add(a);
		}

		//Remove an Announcement	
		public void removeAnnouncement (Announcement a) {
			this.announcementList.remove(a);
		}
		
		public void removeAppointmentTime (Integer a) {
			this.appointmentSchedule.remove(a);
		}
		
		public ArrayList<Building> getBuildingList() {
			return this.buildingList;
		}
		
		public ArrayList<PotResident> getPotResidentList() {
			return this.potResidentList;
		}
		
		public ArrayList<Employee> getEmployeeList() {
			return this.employeeList;
		}
		
		public ArrayList<Integer> getAppointmentSchedule() {
			return this.appointmentSchedule;
		}
		
		public ArrayList<Announcement> getAnnouncementList() {
			return this.announcementList;
		}
		
		public ArrayList<Profile> getProfileList() {
			return this.profileList;
		}
		
		public void addProfile(Profile p) {
			this.profileList.add(p);
		}
		
		public void printBuildingList() {
			System.out.println("Building List:");
			for (Building b : this.buildingList) {
				System.out.println("Building: " + b.getiD() + "\nAddress: " +  b.getAddress() + "\n");
			}
		}
		
		public void printPotResidentList() {
			System.out.println("Potential Resident List:");
			for (PotResident p : this.potResidentList) {
				System.out.println("Name: " + p.getName() + "\nPhone Number: " + p.getPhone() + "\nEmail: " + p.getEmail() + "\n");
			}
		}
		
		public void printEmployeeList() {
			System.out.println("Employee List:");
			for (Employee e : this.employeeList) {
				System.out.println("Name: " + e.getName() + "\nID: " + e.getiD() + "\n");
			}
		}
		
		public void printCurrResidentList() {
			System.out.println("Resident List:");
			for (Building b : this.buildingList) {
				System.out.println("Building: " + b.getiD());
				for (Unit u : b.getUnitList()) {
					u.printResidentList();
				}
			}
		}
		
		public void printAvailableAppointmentSchedule() {
			Collections.sort(appointmentSchedule);
			System.out.println("Available Appointment Schedule:");
			for (Integer i : this.appointmentSchedule) {
				System.out.println(week[(i / 100) - 1] + " " + slot[(i % 100) - 1] );
			}
		}
		
		public void printScheduledAppointments() {
			System.out.println("Scheduled Appointment Times:");
			for (PotResident p : this.potResidentList) {
				System.out.println("Name: " + p.getName() + " Time: " + week[(p.getAppointment().getDateTime() / 100) - 1] + " " + slot[(p.getAppointment().getDateTime() % 100) - 1] );
			}
		}
		
		public void printAnnouncementList() {
			System.out.println("Announcements:");
			for (Announcement a : this.announcementList) {
				System.out.println("Date: " + a.getDate());
				System.out.println(a.getTitle());
				System.out.println(a.getDescription() + "\n");
			}
		}
		
		public Building findBuilding(int s) {
			for (Building b1 : this.buildingList) {
				if (b1.getiD() == s) {
					return b1;
				}
			}
			return null;
		}
}
