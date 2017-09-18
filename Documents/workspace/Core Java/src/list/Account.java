package list;

public class Account {
private int acno;
private int balance;

@Override
public String toString() {
	return "Account [acno=" + acno + ", balance=" + balance + "]";
}
public int getAcno() {
	return acno;
}
public void setAcno(int acno) {
	this.acno = acno;
}
public int getBalance() {
	return balance;
}
public void setBalance(int balance) {
	this.balance = balance;
}

}
