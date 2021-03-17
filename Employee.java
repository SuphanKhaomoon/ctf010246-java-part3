package CTF01.Java.part3;

public class Employee
{
	public String firstname;
	public String lastname;
	private int salary;
	
// 13.2 	
//	1. เพิ่มตัวแปร
	public String position;
	
//	2. เขียน method เพิ่ม
	public void checkPosition () {
		System.out.println("My Position is " + position);
	}

	public static void main (String[] args) {

//	3. ทดสอบว่า method checkPosition ทำงานถูกป่าว
//	3.1 สร้าง method main ขึ้นมา
//	3.2 สร้าง instance ของ Employee ขึ้นมาซักอัน
		Employee em = new Employee("Suphan", "Khaomoon", 15000, "Programmer");
		
//		3.3 เรียก method checkPosition ของ Employee ที่สร้างขึ้น
		em.checkPosition();
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
