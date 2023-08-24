package topics;

public class stringsDemo {

	public static void main(String[] args) {
		String mesaj="	Bugün hava çok güzel.";
		System.out.println(mesaj);
		System.out.println("Eleman sayısı: "+mesaj.length());
		
		System.out.println("5. eleman: "+mesaj.charAt(4));
		System.out.println(mesaj.concat(" Yaşasıınn.."));
		System.out.println(mesaj.startsWith("A"));
		System.out.println(mesaj.endsWith("."));
		char[] karakterler= new char[5];
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf('a'));//aramaya soldan başlar
		System.out.println(mesaj.indexOf("av"));
		System.out.println(mesaj.lastIndexOf('a'));//aramaya sağdan başlar
		
		System.out.println(mesaj.replace(' ', '-'));
		
		System.out.println(mesaj.substring(3));
		System.out.println(mesaj.substring(2,4));
		
		for(String kelimeler:mesaj.split(" ")) {
			System.out.println(kelimeler);
		}
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		
		System.out.println(mesaj.trim());// Cümlenin başında veya sonunda boşluk varsa , hizalama yapar. 
		
		
	}

}
