package clone;

public class Employee implements Cloneable {
	private String name;
	private int age;
	private Address address;
	
	
	
	
	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public Employee(String name, int age, Address address) {
		this.name = name;
		this.age = age;
		this.address = address;
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
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ĞÕÃû£º" + name);
		sb.append("ÄêÁä" + age);
		sb.append("µØÖ·" + address);
		return sb.toString();
	}
	
	@Override
	public Employee clone() {
		Employee employee = null;
		try {
			employee = (Employee) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return employee;
		
	}
	
	
}
