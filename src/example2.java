import java.util.Scanner;

public class example2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("������һ������");
		long num = scan.nextLong();
		System.out.println(num + "����2Ϊ" + (num<<1));
		System.out.println(num + "����16Ϊ" + (num<<4));

		
	}
}
