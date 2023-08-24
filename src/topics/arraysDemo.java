package topics;

public class arraysDemo {

	public static void main(String[] args) {
		String ogr1= "Engin ";
		String ogr2="Derin ";
		String ogr3 ="Metin";
		System.out.println(ogr1);
		System.out.println(ogr2);
		System.out.println(ogr3);
		
		System.out.println("-----------");
		//Array
		String[] ogrenciler= new String[3];
		ogrenciler[0]="Merve";
		ogrenciler[1]="Engin";
		//ogrenciler[2]="Derin";
		
		for (int i =0;i<ogrenciler.length;i++) {
			System.out.println(ogrenciler[i]);
		}
		System.out.println("-------------");
		for(String ogrenci:ogrenciler) {
			System.out.println(ogrenci);
		}
		
		
	}

}
