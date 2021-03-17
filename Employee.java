package CTF01.Java.part3;

public class Employee
{
	public String firstname;
	public String lastname;
	public String position;
	private int salary;

	public static void main (String[] args) {

	}
	
//	ทดลอง Constructor Overloading
	public Employee () {
		this.firstname = "Anonymous";
		this.lastname = "Anonymous";
		this.position = "Anonymous";
		this.salary = 9000;
	}
	
	public Employee (String firstnameInput, String lastnameInput) {
		this();
		this.firstname = firstnameInput;
		this.lastname = lastnameInput;
	}
	
	public Employee (String firstnameInput, String lastnameInput, int salaryInput) {
		this.firstname = firstnameInput;
		this.lastname = lastnameInput;
		this.salary = salaryInput;
	}
	
	public Employee (String firstnameInput, String lastnameInput, int salaryInput, String positionInput) {
		this.firstname = firstnameInput;
		this.lastname = lastnameInput;
		this.salary = salaryInput;
		this.position = positionInput;
	}
	
	public void hello () {
		System.out.println("Hello " + firstname);
	}
	
	public int getSalary () {
		return salary;
	}
	
}
