
public class BreakCycle2 {
	public static void main(String[] args) {
		String[] animal = new String[] {"��ӥ","�ϻ�","ʨ��","��ӥ","�ڹ�","��ӥ"};
		int eagleCount = 0;
		for(String a:animal) {
			if(a.equals("��ӥ")) {
				System.out.println("ץ����һֻ��ӥ��");
				eagleCount++;
				continue;
			}
			System.out.println("������" + a);
		}
		System.out.println("��������\"" + eagleCount  + "\"ֻ��ӥ");
	}
}
