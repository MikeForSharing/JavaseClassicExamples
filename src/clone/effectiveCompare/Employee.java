package clone.effectiveCompare;

import java.io.Serializable;

public class Employee implements Cloneable, Serializable {
	private String name;
	private int age;
	
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;

	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("名字是：" + name);
		sb.append("年龄是：" + age);

		return sb.toString();
	}
	
	@Override
	public Employee clone() {
		Employee employee = null;
//		employee = 
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

	

}
