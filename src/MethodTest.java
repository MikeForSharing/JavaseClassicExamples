import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class MethodTest {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		System.out.println("调用Math类的静态方法sin");
		Method sin = Math.class.getDeclaredMethod("sin", Double.TYPE);
		Double sin1 = (Double) sin.invoke(null, new Integer(1));
		System.out.println("1的正弦值为：" + sin1);
		System.out.println("调用String类的非静态方法equals");
		Method equals = String.class.getDeclaredMethod("equals", Object.class);
		Boolean cp = (Boolean) equals.invoke(new String("中国民航大学"), "中国民航大学");
		System.out.println("字符串是否为 中国民航大学 ：" + cp);
	}

}
