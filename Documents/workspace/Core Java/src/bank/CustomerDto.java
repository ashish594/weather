package bank;

public class CustomerDto {
String name;
long accountNo;
float balance;
@Override
public String toString() {
	return "CustomerDto [name=" + name + ", accountNo=" + accountNo + ", balance=" + balance + "]";
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public long getAccountNo() {
	return accountNo;
}
public void setAccountNo(long accountNo) {
	this.accountNo = accountNo;
}
public float getBalance() {
	return balance;
}
public void setBalance(float balance) {
	this.balance = balance;
}
public CustomerDto(String name, long accountNo, float balance) {
	super();
	this.name = name;
	this.accountNo = accountNo;
	this.balance = balance;
}
}
