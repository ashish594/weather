package Matrimony;

public class Dto {
private String name;
private long telephone;
private String hobby1;


//public Dto(String name,long telephone,String hobby1){
//	this.name=name;
//	this.telephone=telephone;
//	this.hobby1=hobby1;
//	}
	

@Override
public String toString() {
	return "Dto [name=" + name + ", telephone=" + telephone + ", hobby1=" + hobby1 + "]";
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public long getTelephone() {
	return telephone;
}
public void setTelephone(long telephone) {
	this.telephone = telephone;
}
public String getHobby1() {
	return hobby1;
}
public void setHobby1(String hobby1) {
	this.hobby1 = hobby1;
}

}
