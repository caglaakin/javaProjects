package enbuyuksayi;

public class Main {

	public static void main(String[] args) {
		int sayi1 = 15;
		int sayi2 = 105;
		int sayi3 = 1005;
		int enbuyuk = sayi1;
		
		if(enbuyuk<sayi2) {
			enbuyuk = sayi2;			
		}
		if(enbuyuk<sayi3) {
			enbuyuk = sayi3;
			
		}
		
		System.out.println("En büyük sayı : " + enbuyuk);
	}

}
