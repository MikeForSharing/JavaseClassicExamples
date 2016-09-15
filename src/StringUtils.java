import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Date;


public class StringUtils {

	public String toString(Object object) {
		Class clazz = object.getClass();
		
		StringBuilder sb = new StringBuilder();
		Package packageName = clazz.getPackage();
		sb.append("类所属的包名是：" + packageName.getName() + "\t");
		String className = clazz.getName();
		sb.append("类的名字是：" + className + "\t");
		sb.append("公共构造方法：\n");
		Constructor[] constructors = clazz.getDeclaredConstructors();
		for(Constructor constructor : constructors) {
			String modifier = Modifier.toString(constructor.getModifiers());
			if(modifier.contains("public")) {
				sb.append(constructor.toGenericString() + "\n");
			}
		}
		sb.append("公共域：\n"  );
		Field[] fields = clazz.getDeclaredFields();
		for(Field field : fields) {
			String modifier = Modifier.toString(field.getModifiers());
			if(modifier.contains("public")) {
				sb.append(field.toGenericString() + "\n");
			}
		}
		
		sb.append("公共方法：\n");
		Method[] methods = clazz.getMethods();
		for(Method method : methods) {
			String modifier = Modifier.toString(method.getModifiers());
			if(modifier.contains("public")) {
				sb.append(method.toGenericString() + "\n");
			}
		}
		
		return sb.toString();
		
		
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringUtils su = new StringUtils();
		Date date = new Date();
		System.out.println(su.toString(date));
	}

}
