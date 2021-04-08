import java.util.*;

public abstract class Person {
	
	/*Attributes*/
	
	protected String Name;
	
	protected String User;
	
	protected String Shedule;
	
	protected int pass;
	
	protected String Feild;
	
	protected List<Double> Gradelist = new ArrayList<Double>();
	protected List<String> Subjct = new ArrayList<String>();
	

	
	/*create a list to store a schedule*/
	static List<String> Shdllist = new ArrayList<String>();
	
	static List<Student> Slist = new ArrayList<Student>();
	
	static List<Doctor> Dlist = new ArrayList<Doctor>();
	
	Scanner scn = new Scanner(System.in);
	/*Methods*/


	/*Set The User Of the Persons*/
	public void setStuData() {
		
		
		System.out.print("Enter The Name : "); 	 String name = scn.next();
		
		System.out.print("Enter User Name : ");	 String user = scn.next();
		
		System.out.print("Enter Password : ");	 int Pass = scn.nextInt();
		
		System.out.print("Enter Feild : ");		 String feild = scn.next();
		
		Slist.add(new Student(user , name ,  Pass , feild));
		
		System.out.print("Data Has been Saved!");
		
	}
	
	public void setTchData() {
		
		
		System.out.print("Enter The Name : "); 	 String name = scn.next();
		
		System.out.print("Enter User Name : ");	 String user = scn.next();
		
		System.out.print("Enter Password : ");	 int Pass = scn.nextInt();
		
		System.out.print("Enter Feild : ");		 String feild = scn.next();
		
		Dlist.add(new Doctor(user , name ,  Pass , feild));
		
		System.out.print("Data Has been Saved!");
		
	}
	
	/*Set The Schedule*/
	public void setShedule() {
	
		
		System.out.println(" -- Enter The Schedule for 6 Days -- ");
		
		String d ;
		
		/*Read the data for the shedule from the admin for every user*/

		for(int i = 0 ; i< 6 ; i++) {
			
			switch(i){
		
			case 0:
				System.out.println("Suterday : ");
				
				d = scn.next();
				this.Shdllist.add(d);
				break;
				
			case 1:
				System.out.println("Sunday : ");
				
				d = scn.next();
				this.Shdllist.add(d);
				break;

				
			case 2:
				System.out.println("Monday : ");
				
				d = scn.next();
				this.Shdllist.add(d);
				break;

				
			case 3:
				System.out.println("Tuesday : ");				
				
				d = scn.next();
				this.Shdllist.add(d);
				break;

				
			case 4:
					System.out.println("Wednesday : ");
					
					d = scn.next();
					this.Shdllist.add(d);
					break;

					
			case 5:
					System.out.println("Thursday : ");

					d = scn.next();
					this.Shdllist.add(d);
					break;


				
			}
		}
		
		System.out.println("Done!");
		
	}

	

	
	
	
	
	

}
