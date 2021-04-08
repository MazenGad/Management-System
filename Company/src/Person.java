import java.util.*;

public abstract class Person {
	
	///// Attributes /////
	
	protected String Name;
	
	protected String User;
	
	protected String Shedule;
	
	protected int Pass;
	
	protected String Feild;
	
	///// ArrayLists To Store Data /////

	protected List<Double> Grade_list = new ArrayList<Double>();
	
	static List<String> Subjcts_List = new ArrayList<String>();
	
	static List<String> Shdl_list = new ArrayList<String>();
	
	static List<Student> Students_list = new ArrayList<Student>();
	
	static List<Doctor> Doctors_list = new ArrayList<Doctor>();
	
	
	Scanner Scan = new Scanner(System.in);
	


	/////// Methods ///////
	
	/*Set The User Of the Persons*/
	public void setStuData() {
		
		System.out.print("Enter The Name : "); 	 String Entered_Name = Scan.next();
		
		System.out.print("Enter User Name : ");	 String Entered_User = Scan.next();
		
		System.out.print("Enter Password : ");	 int Entered_Pass = Scan.nextInt();
		
		System.out.print("Enter Feild : ");		 String Entered_Feild = Scan.next();
		
		Students_list.add(new Student(Entered_User , Entered_Name ,  Entered_Pass , Entered_Feild));
		
		System.out.print("Data Has been Saved!");
		
	}
	
	public void setTchData() {
		
		
		System.out.print("Enter The Name : "); 	 String Entered_Name = Scan.next();
		
		System.out.print("Enter User Name : ");	 String Entered_User = Scan.next();
		
		System.out.print("Enter Password : ");	 int Entered_Pass = Scan.nextInt();
		
		System.out.print("Enter Feild : ");		 String Entered_Feild = Scan.next();
		
		Doctors_list.add(new Doctor(Entered_User , Entered_Name ,  Entered_Pass , Entered_Feild));
		
		System.out.print("Data Has been Saved!");
		
	}
	
	/*Set The Schedule*/
	public void setShedule() {
		
		System.out.println(" -- Enter The Schedule for 6 Days -- ");
		
		String Day  ;
		
		/*Read the data for the schedule from the Admin for every user*/

		for(int i = 0 ; i< 6 ; i++) {
			
			switch(i){
		
			case 0:
				
				System.out.println("Suterday : ");
				Day = Scan.next();
				Shdl_list.add(Day);
				
				break;
				
			case 1:
				
				System.out.println("Sunday : ");
				Day = Scan.next();
				Shdl_list.add(Day);
				
				break;

				
			case 2:
				
				System.out.println("Monday : ");
				Day = Scan.next();
				Shdl_list.add(Day);
				
				break;

				
			case 3:
				
				System.out.println("Tuesday : ");				
				Day = Scan.next();
				Shdl_list.add(Day);
				
				break;

				
			case 4:
				
					System.out.println("Wednesday : ");
					Day = Scan.next();
					Shdl_list.add(Day);
					
					break;

					
			case 5:
				
					System.out.println("Thursday : ");
					Day = Scan.next();
					Shdl_list.add(Day);
					
					break;
			}
		}
		
		System.out.println("Done!");
		
}

	

	
	
	
	
	

}
