package methods2;

public class Main {

	public static void main(String[] args) {
		String mesaj = sehirVer();
		System.out.println(mesaj);
		int totalnumber = topla(20,7);
		System.out.println(totalnumber);
		int toplam = topla2(10,20,30,40);
		int toplam2 = topla2();
		System.out.println(toplam);
		System.out.println(toplam2);
	}
	
	public static void ekle() {
		System.out.println("Eklendi");
		//void herhangi bir değer döndürmeyen fonksiyondur 
		//Çağırıldığında sadece çalışır.
	}
	
	public static int topla(int sayi1, int sayi2) {
		return sayi1+sayi2;
	}
	
	public static int topla2(int... sayilar) {
		//variable arguments ...
		//int array göndermişiz gibi çalışır
		int toplam = 0;
		for (int sayi:sayilar) {
			toplam+=sayi;
		}
		return toplam;
	}
	
	public static String sehirVer() {
		return "Ankara";
	}
	
	
	

}
