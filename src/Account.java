package Question1;
/**  Author name : MEGHANA T
     date: 23/10/2020
     desc: Opens a account for a person with a certain balance.
Supports deposit and with draw functionality 
*/
	public class Account {
	private long accnumber;
	private double balance;
	private Person accholder;
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Account(long accnumber, double balance, Person accholder) {
		this.accnumber = accnumber;
		this.balance = balance;
		this.accholder = accholder;
	}
	public long getAccnumber() {
		return accnumber;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public Person getAccholder() {
		return accholder;
	}
	
	public void deposit(double amount)
	{
		balance=balance+amount;
	}
	public void withdraw(double amount)
	{   
		balance=balance-amount;
	  
	}
}

