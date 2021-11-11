package Hardware;

import java.util.ArrayList;
import Software.Announcement;
import Software.Appointment;
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
	private ArrayList<Appointment> appointmentList;
	private ArrayList<Announcement> announcementList;

	//Constructor
	public Apartment () {
		name = "NULL";
		address = "NULL";
		announcementList = new ArrayList<Announcement>();
		appointmentList = new ArrayList<Appointment>();
		appointmentSchedule = new ArrayList<Integer>();
		buildingList = new ArrayList<Building>();
		employeeList = new ArrayList<Employee>();
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
	}

	//Add an Employee	
	public void addEmployee (Employee e) {
		this.employeeList.add(e);
	}

	//Add an Appointment	
	public void addAppointment (Appointment a) {
		this.appointmentList.add(a);
		//have a detect conflict to check times?
		//add schedule of appointment after implementing that
	}

	//Detect Conflict on the Appointment
	public void detectConflict (Appointment a) {
		//implement later
	}
	//Add an Announcement	
	public void addAnnouncement (Announcement a) {
		this.announcementList.add(a);
	}

	//Remove an Announcement	
	public void removeAnnouncement (Announcement a) {
		this.announcementList.remove(0);
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
	
	public ArrayList<Appointment> getAppointmentList() {
		return this.appointmentList;
	}
	
	public ArrayList<Announcement> getAnnouncementList() {
		return this.announcementList;
	}
}
