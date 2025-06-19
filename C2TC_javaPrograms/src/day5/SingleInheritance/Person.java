package day5.SingleInheritance;

public class Person {
	private int id;
	private String name;
	private String city;
	
	public Person() { //Default Constructor
		this.id = 110;
		this.name = "Varun";
		this.city = "Chennai";
	}
	public Person(int ID,String Name, String City) {
		this.id = 111;
		this.name = "Mosina";
		this.city = "Bangalore";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		city = city;
	}
	

}
