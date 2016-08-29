package clone;

public class Test {

	public static void main(String[] args) {
		Address address1 = new Address("中国","河北省","张家口");
		Employee e1 = new Employee("张三",30,address1);
		System.out.println("浅克隆之前");
		System.out.println("e1:" + e1);
		
		System.out.println("浅克隆之后");
		Employee e2 = e1.clone();
		e2.setAge(23);
		e2.setName("李四");
		Address address2 = new Address("美国","纽约","天津");
		e2.getAddress().setCountry("美国");
		e2.getAddress().setProvience("纽约");
		e2.getAddress().setCity("天津");
		
		System.out.println("e1:" + e1);

		System.out.println("e2:" + e2);
	}

}
