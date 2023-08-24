package applied;

public class miniProjeAsalSayi {

	public static void main(String[] args) {
	/*	int number =25;
		int reminder= number%2;
		System.out.println(reminder);
		*/
		int number2=9;
		/*
		for(int m=2;m<number2;m++) {
			int islem=number2%m;
			 if(islem<=2) { 
					System.out.println("Sayı asal");
				}
		}
		*/
		boolean isPrime=true;
		if(number2==1) {
			System.out.println("Sayı asal değildir.");
			return;
		}
		if(number2<1) {
			System.out.println("Geçersiz sayı.");
		}
		for(int i=2;i<number2;i++) {
			if(number2%i==0) {
				isPrime=false;
			}
		}
		if(isPrime) {
			System.out.println("Asal");
		}else {
			System.out.println("Asal değil.");
		}
		
	}

}
