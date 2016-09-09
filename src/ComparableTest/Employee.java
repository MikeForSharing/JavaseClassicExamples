package ComparableTest;

public class Employee implements Comparable<Employee> {
	private int id;
	private String name;
	private int age;
	
	public Employee(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id: " + id);
		sb.append("name: " + name);
		sb.append("age: " + age);
		return sb.toString();
	}

	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public int compareTo(Employee o) {
		if(id > o.id) {
			return 1;
		} else if(id < o.id) { 
			return -1;
		}
		return 0;
	}

}
