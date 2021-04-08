public class Student extends Person {
	
		int IntFeild ;       
		String StringFeild ; 
			
		public Student(String user , String name , int pass , String feild) {
			                 	
		this.User = user;
		this.Name = name;
		this.Pass = pass;
		this.Feild = feild;
	} 
	
	public void StudentFunc() {
		
		System.out.println(" -- Welcome To Ur Students Panel -- ");
		System.out.println("Choose Ur Option ( 1 ) Show Schedule ( 2 ) Show Subjects ( 3 ) Show Grades ( 4 ) to Login System");
			

		IntFeild = Scan.nextInt();
			
		switch (IntFeild) {
		
			case 1 :
				
					this.showSchedule(); //Call function show schedule from abstract call person
					
					//Back From Function Show
					System.out.print("\nGo to The Pervious Window ( y , n ) : ");
					StringFeild = Scan.next(); //read answer from user to choise
					
					if(StringFeild.equals("y") || StringFeild.equals("Y") ) 
					{
						this.StudentFunc(); //Recall to the Same Function (Recursion)
					}
					
					else 
						System.out.print("Done ");
					
					break;
					
					//////////////////////////////////////////////

			case 2 : 
				this.ShowSubject(); /*Call function show schedule from abstract call person*/
				
				//Back From Function Show
				System.out.print("\nGo to The Pervious Window ( y , n ) : ");
				StringFeild = Scan.next(); /*read answer from user to choise*/
				
				if(StringFeild.equals("y") || StringFeild.equals("Y") ) 
				{
					this.StudentFunc(); /*Recall to the Same Function (Recursion) */
					
				}	
				
				else 
					System.out.print("Done ");
				
				break;
			
				//////////////////////////////////////////////
				
			case 3 :
				this.ShowGrades(); /*Call function show schedule from abstract call person*/
				
				//Back From Function Show
				System.out.print("\nGo to The Pervious Window ( y , n ) : ");
				StringFeild = Scan.next(); /*read answer from user to choise*/
				
				if(StringFeild.equals("y") || StringFeild.equals("Y") ) 
				{
					this.StudentFunc(); /*Recall to the Same Function (Recursion) */
			
				}
				else 
					System.out.print("Done ");
				
				break;
				
				//////////////////////////////////////////////

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
	
	public void ShowGrades() {
		
		int i = 0;
		for(double d : this.Grade_list) {
			
			System.out.print(Subjcts_List.get(i)+" : "+d+"\n");
			i++;
			
		}
	}
	
	public void ShowSubject() {
		int i = 1;
		for(String s : Subjcts_List) {
			System.out.print( "\n----------- \n"+"( "+ i +" "+s);
			i++;
		}
	}

}
