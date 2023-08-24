package applied;

public class perfectNumber {

	public static void main(String[] args) {
		int number=6;
		int total=0;
		for(int i =1; i <number;i++) {
			if(number%i==0) {
				total=total+i;
				System.out.println(i);
			}
		}
		System.out.println(total);
		if(total==number) {
			System.out.println("Excellent number");
		}else {
			System.out.println("Normal number");
		}

	}

}
