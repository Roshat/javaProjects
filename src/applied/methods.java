package applied;

public class methods {

	public static void main(String[] args) {
		findNumber();
	}
	public static void findNumber() {
		int[] numbers= new int[] {1,2,5,8,44};
		int callNumber=3;
		boolean isThere=false;
		for(int number : numbers) {
			if(number==callNumber) {
				isThere=true;
				break;
			}
		}
		if(isThere) {
			printMessage(callNumber);
		}else {
			System.out.println("Number is not there");
		}

	}
	public static void printMessage(int callNumber2) {
		System.out.println("Number is there: "+ callNumber2);
	}

}
