import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;


public class FormatNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入一个数字");
		double number = scan.nextDouble();
		System.out.println("将用Locale类的常量作为格式化对象的构造参数，转换成相应的类");
		NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println("格式化为US的货币形式:" + format.format(number));
		
		format = NumberFormat.getCurrencyInstance(Locale.CHINA);
		System.out.println("格式化为CHINA的货比形式：" + format.format(number));
		
		
		

	}
}
