
public class Doctor extends Person  {
	
	public Doctor(String user , String name , int Pass , String feild) {
		
		this.User = user;
		this.Name = name;
		this.pass = Pass;
		this.Feild = feild;
	}
	
	public void Func() {
		
		System.out.println(" -- Welcome To Ur Teachrs Panel -- ");
		System.out.println("Choose Ur Option ( 1 ) Show Schedule ( 2 ) Add Grades ( 3 ) SetSubjects ( 4 ) to Login System");
			
		int chse ;
		String chse2 ;
			
		chse = scn.nextInt();
			
		switch (chse) {
			case 1 :
					this.showSchedule();
					System.out.print("\nGo to The Pervious Window ( y , n ) : ");
					chse2 = scn.next();
					
					if(chse2.equals("y")) {
						this.Func();
				}	
					break;
					
					
			case 2:
				this.SetGrades();
				System.out.print("\nGo to The Pervious Window ( y , n ) : ");
				chse2 = scn.next();
				
				if(chse2.equals("y")) {
					this.Func();
			}	
				break;
			
			case 3:
				this.SetSubjct();
				System.out.print("\nGo to The Pervious Window ( y , n ) : ");
				chse2 = scn.next();
				
				if(chse2.equals("y")) {
					this.Func();
			}	
				break;	
			
			case 4 : 
				
				Main.MyFunc();
				break;
				}
	}
	
	public void showSchedule() {
		int i = 0;
		for(String s : this.Shdllist ) {
			
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

		System.out.print("Enter user for the student : "); name = scn.next();
		for(Student s : Student.Slist) {
			
			if(name.equals(s.User)) 
			{
				for(String A : s.Subjct) 
				{
					
					System.out.print("Grade for "+A + " = ");
					s.Gradelist.add(scn.nextDouble());
				}
				
			}
			else
			{
				System.out.print("Not Found");
				
			}
			
		}
		
	}
	
	public void SetSubjct() {
		int s ;
		String sub;
		while(true) {
			
			System.out.print(" ( 1 ) For Add ( 2 ) For Stop : ");
			s = scn.nextInt();

			if(s == 1) {
				System.out.print("Add Subject Name : ");
				sub = scn.next();

				this.Subjct.add(sub);
				System.out.print(sub+" Added \n");
			}
			
			else if(s == 2 ) 
				
			{
				System.out.print(this.Subjct.size()+" Added To Students List");
				break;
			}
			
		}
		
	}
}
