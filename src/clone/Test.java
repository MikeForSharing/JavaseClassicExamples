package clone;

public class Test {

	public static void main(String[] args) {
		Address address1 = new Address("�й�","�ӱ�ʡ","�żҿ�");
		Employee e1 = new Employee("����",30,address1);
		System.out.println("ǳ��¡֮ǰ");
		System.out.println("e1:" + e1);
		
		System.out.println("ǳ��¡֮��");
		Employee e2 = e1.clone();
		e2.setAge(23);
		e2.setName("����");
		Address address2 = new Address("����","ŦԼ","���");
		e2.getAddress().setCountry("����");
		e2.getAddress().setProvience("ŦԼ");
		e2.getAddress().setCity("���");
		
		System.out.println("e1:" + e1);

		System.out.println("e2:" + e2);
	}

}
