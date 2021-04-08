import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


	public static void main(String args[]) {

		
		MyFunc();

		
		}
		

		
	
	public static void MyFunc() {
		
		/*Make Scn Object to Read From Users*/
		Scanner scn = new Scanner(System.in);

		/*Make Admins List To Enter Admen Panel*/
		List<Admin> AdList = new ArrayList<Admin>();

		/*Add User Name : Mazen and Pass : 1020 to Admins List*/
		AdList.add(new Admin("Mazen" , 1020));
					
			System.out.print(" -- Welcome To College System -- \n Log in as ( 1 ) admin ( 2 ) Student ( 3 ) Doctor ( 4 ) Cancel: ");

			/*Varoables to Read Data for user and password */
			int chse1;		chse1 = scn.nextInt();
			
			String chse2;		
			
			/*Switch Case for Get into any option*/
			switch (chse1) /*Case Admin*/{
			case 1 :
				System.out.print(" Enter User : ");  chse2 = scn.next();
				System.out.print(" Enter Pass : ");  chse1 = scn.nextInt();
				
				for(Admin d : AdList)
				{
					if(d.Name.equals(chse2) && d.pass == chse1 ) {
						
						d.Func();
						
					}
				}
				
				break;
				
			case 2 /*Case Students*/: 
				System.out.print(" Enter User : ");  chse2 = scn.next();
				System.out.print(" Enter Pass : ");  chse1 = scn.nextInt();
				
				for(Student s : Student.Slist)
				{
					if(s.User.equals(chse2) && s.pass == chse1 ) {
						
						s.Func();
						
					}
				}
				
				break;
				
			case 3 /*Case Teachers*/: 
				System.out.print(" Enter User : ");  chse2 = scn.next();
				System.out.print(" Enter Pass : ");  chse1 = scn.nextInt();
				
				for(Doctor d : Doctor.Dlist)
				{
					if(d.User.equals(chse2) && d.pass == chse1 ) {
						
						d.Func();
						
					}
				}
				
				break;
			case 4 /*Case Cancel*/:
				System.out.print("Thanks");
				break;
			}
			
		}
		}
	

