package People;

import Software.Appointment;

public class PotResident {

	//VARIABLES
	private String name;
	private double phone;
	private String email;
	private Appointment appointment;
	
	//CONSTRUCTOR
	public PotResident () {
		this.setAppointment(null);
		this.setEmail("abc@gmail.com");
		this.setName("Paul");
		this.setPhone(5205206969.0);
	}

	//Getter for name
	public String getName() {
		return name;
	}

	//Setter for name
	public void setName(String name) {
		this.name = name;
	}

	//Getter for phone
	public double getPhone() {
		return phone;
	}

	//Setter for phone number
	public void setPhone(double phone) {
		this.phone = phone;
	}

	//Getter for email
	public String getEmail() {
		return email;
	}

	//Setter for email
	public void setEmail(String email) {
		this.email = email;
	}

	//Getter for Appointment
	public Appointment getAppointment() {
		return appointment;
	}

	//Setter for Appointment
	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}
	
	
}
