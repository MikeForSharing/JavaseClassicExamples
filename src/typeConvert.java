
public class typeConvert {
	public static void main(String[] args) {
		byte b = 127;
		char c = 'W';
		short s = 23561;
		int i = 3333;
		long l = 400000L;
		float f = 3.1223F;
		double d = 54.3244;
		System.out.println("累加byte等于" + b);
		System.out.println("累加char等于" + (b + c));
		System.out.println("累加short等于" + (b + c + s));
		System.out.println("累加int等于" + (b + c + s + i));
		System.out.println("累加long等于" + (b + c + s + i + l));
		System.out.println("累加float等于" + (b + c + s + i + l + f));
		System.out.println("累加double等于" + (b + c + s + i + l + f + d));
		System.out.println("把long类型转换为int类型" + (int)l);

	}
}
