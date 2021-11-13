package People;

import java.util.ArrayList;

public class Employee {

	//Variables
	private ArrayList<Integer> schedule;

	//Constructor
	public Employee () {
		this.schedule = new ArrayList<Integer>();
	}
	
	//Getter for Schedule
	public ArrayList<Integer> getSchedule() {
		return this.schedule;
	}

	//Setter for Schedule
	public void addSchedule(int a) {
		this.schedule.add(a);
	}
	
}
