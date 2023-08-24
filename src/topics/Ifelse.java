package topics;

public class Ifelse {

	public static void main(String[] args) {
		int s1=25;
		int s2=20;
		int s3= 5;
		int enBuyukSayi=s1;
		if(enBuyukSayi<s2) {
			enBuyukSayi=s2;
		}
		if(enBuyukSayi<s3) {
			enBuyukSayi=s3;
		}
		System.out.println("---En büyük sayı: "+enBuyukSayi);
		
	}

}
