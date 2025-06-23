package day6;

public class SFAStudent{
	private String name;
	private static int id;
	private int reg;
	private final int x;
    static {
    	
    	System.out.println("Static block executed..");
    }	
	

	
	public SFAStudent(int x) {
		super();
		this.x=x;
		id++;//id is static so it shares one memory as common and gets incremented
		reg++;//reg is instance so each object gets separate memory and increments from start 
		System.out.println("Constructor called...");
	}
	
	
	//getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static int getId() {
		return id;
	}
	public int getReg() {
		return reg;
	}


	public void setReg(int reg) {
		this.reg = reg;
	}


	public static void setId(int id) {
		SFAStudent.id = id;
	}
	@Override
	public String toString() {
		return "SFAStudent [id= "+id+", name=" + name + ", reg=" + reg + " X= "+x+"]";
	}

}
