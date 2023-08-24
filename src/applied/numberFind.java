package applied;

public class numberFind {

	public static void main(String[] args) {
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
			System.out.println("Number is there");
		}else {
			System.out.println("Number is not there");
		}
	}

}
