package equalsMethod;

import java.awt.Color;

public class TestHashCode {

	public static void main(String[] args) {
		CatHashCode cat1 = new CatHashCode("cat1",3,46,Color.black);
		CatHashCode cat2 = new CatHashCode("cat2",3,36,Color.black);
		CatHashCode cat3 = new CatHashCode("cat1",3,46,Color.black);
		
		System.out.print("cat1" + cat1);
		System.out.print("cat2" + cat2);
		System.out.print("cat3" + cat3);
		
		System.out.println("cat1�Ƿ��cat3����أ�" + cat1.equals(cat3));
		System.out.println("cat1�Ƿ��cat2����أ�" + cat1.equals(cat2));
		System.out.println("cat1��hashCode�ǣ�" + cat1.hashCode());
		System.out.println("cat2��hashCode�ǣ�" + cat2.hashCode());
		System.out.println("cat3��hashCode�ǣ�" + cat3.hashCode());
	}

}
