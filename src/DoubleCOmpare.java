
public class DoubleCOmpare {

	public static void main(String[] args) {
		Double d1 = 12.12;
		Double d2 = 34.23;
		
		switch(d1.compareTo(d2)){
			case -1:
				System.out.println("d1小于d2");
				break;
			case 0:
				System.out.println("d1等于d2");
				break;
			case 1:
				System.out.println("d1大于d2");
				break;
		}
				
	}

}
