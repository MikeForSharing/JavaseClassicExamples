
public class ArrayRawColumnSwap {

	public static void main(String[] args) {
		int[][] arr = new int[][] {{1,2,4},{3,3,7},{5,4,6}};
		printArr(arr);

		int[][] arr2 = new int[arr[arr.length-1].length][arr.length];
		for(int i=0; i<arr.length; i++) {
//			System.out.println(i);
			for(int j=0; j<arr[i].length; j++) {
				arr2[i][j] = arr[j][i];
			}
		}
		System.out.println("---------------------------");
		printArr(arr2);
		
		
		
	}

	
	public static void printArr(int[][] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println(" ");

		}
		
	}
}
