package CTF01.Java.part3;

public class Day10
{

	public static void main(String[] args)
	{
//		- ทดลองสร้าง instance ของ class CEO และ class Employee ใน
//		  Method main ไฟล์ Day10.java
		
		Employee jack = new Employee("Suphan", "Khaomoon", 15000);
		System.out.println("Salary Employee = " + jack.getSalary());
		jack.hello();
		
		CEO ceo = new CEO("Surapit", "Khaomoon", 15000);
		System.out.println("Salary CEO = " + ceo.getSalary());
		ceo.hello();
		ceo.fire(jack);

	}

}
