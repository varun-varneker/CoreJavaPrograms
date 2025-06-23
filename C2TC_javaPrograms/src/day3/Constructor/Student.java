package day3.Constructor;

public class Student {
	private int ID;
	private String Name;
	private int Age; 
	
	public Student() {
		this.ID = ID;
		this.Name = Name;
		this.Age = Age;
		}
	
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	@Override
	public String toString() {
		return "SFAStudent [Age=" + Age + ", Name=" + Name + ", ID=" + ID + "]";
	}

}
