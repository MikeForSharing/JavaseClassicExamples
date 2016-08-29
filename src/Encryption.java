import java.util.Scanner;

public class Encryption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入加密或者解密的字符串");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		char[] array = str.toCharArray();
		for(int i=0; i<array.length; i++) {
			array[i] = (char)(array[i] ^ 20000);
		}
		System.out.println("输出加密或解密的字符串");
//		System.err.println(new String(array));
		System.err.println(array);

		
		
//		int a = 2 ^ 12;
//		System.out.println(a);
	}

}
