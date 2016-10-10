import java.util.Date;
import java.util.Locale;

public class StringFormatDate {
	public static void main(String[] args) {
		Date date = new Date();
		
		String a = String.format(Locale.US, "%tb", date);
		System.out.println("格式化后的字符串为英文缩写" + a);
		
		String b = String.format(Locale.US, "%tB",date);
		System.out.println("格式化后的字符串为英文全写" + b);
		
		String c = String.format(Locale.CHINA,"%ta",date);
		System.out.println("格式化后的字符串为" + c);
		
		String d = String.format(Locale.CHINA,"%tA",date);
		System.out.println("格式化后的字符串为" + d);
				
		String e = String.format(Locale.CHINA,"%tY",date);
		System.out.println("格式化后的字符串为" + e);
		
		String f = String.format(Locale.CHINA,"%ty",date);
		System.out.println("格式化后的字符串为" + f);
		
		String g = String.format(Locale.CHINA,"%tm",date);
		System.out.println("格式化后的字符串为" + g);
		
		String h = String.format(Locale.CHINA,"%td",date);
		System.out.println("格式化后的字符串为" + h);
				
		String i = String.format(Locale.CHINA,"%te",date);
		System.out.println("格式化后的字符串为" + i);
	}
}
