
public class reCapDemo {

	public static void main(String[] args) {
		double[] myList= {1.5,4.77,3.123,545.34,11};
		double total=0;
		double max= myList[0];
		for(double numbers:myList) {
			if(max<numbers) {
				max =numbers;
			}
			total =total +numbers;
			System.out.println(numbers);
		}
		System.out.println("Toplam Sonuç: "+total);
		System.out.println("En büyük sayı: "+max);
		System.out.println("--------");
		int[] sayilar= {1,2,42,22,13};
		int top=0;
		int maksimum=sayilar[0];
		for(int sayi:sayilar) {
			if(maksimum<sayi) {
				maksimum=sayi;
			}
			top=top+sayi;
		}
		System.out.println("Sayiların toplamı: "+top);
		System.out.println("En büyük sayı: "+maksimum);
		
		
		
		
		
		
		
		
		
	}

}
