
public class cmpSys {
	
	 private int balance = 0;
	
	 public static String [] name  = new String[100];
	 
	 public cmpSys() {};
	 
	 public cmpSys(String Name) {
		 
		 
		 int i = 0;
		 
		 for(String vall : name)
		 {
			 
			 if (vall == null ) 
			 {
				
				 name[i] = Name;
			 }
			 i++;

		 }
		
	 }
			
		
		public int setBalance(String Name) {
			
		if(Name.equals("Android") || Name.equals("android") ) 
		{
			 
			this.balance = 1500;
			return this.balance;

		}
		else if(Name.equals("Ios") || Name.equals("ios")) {
			this.balance = 2000;
			return this.balance;
		}
		
		
		else if(Name.equals("Front End") || Name.equals("front end")) {
			this.balance = 1000;
			return this.balance;
		}
		
		else if(Name.equals("Back End") ||Name.equals("back end")) {
			this.balance = 3000;
			return this.balance;
		}
		
		else if(Name.equals("Full Stack" )||Name.equals("full stack")) {
			this.balance = 4000;
			return this.balance;
		}
		
		return this.balance;
		
	}
	
	public int getBalance() {
		return this.balance;
	}
	
	private static int Search(String Name) {
		
		int i = 0 ;
		for ( String val : name) {
			
		
			if (val.equals(Name)) {
				return i ;
			}
			
			i++;
			
		}
		return 0;
		
	}
	
	
	public static void rmvEmpl(String Name) {
		
		int index = Search(Name);
					
			name [index] = null;				
			
			
		
		
	}
	
	
	

}
