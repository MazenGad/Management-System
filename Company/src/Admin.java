
public class Admin extends Person {
	
	public Admin(String name , int Pass ) {
		
		this.Name = name;
		this.pass = Pass;
	}
	
	public void Func() {
		
		System.out.println(" --- Welcome to Admin Panel --- ");
		System.out.println("Choose Ur Option ( 1 ) Set Students Data ( 2 ) Set Teachers Data ( 3 ) Set Schedule  ( 4 ) to Login System");
		
		int chse ;
		String chse2 ;
		
		chse = scn.nextInt();
		
		switch (chse) {
		
		case 1 :
			this.setStuData(); 
			System.out.print("Go to The Pervious Window ( y , n ) : ");
			chse2 = scn.next();
			
			if(chse2.equals("y")) {
				this.Func();
			}
			break;	
			
		case 2 :
			this.setTchData();
			System.out.print("Go to The Pervious Window ( y , n ) : ");
			chse2 = scn.next();
			
			if(chse2.equals("y")) {
				this.Func();
			}
			break;
			
		case 3 :
			this.setShedule();
			System.out.print("Go to The Pervious Window ( y , n ) : ");
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
}
