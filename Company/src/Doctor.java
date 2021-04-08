
public class Doctor extends Person  {
	
	int IntFeild ;       
	String StringFeild ; 
	
	public Doctor(String user , String name , int pass , String feild) {
		
		this.User = user;
		this.Name = name;
		this.Pass = pass;
		this.Feild = feild;
	}
	
	public void TeachersFunc() {
		
		System.out.println(" -- Welcome To Ur Teachrs Panel -- ");
		System.out.println("Choose Ur Option ( 1 ) Show Schedule ( 2 ) Add Grades ( 3 ) SetSubjects ( 4 ) to Login System");
			
			
		IntFeild = Scan.nextInt();
			
		switch (IntFeild) {
			case 1 :
					this.showSchedule();
					
					System.out.print("\nGo to The Pervious Window ( y , n ) : ");
					StringFeild = Scan.next();
					
					if(StringFeild.equals("y") || StringFeild.equals("Y") ) 
						
					{
						this.TeachersFunc();
			
					}	
					
					else 
						System.out.print("Done ");
					
					break;
					
					///////////////////////////////////
					
			case 2:
				this.SetGrades();
				
				System.out.print("\nGo to The Pervious Window ( y , n ) : ");
				StringFeild = Scan.next();
				
				if(StringFeild.equals("y") || StringFeild.equals("Y") ) 
				{
					this.TeachersFunc();
			
				}	
				
				else 
					System.out.print("Done ");
				
				break;
				
				///////////////////////////////////

			case 3:
				
				this.SetSubjct();
				
				System.out.print("\nGo to The Pervious Window ( y , n ) : ");
				StringFeild = Scan.next();
				
				if(StringFeild.equals("y") || StringFeild.equals("Y") ) 
				{
					
					this.TeachersFunc();
			
				}	
				
				else 
					System.out.print("Done ");
				
				break;	
				
				///////////////////////////////////

			case 4 : 
				
				Main.LogIn();
				break;
				}
	}
	
	public void showSchedule() {
		int i = 0;
		for(String s : Shdl_list ) {
			
			switch (i) {
			case 0 :
				System.out.println("-----------------\n| Suterday : " + s+"\n");
				i++;
				break;
			
			case 1 : 
				System.out.println("| Sunday : " + s+"\n");
				i++;
				break;			
				
			case 2 : 
				System.out.println("| Monday : " + s+"\n");
				i++;

				break;			
					
			case 3 : 
				System.out.println("| Tuesday : " + s+"\n");
				i++;


				break;			
						
			case 4 : 
				System.out.println("| Wednesday : " + s+"\n");
				i++;


				break;
							
			case 5 : 
				
				System.out.println("| Thursday : " + s +" \n-----------------");
				i++;

				break;
			}
			

		}
		

	}
	
	public void SetGrades() {
		String name;
		boolean check = false;
		
		System.out.print("Enter user for the student : "); name = Scan.next();
		for(Student s : Student.Students_list) {
			
			if(name.equals(s.User)) 
			{
				check = true;
				
				for(String A : Subjcts_List) 
				{
					
					System.out.print("Grade for "+A + " = ");
					s.Grade_list.add(Scan.nextDouble());
				}
			}

			
		}
			if (!check ) { System.out.print("Not Found"); }
			
		
	}
	
	public void SetSubjct() {
		int s ;
		String sub;
		while(true) {
			
			System.out.print(" ( 1 ) For Add ( 2 ) For Stop : ");
			s = Scan.nextInt();

			if(s == 1) {
				System.out.print("Add Subject Name : ");
				sub = Scan.next();

				Subjcts_List.add(sub);
				System.out.print(sub+" Added \n");
			}
			
			else if(s == 2 ) 
				
			{
				System.out.print(Subjcts_List.size()+" Added To Students List");
				break;
			}
			
		}
		
	}
}
