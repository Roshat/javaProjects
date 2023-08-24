package topics;
import java.util.Scanner;
public class Switch {

	public static void main(String[] args) {
		System.out.println("Lütfen notunuzu giriniz: ");
		try(Scanner giris= new Scanner(System.in)){
		char grade =giris.next().charAt(0);
		
		switch(grade) {
		
		case 'A':
			System.out.println("Harika : Geçtiniz.");
			break;
		case 'B':
			System.out.println("İyi: Geçtiniz.");
			break;
		case 'C':
			System.out.println("Orta: Geçtiniz.");
			break;
		case 'D':
			System.out.println("Daha çok çalışmalısın: Geçtiniz.");
			break;
		case 'E':
			System.out.println("Kötü: Kaldınız.");
			break;
			default:
				System.out.println("Geçersiz not girişi!!! Lütfen geçerli bir not giriniz.");
		}
		}
		catch(Exception e) {
			System.out.println("Birşeyler Yanlış gitti...");
		}
	}

}
