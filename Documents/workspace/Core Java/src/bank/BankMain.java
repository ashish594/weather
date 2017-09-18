package bank;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		Operations op = new Operations();
		boolean isRegfull=false;
		while (!isRegfull) {
			System.out.println("select the option:1.Register 2.Login");
			int initial = input.nextInt();
			switch (initial) {
			case 1: {
				String name = takeName(input);
				long acno = takeAcno(input);
				float amount = takeAmount(input);
				try
				{
				op.register(name, acno, amount);
				System.out.println("registration success");
				}
				catch(Exception e)
				{
					System.out.println("exceeded the number of registration");
					isRegfull=true;
				}
				
				break;
			}
			case 2: {
				String name = takeName(input);
				long acno = takeAcno(input);
				CustomerDto loginStatus = op.login(name, acno);
				if (loginStatus == null) {
					System.out.println("Sorry!! login details are incorrect, please try again");
					break;
				} else {
					while (true) {
						System.out.println("Please select the option 1.deposit \n2.withdraw \n3.balanceCheck \n4.exit");
						int option = input.nextInt();
						switch (option) {

						case 1: {
							float amount = takeAmount(input);
							op.deposit(amount, loginStatus);
							break;
						}
						case 2: {
							float amount = takeAmount(input);
							op.withdraw(amount, loginStatus);
							break;
						}
						case 3: {
							op.balancestmt(loginStatus);
							break;
						}
						case 4:
							System.exit(0);
							break;
						}
					}
				}
			}
			}
		}
	}

	private static long takeAcno(Scanner input) {
		System.out.println("please enter the account number");
		long acno = input.nextLong();
		return acno;
	}

	private static String takeName(Scanner input) {
		System.out.println("please enter the name:");
		String name = input.next();
		return name;
	}

	private static float takeAmount(Scanner input) {
		float amount;
		System.out.println("please enter the amount ");
		amount = input.nextFloat();
		return amount;
	}
}
