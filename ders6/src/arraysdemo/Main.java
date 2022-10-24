package arraysdemo;

public class Main {

	public static void main(String[] args) {
		String ogrenci1 = "Çağla";
		String ogrenci2 = "Erkan";
		String ogrenci3 = "Berk";
		
		System.out.println("Öğrenci adı : " + ogrenci1);
		System.out.println("Öğrenci adı : " + ogrenci2);
		System.out.println("Öğrenci adı : " + ogrenci3);
		
		System.out.println("------------------------");
		
		String[] ogrenciler = new String[4];
		ogrenciler[0]="Erkan";
		ogrenciler[1]="Çağla";
		ogrenciler[2]="Berk";
		ogrenciler[3]="Eylül";
		
		for(int i=0; i<ogrenciler.length; i++) {
			System.out.println("Öğrenci adı: "+ ogrenciler[i]);
		}
		
		System.out.println("------------------------");
		
		for(String ogrenci:ogrenciler) {
			System.out.println(ogrenci);
		}
	}

}
