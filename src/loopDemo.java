
public class loopDemo {

	public static void main(String[] args) {
		//For
		for(int i=1;i<= 10;i++) {
			System.out.println(i);
		}
		System.out.println("Döngü sonlandı");
		for(int i=1;i<= 10;i+=2) {
			System.out.println(i);
		}
		System.out.println("Tek sayılar yazıldı.");
		System.out.println("TFor döngüsü bitti.");

		//while
		int i=0;
		while(i<10) {
			System.out.println(i);
			i++;
		}
		System.out.println("While döngüsü bitti");
		
		// do-While
		int j=1;
		do {
			System.out.println(j);
			j+=2;
		}while(j<10);
		System.out.println("do-While döngüsü bitti.");
	}

}
