package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel.";
		System.out.println(mesaj);
		
		/*System.out.println("Eleman sayısı : "+ mesaj.length());//metin uzunluğu
		System.out.println("5. Eleman : " + mesaj.charAt(4));//metinin eleman sayısı
		System.out.println(mesaj.concat(" Yaşasın."));//metin birleştirme
		System.out.println(mesaj.startsWith("E"));//başlayan harf boolean değer döndürür
		System.out.println(mesaj.endsWith("."));
		
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);
		//get.Chars()
		//1. parametre mesajın hangi karakterden itibaren alınacağını belirtir
		//2. parametre ise hangi karakterde biteceğini belirtir. Yazılan sayıyı dahil etmez öncesinde bitirir.
		//3. parametre nereye atılacağını belirtir
		//4.parametre atılacak dizinin kaçıncı indexsinden itibaren atılacağını belirtir
	
		System.out.println("-----------");
		System.out.println(karakterler);
		for(char harf:karakterler) {
			System.out.println(harf);
		}
		
		System.out.println("Baştaki ilk a harfinin indexi : " + mesaj.indexOf('a'));//belirtilen harfin kaçıncı indexte olduğunu bulmaya yarar.
		System.out.println("Sondaki ilk a harfinin indexi : " + mesaj.lastIndexOf('a'));*/
		
		String yeniMesaj = mesaj.replace(" ", "-");
		System.out.println(yeniMesaj);
		
		System.out.println(mesaj.substring(11));
		//11 dahil kalan metni alır
		System.out.println(mesaj.substring(11,14));
		//11den başla dahil et 14e kadar dahil etme
		
		System.out.println("------------->");
		for(String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toUpperCase());
		System.out.println("AFBDBFSDKS".toLowerCase());
		System.out.println(mesaj.trim());//baştaki ve sondaki boşlukları siler
		
		
		
	}

}
