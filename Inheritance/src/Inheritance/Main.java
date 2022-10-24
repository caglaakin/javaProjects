package Inheritance;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer();
		Employee employee = new Employee();
		customer.email="sadsfdgf";
		employee.salary=8256;
		
		CustomerManager customerManager = new CustomerManager();
		EmployeeManager employeeManager = new EmployeeManager();
		customerManager.Add();
		employeeManager.BestEmployee();
		
	}

}
