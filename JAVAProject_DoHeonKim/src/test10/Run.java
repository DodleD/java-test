package test10;

public class Run {

	public static void main(String[] args) {
		Employee[] employees = new Employee[2];
		
		employees[0] = new Secretary("Hilery",1,"secretary",800);
		employees[1] = new Sales("Clinten",2,"sales",1200);
		
		System.out.println("name\t department\t salary");
		System.err.println("---------------------------");
		
		for(int i =0; i<employees.length;i++) {
			Employee e = employees[i];
			System.out.printf("\n%-10s %-10s %-10d",e.getName(),e.getDepartment(),e.getSalary());
		}
		
		System.out.println("\n인센티브 100 지급\n");
		for(Employee e : employees) {
			if(e instanceof Secretary) {
				((Secretary)e).incentive(100);
			}else if (e instanceof Sales){
				((Sales)e).incentive(100);
			}
		}
		System.out.println("name\t department\t salary");
		System.err.println("---------------------------");
		for(int i =0; i<employees.length;i++) {
			Employee e = employees[i];
			System.out.printf("\n%-10s %-10s %-10d %.1f",e.getName(),e.getDepartment(),e.getSalary(),e.tax());
		}
		
		
	}

}
