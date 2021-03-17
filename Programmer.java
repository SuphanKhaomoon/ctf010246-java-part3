package CTF01.Java.part3;

public class Programmer extends Employee
{
	

// - สร้าง Class Programmer เซฟเป็นไฟล์ Programmer.java ขึ้นมา
//   โดยสืบทอดจาก class Employee และ เพิ่ม Method
//	  createWebsite (String template, String titleName) และ
//	  installWindows (String version, String productKey)
	
	public static void main(String[] args)
	{
		
//		- ทดลองเรียก Method getSaray() ใน instance ของ class Programmer
		Programmer pr = new Programmer("Suphan", "Khaomoon", 15000);
		Programmer pr1 = new Programmer("Wannasuk", "Chalermworakit");
		Programmer pr2 = new Programmer();
		
		System.out.println(pr.firstname + " " + pr.lastname + " " + pr.getSalary());
		
		System.out.println(pr1.firstname + " " + pr1.lastname);
		
		System.out.println(pr2.firstname + " " + pr2.lastname + " " + pr2.getSalary());

	}
	
//	ทดลอง Constructor Overloading
	public Programmer () {
		super();
	}
	
	public Programmer (String firstnameInput, String lastnameInput) {
		super(firstnameInput, lastnameInput);
	}

	public Programmer (String firstnameInput, String lastnameInput, int salaryInput) {
		super(firstnameInput, lastnameInput, salaryInput);	
	}
	
	public void createWebsite (String template, String titleName) {
		
	}
	
	public void installWindows (String version, String productKey) {
		
	}


}
