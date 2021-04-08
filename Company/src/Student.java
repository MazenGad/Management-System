import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
	

	public Student(String user , String name , int Pass , String feild) {
		
		this.User = user;
		this.Name = name;
		this.pass = Pass;
		this.Feild = feild;
	}
	
	public void Func() {
		
		System.out.println(" -- Welcome To Ur Students Panel -- ");
		System.out.println("Choose Ur Option ( 1 ) Show Schedule ( 2 ) Show Subjects ( 3 ) Show Grades ( 4 ) to Login System");
			
		int chse ;
		String chse2 ;
			
		chse = scn.nextInt();
			
		switch (chse) {
			case 1 :
					this.showSchedule(); /*Call function show schedule from abstract call person*/
					System.out.print("Go to The Pervious Window ( y , n ) : ");
					chse2 = scn.next(); /*read answer from user to choise*/
					
					if(chse2.equals("y")) {
						this.Func(); /*Recall to the Same Function (Recursion) */
				}	
					break;
					
			
			case 2 : 
				this.ShowSubject(); /*Call function show schedule from abstract call person*/
				System.out.print("Go to The Pervious Window ( y , n ) : ");
				chse2 = scn.next(); /*read answer from user to choise*/
				
				if(chse2.equals("y")) {
					this.Func(); /*Recall to the Same Function (Recursion) */
			}	
				break;
			
			case 3 :
				this.ShowGrades(); /*Call function show schedule from abstract call person*/
				System.out.print("Go to The Pervious Window ( y , n ) : ");
				chse2 = scn.next(); /*read answer from user to choise*/
				
				if(chse2.equals("y")) {
					this.Func(); /*Recall to the Same Function (Recursion) */
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
	
	public void ShowGrades() {
		
		int i = 0;
		for(double d : this.Gradelist) {
			
			System.out.print(this.Subjct.indexOf(i)+" : "+d);
			i++;
			
		}
	}
	
	public void ShowSubject() {
		int i = 1;
		for(String s : this.Subjct) {
			System.out.print( "----------- \n"+"( "+ i +" "+s);
			i++;
		}
	}

}
