package staticInternalClass;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double[] array = new double[5];
		
		for(int i=0; i<5; i++) {
			array[i] = 100 * Math.random();
		}
		
		System.out.println("原始数组为：" );
		for(int i=0; i<5; i++) {
			System.out.println(array[i]);
		}
		System.out.println("输出最大值和最小值：");
	
		System.out.println(MaxMin.getResult(array).getMax());
		System.out.println(MaxMin.getResult(array).getMin());
	}

}
