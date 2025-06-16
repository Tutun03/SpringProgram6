package in.sp.beans;

public class address {
private int houseno;
private String city;
private int pincode;
public address(int houseno, String city, int pincode) {
	super();
	this.houseno = houseno;
	this.city = city;
	this.pincode = pincode;
}
@Override
public String toString() {
	return "address [houseno=" + houseno + ", city=" + city + ", pincode=" + pincode + "]";
}




}
