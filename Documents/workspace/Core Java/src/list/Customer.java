package list;

import java.util.Scanner;

public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int Amount;
		 
		
		Account obj=new Account();
		Bank b=new Bank();
		//System.out.println("1.Deposit 2.Withdraw");
		obj.setAcno(1234);
		obj.setBalance(1000);
		int a;
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("enter 1.deposit 2.withdraw");
			a=sc.nextInt();
		switch(a)
		{
	
		case 1:
			System.out.println("Deposit");
			System.out.println("enter the amount");
			Amount=sc.nextInt();
			b.deposit(obj,Amount);
			System.out.println(obj);
			break;
		case 2:
			System.out.println("withdraw");
			System.out.println("enter the amount");
			Amount=sc.nextInt();
			b.withdraw(obj, Amount);
			System.out.println(obj);
			break;
		default:
			System.out.println("exit");
			break;
		}
		}
		
		
		
	}

}
