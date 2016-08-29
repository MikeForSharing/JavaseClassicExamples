package deepClone;

import java.io.Serializable;

public class Employee implements Serializable {
	private String name;
	private int age;
	private Address address;
	
	public Employee(String name, int age, Address address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("�����ǣ�" + name);
		sb.append("�����ǣ�" + age);
		sb.append("��ַ�ǣ�" + address);
		return sb.toString();
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	

}
