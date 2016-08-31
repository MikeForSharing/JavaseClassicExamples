package clone.effectiveCompare;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		Employee employee = new Employee("����",15);
		Long currentTime = System.currentTimeMillis();
		System.out.println("��ʼ��¡��");
		for(int i=0; i<100000; i++) {
			employees.add(employee.clone());
		}
		Long currentTime2 = System.currentTimeMillis();
		System.out.println("��¡�����ѵ�ʱ���ǣ�" + (currentTime2-currentTime));
		
		currentTime = System.currentTimeMillis();
		for(int i=0;i<100000;i++) {
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ObjectOutputStream fos = null;
			try {
				fos = new ObjectOutputStream(baos);
				fos.writeObject(employee);
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
			ObjectInputStream ois = null;
			try {
				ois = new ObjectInputStream(bais);
				try {
					Employee employee2 = (Employee) ois.readObject();
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		currentTime2 = System.currentTimeMillis();
		System.out.println("���л������ѵ�ʱ�䣺" + (currentTime2 - currentTime));
		
		
		
	}

}
