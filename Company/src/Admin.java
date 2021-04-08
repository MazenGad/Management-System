
public class Admin extends Person {
	
	int IntFeild ;       
	String StringFeild ; 
	
	public Admin(String name , int pass ) {
		
		this.Name = name;
		this.Pass = pass;
	}
	
	public void AdminFunc() {
		
		System.out.println(" --- Welcome to Admin Panel --- ");
		System.out.println("Choose Ur Option ( 1 ) Set Students Data ( 2 ) Set Teachers Data ( 3 ) Set Schedule  ( 4 ) to Login System");
		
		
		IntFeild = Scan.nextInt();
		
		switch (IntFeild) {
		
		case 1 :
			
			this.setStuData(); 
			
			System.out.print("\nGo to The Pervious Window ( y , n ) : ");
			StringFeild = Scan.next();
			
			if(StringFeild.equals("y") || StringFeild.equals("Y") ) 
			{
				
				this.AdminFunc();
				
			}
			
			else 
				System.out.print("Done ");
			
			break;	
			
			////////////////////////////////////////////
			
		case 2 :
			this.setTchData();
			
			System.out.print("\nGo to The Pervious Window ( y , n ) : ");
			StringFeild = Scan.next();
			
			if(StringFeild.equals("y") || StringFeild.equals("Y") ) 
			{
				
				this.AdminFunc();
				
			}
			
			else 
				System.out.print("Done ");
			
			break;
			
			////////////////////////////////////////////

		case 3 :
			this.setShedule();
			
			System.out.print("\nGo to The Pervious Window ( y , n ) : ");
			StringFeild = Scan.next();
			
			if(StringFeild.equals("y") || StringFeild.equals("Y") ) 
			{
				
				this.AdminFunc();
				
			}
			
			else 
				System.out.print("Done ");
			
			break;
			
			////////////////////////////////////////////

		case 4 : 
			Main.LogIn();
			break;

		
		}
		
		
		
		
	}
}
