import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main 
{


	public static void main(String args[])
	{
		//Default Function For Login
		LogIn();
		
	}		

	public static void LogIn() {
		
		//Initialise Variables And Objects
		Scanner Scan = new Scanner(System.in); 			//Make Scan Object to Read From Users
		
		List<Admin> Admins = new ArrayList<Admin>();	//Make Admins List To Enter Admen Panel
		
		int IntFeild;									//To Read Numbers
		
		String StringFeild;								// To Read Strings

		boolean Condition;								// Conditions to Check in If Statements
		
		Admins.add(new Admin("Mazen" , 1020)); 			//Add User Name : Mazen and Pass : 1020 to Admins List
					
		boolean check = false ;							// Check for validate
		
		System.out.print(" -- Welcome To College System -- \n Log in as ( 1 ) admin ( 2 ) Student ( 3 ) Doctor ( 4 ) Cancel: ");

		IntFeild = Scan.nextInt();
			
		//Switch Case for Get into any option
			switch (IntFeild) 
			{
			
			//Start Case 1 /////////////////////////////////////////////
			case 1 : //Case Admin
				
				System.out.print(" Enter User : ");  StringFeild = Scan.next();
				System.out.print(" Enter Pass : ");  IntFeild = Scan.nextInt();
				
				for(Admin d : Admins)
				{
					
					Condition = d.Name.equals(StringFeild) && d.Pass == IntFeild;
					
					if(Condition ) {check = true; d.AdminFunc(); }

				}					
					
				if(!check) { System.out.println("Wrong Data Try Again ....."); LogIn();}
				
				break;
				
				//End Case 1 /////////////////////////////////////////////
				
				
				//Start Case 2 /////////////////////////////////////////////

			case 2 ://Case Students 
				
				System.out.print(" Enter User : ");  StringFeild = Scan.next();
				System.out.print(" Enter Pass : ");  IntFeild = Scan.nextInt();
				
				for(Student s : Student.Students_list)
				{
					Condition = s.User.equals(StringFeild) && s.Pass == IntFeild ;
					
					if(Condition == true) { check = true; s.StudentFunc(); }
						
				}

				if(!check) { System.out.println("Wrong Data Try Again ....."); LogIn();}

				break;			
				
				//End Case 2 /////////////////////////////////////////////
				

				//Start Case 3 /////////////////////////////////////////////

			case 3 ://Case Teachers
				
				System.out.print(" Enter User : ");  StringFeild = Scan.next();
				System.out.print(" Enter Pass : ");  IntFeild = Scan.nextInt();
				
				for(Doctor d : Doctor.Doctors_list)
				{
					Condition = d.User.equals(StringFeild) && d.Pass == IntFeild ;
					
					if(Condition) {	check = true; d.TeachersFunc(); }

					
				}
				
				if(!check) { System.out.println("Wrong Data Try Again ....."); LogIn();}

				
				break;			
				
				//End Case 3 /////////////////////////////////////////////

				
				//Start Case 4 /////////////////////////////////////////////

			case 4 : //Case Cancel
				
				System.out.print("Thanks");
				break;		
				
				//End Case 4 /////////////////////////////////////////////

				
		    default :
		    	
					System.out.print("Wrong Choice Try Again ....");
					LogIn();
					
			}
			
		}
}
	

