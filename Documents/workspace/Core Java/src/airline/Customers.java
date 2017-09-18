package airline;

public class Customers {
@Override
	public String toString() {
		return "Customers [name=" + name + " "+ ", passport=" + passport
				+ ", seatnumber=" + seatnumber + "]";
	}
public int getSeatnumber() {
		return seatnumber;
	}
	public void setSeatnumber(int seatnumber) {
		this.seatnumber = seatnumber;
	}
private String name;
private String passport;
private int seatnumber;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public String getPassport() {
	return passport;
}
public void setPassport(String passport) {
	this.passport = passport;
}
}
