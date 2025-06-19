//a program to demonstrate trainer sub class and derived class
package day5.SingleInheritance;

public class Trainer {
	private String designation;
	private String location;
	
	public Trainer(){//default constructor
		
		super();
		this.designation = "program trainer";
		this.location = "Chennai";
	}
	
public Trainer(int id, String name, String city, String designation, String location){//parameterized constructor
		
		super(); // calling base class parameter
		this.designation = "program developer";
		this.location = "Chennai";
}
	
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Trainer [designation=" + designation + ", location=" + location + "]";
	}

}
