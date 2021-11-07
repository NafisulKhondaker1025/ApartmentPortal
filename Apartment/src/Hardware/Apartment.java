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
	public ArrayList <Building> buildingList;
	public ArrayList <Employee> employeeList;
	public ArrayList <Integer> appointmentSchedule;
	public ArrayList <Appointment> appointmentList;
	public ArrayList <Announcement> announcementList;

	//Construtor
	public Apartment () {
		this.name = "unknown";
		this.address = "unknown";
		this.announcementList = new ArrayList<Announcement>();
		this.appointmentList = new ArrayList<Appointment>();
		this.appointmentSchedule = new ArrayList<Integer>();
		this.buildingList = new ArrayList<Building>();
		this.employeeList = new ArrayList<Employee>();
	}

	//Getter for Name
	public String getName() {
		return name;
	}

	//Setter for Name
	public void setName(String name) {
		this.name = name;
	}

	//Getter for Address
	public String getAddress() {
		return address;
	}

	//Setter for Address
	public void setAddress(String address) {
		this.address = address;
	}

	//Add building to the Apartment
	public void addBuilding(Building b) {

	}

	//Add a potential Resident
	public void addPotResident(PotResident p) {

	}

	//Add an Employee	
	public void addEmployee (Employee e) {

	}

	//Add an Appointment	
	public void addAppointment (Appointment a) {

	}

	//Detect Conflict on the Appointment
	public void detectConflict (Appointment a) {

	}
	//Add an Employee	
	public void addAnnouncement (Announcement a) {

	}

	//Add an Employee	
	public void removeAnnouncement (Announcement a) {

	}
}
