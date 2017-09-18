package list;

//import java.util.Scanner;

public class Bank {
public boolean withdraw(Account a,int Amount)
{	
	int s=a.getBalance();
//	System.out.println("enter the amount to be withdrawn");
	
	s=s-Amount;
	
	a.setBalance(s);
	return true;
	
}
public boolean deposit(Account a,int Amount){
	int s=a.getBalance();
	s=s+Amount;
	a.setBalance(s);
	return true;
}
}
