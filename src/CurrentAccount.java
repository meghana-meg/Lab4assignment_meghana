package Question1;
public class CurrentAccount extends Account {

          public CurrentAccount(long accnumber, double balance, Person accholder) {
		super(accnumber, balance, accholder);
		
	}
        
		final double overdraftlimit=100000;   
          public boolean withdraw()
      	  {  
         	if(overdraftlimit<getBalance())
         		return true;
      	   else
      		 return false;
      	  }
          public void abc()
          {
        	  
          }
	     
}
