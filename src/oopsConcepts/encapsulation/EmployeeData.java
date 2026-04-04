package oopsConcepts.encapsulation;

public class EmployeeData {
	//encapsulation is also called data hiding
	//public getter and setter methods
	//getter and setter : get and set values of fields
	private int ssnNumber;
	private int salary;
	private String empName;
	private int empAge;
	
public static void main(String[] args) {
	
	EmployeeData data = new EmployeeData();
	data.setEmpAge(10);
	data.setEmpName("jagadeesh");
	data.setSalary(5000);
	data.setSsnNumber(1234);
	
	System.out.println(data.getEmpAge());
}

public int getSsnNumber() {
	return ssnNumber;
}

public void setSsnNumber(int ssnNumber) {
	this.ssnNumber = ssnNumber;
}

public int getSalary() {
	return salary;
}

public void setSalary(int salary) {
	this.salary = salary;
}

public String getEmpName() {
	return empName;
}

public void setEmpName(String empName) {
	this.empName = empName;
}

public int getEmpAge() {
	return empAge;
}

public void setEmpAge(int empAge) {
	this.empAge = empAge;
}

}