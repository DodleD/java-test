package test10;

abstract public class Employee {
	private String name;
	private int number;
	private String department;
	private int salary;
	
	
	public Employee() {
		super();
	}


	public Employee(String name, int number, String department, int salary) {
		super();
		this.name = name;
		this.number = number;
		this.department = department;
		this.salary = salary;
	}
	
	abstract public double tax() ;


	
	
	@Override
	public String toString() {
		return name + "\t" + department + "\t" + salary;
	}


	protected String getName() {
		return name;
	}


	protected void setName(String name) {
		this.name = name;
	}


	protected int getNumber() {
		return number;
	}


	protected void setNumber(int number) {
		this.number = number;
	}


	protected String getDepartment() {
		return department;
	}


	protected void setDepartment(String department) {
		this.department = department;
	}


	protected int getSalary() {
		return salary;
	}


	protected void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	
}
