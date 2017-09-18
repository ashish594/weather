package bank;

public class Operations {
	CustomerDto cust[] = new CustomerDto[2];
	int count=0;
	public void register(String name, long acno, float amount) throws Exception{
		if(count==cust.length)
		{
			throw new Exception("invalid size");
		}
		for (int i = 0; i < cust.length; i++) {
			if (cust[i] == null) {
				cust[i] = new CustomerDto(name, acno, amount);
				count++;
				break;
			}
			
		}
	}

	public CustomerDto login(String name, long acno) {
		for (CustomerDto d : cust) {
			if (d != null && d.getName().equalsIgnoreCase(name) && d.accountNo == acno) {
				System.out.println("login success");
				return d;
			}
		}
		return null;
	}

	public void deposit(float money, CustomerDto cust) {
		float amount = cust.getBalance();
		amount = amount + money;
		cust.setBalance(amount);
		System.out.println("Deposit Successful \n Available balance is:  " + amount);

	}

	public void withdraw(float money, CustomerDto cust) throws BankException{
		float amount = cust.getBalance();
		if (amount >= money) {
			amount = amount - money;
			cust.setBalance(amount);
			System.out.println("Withdraw Successful \n Available balance is: " + amount);
		} else
			throw new BankException("Insufficient funds");
	}

	public void balancestmt(CustomerDto cust) {
		System.out.println("Availble balance id: " + cust.getBalance());
	}
}
