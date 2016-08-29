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
		
		System.out.println("cat1是否和cat3相等呢？" + cat1.equals(cat3));
		System.out.println("cat1是否和cat2相等呢？" + cat1.equals(cat2));
		System.out.println("cat1的hashCode是：" + cat1.hashCode());
		System.out.println("cat2的hashCode是：" + cat2.hashCode());
		System.out.println("cat3的hashCode是：" + cat3.hashCode());
	}

}
