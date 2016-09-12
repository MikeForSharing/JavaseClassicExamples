import java.util.Date;


public class ClassTest {
	public static void main(String[] args) {
		System.out.println("第一种方法：Object.getClass()");
		Class c1 = new Date().getClass();
		System.out.println(c1.getName());
		
		System.out.println("第二种方法：.class语法");
		Class c2 = Date.class;
		System.out.println(c2.getName());
		
		System.out.println("第三种方法：forName");
		Class c3 = null;
		try {
			c3 = Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(c3.getName());
		
		System.out.println("第四种方法：包装类的type域");
		Class c4 = Double.TYPE;
		System.out.println(c4.getName());
		
	}
}
