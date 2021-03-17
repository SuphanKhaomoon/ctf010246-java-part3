package CTF01.Java.part3;

public class Employee
{
	public String firstname;
	public String lastname;
	private int salary;

	public static void main (String[] args) {
// 10. 3 - Lab 3: New Class
//	- ทดลองสร้าง Array จาก Class Employee
		Employee[] employees = new Employee[3];
		for (int i = 0; i < employees.length; i++)
		{
			employees[i] = new Employee("Firstname " + i, "Lastname " + i, 10000 * (i + 1));
		}
		System.out.println(employees[0].firstname);
		System.out.println(employees[1].firstname);
		System.out.println(employees[2].firstname);
		System.out.println(employees[0].lastname);
		System.out.println(employees[1].lastname);
		System.out.println(employees[2].lastname);
		System.out.println(employees[0].salary);
		System.out.println(employees[1].salary);
		System.out.println(employees[2].salary);

	}
	
	public Employee () {
		this.firstname = "Anonymous";
		this.lastname = "Anonymous";
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
	
	public void hello () {
		System.out.println("Hello " + firstname);
	}
	
	public int getSalary () {
		return salary;
	}
	
}
