package Application;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.println("How many employees will be registered?");
		int n = sc.nextInt();
		
		for (int i=0;i<n;i++) {
			System.out.println();
			System.out.println("Employee #" + (i+1) + ":");
			sc.nextLine();
			System.out.println("ID: ");
			Integer id = sc.nextInt();
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Salary: ");
			Double salary = sc.nextDouble();
			
			Employee emp = new Employee(id,name,salary);
			
			list.add(emp);
		}
		System.out.println("Enter the employee ID that will have salary increase: ");
		int employeeId = sc.nextInt();
		
		Employee emp = list.stream().filter(x-> x.getId() == employeeId).findFirst().orElse(null);
		
		if (emp == null) {
			System.out.println("This ID doesn't exist!");
			System.exit(1);
		}
		
		emp.increaseSalary(10);
		
		for(Employee employee11 : list){
			System.out.println(employee11);
		}
		
		System.out.println("Fim do código!");
		sc.close();
	}
}