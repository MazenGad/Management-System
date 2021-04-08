
public class Employee extends cmpSys {
	
	String Name , jop ;
	
	
	public Employee(String name)
	{
		
		super(name);
		this.Name = name;
		
	}

	public String myjop(String Jop) {
		
		this.jop = Jop;
		return Jop;
		
	}

	
}
