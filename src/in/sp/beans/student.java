package in.sp.beans;

public class student {
private int rollno;
private String name;
private address Address;

public student(int rollno, String name, address address) {
	super();
	this.rollno = rollno;
	this.name = name;
	Address = address;
}
public void display()
{
	System.out.println("Roll no "+ rollno);
	System.out.println("Name"+ name);
	System.out.println("Address"+Address);
}
@Override
public String toString() {
	return "student [rollno=" + rollno + ", name=" + name + ", Address=" + Address + "]";
}



}
