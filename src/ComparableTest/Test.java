package ComparableTest;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(2,"mike",12));
		employees.add(new Employee(3,"jack", 14));
		employees.add(new Employee(1,"rose", 19));
		System.out.println("排序之前");
		for(Employee e:employees) {
			System.out.println(e);
		}
		
		System.out.println("排序之后");
		Collections.sort(employees);
		for(Employee e:employees) {
			System.out.println(e);
		}
	}

}
