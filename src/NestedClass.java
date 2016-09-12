import java.lang.reflect.Modifier;
import java.lang.reflect.Type;


public class NestedClass {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Class<?> clazz = Class.forName("java.awt.geom.Point2D");
		Class<?>[] nestedClasses = clazz.getDeclaredClasses();
		
		for(Class<?> cls : nestedClasses) {
			System.out.println("类的标准名称是：" + cls.getCanonicalName());
			System.out.println("类的修饰符是：" + Modifier.toString(cls.getModifiers()));
			
			Type[] interfaces = cls.getInterfaces();
			
			if(interfaces.length != 0) {
				for(Type interf : interfaces ) {
					System.out.println("匿名类继承的接口是：" + interf + "\t");
				}
			}
			
			Type superclass = cls.getSuperclass();
			System.out.println("匿名类继承的父类是：" + superclass);
			
		}
		

	}

}
