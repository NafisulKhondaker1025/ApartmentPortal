package People;

import Software.Appointment;

public class PotResident {

	//VARIABLES
	private String name;
	private int phone;
	private String email;
	private Appointment appointment;
	
	//CONSTRUCTOR
	public PotResident () {
		name = "NULL";
		phone = 0;
		email = "NULL";
		appointment = new Appointment();	
	}

	//Getter for name
	public String getName() {
		return this.name;
	}

	//Setter for name
	public void setName(String name) {
		this.name = name;
	}

	//Getter for phone
	public int getPhone() {
		return this.phone;
	}

	//Setter for phone number
	public void setPhone(int phone) {
		this.phone = phone;
	}

	//Getter for email
	public String getEmail() {
		return this.email;
	}

	//Setter for email
	public void setEmail(String email) {
		this.email = email;
	}

	//Getter for Appointment
	public Appointment getAppointment() {
		return this.appointment;
	}

	//Setter for Appointment
	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}
	
	
}
