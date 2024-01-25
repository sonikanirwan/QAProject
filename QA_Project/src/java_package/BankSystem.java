package java_package;

public class BankSystem {
	
	BankSystem(String name, String pass)
	{
		System.out.println("username" + " "+ "password");
	}

int amt =1000;
	void deposit(int dep)
	{
		amt = amt +dep;
		System.out.println("The curernt balance after deposit "+amt);
	}
	
	void withdraw(int wt)
	{
		amt=amt-wt;
		System.out.println("The curernt balance after withdraw "+amt);
	}
	
	int display()
	{
		
		return amt;
	}
	
	public static void main(String[] args) {
		// Create a object of class
		
		BankSystem a = new BankSystem("user12","password");
		a.deposit(1000);
		a.withdraw(500);
		System.out.println(a.display());
	}
	
	

}
