import java.util.Scanner;

public class Encryption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("��������ܻ��߽��ܵ��ַ���");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		char[] array = str.toCharArray();
		for(int i=0; i<array.length; i++) {
			array[i] = (char)(array[i] ^ 20000);
		}
		System.out.println("������ܻ���ܵ��ַ���");
//		System.err.println(new String(array));
		System.err.println(array);

		
		
//		int a = 2 ^ 12;
//		System.out.println(a);
	}

}
