
public class BreakCycle {
	public static void main(String[] args) {
//		String[] array = new String[]{"Ϭţ", "����","����","����","ʨ��","�ϻ�","����"};
//		System.out.println("����к��ӣ���ֹͣѰ��");
//		for(String animal:array) {
//			if(animal.equals("����")) {
//				System.out.println("�ҵ���" + animal);
//				break;
//			}
//		}
		
		
		int[][] parentScore =new int[][] {{76,86,98,77},{77,78,78,98},{98,97,65,66},{54,75,73,72}};
		N1:for(int[] first:parentScore) {
			for(int i:first) {
				if(i<60) {
					System.out.println(i);
					break N1;
				}
			}
		}
	}
}
