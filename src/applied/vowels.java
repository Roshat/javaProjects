package applied;

public class vowels {

	public static void main(String[] args) {
		char harf='I';
		
		switch (harf) {
		case 'A','I','O','U':
			System.out.println("Kalın sesli bir harf");
		break;
		case 'İ','Ö','Ü','E':
			System.out.println("İnce sesli bir harf");
		break;
		default:
			System.out.println("Sessiz bir harf.");
		}

	}

}
