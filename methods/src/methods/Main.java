package methods;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca();

	}
	
	public static void sayiBulmaca() {
		int[] sayilar = new int[] {1,2,5,8,9,11,15,14,26,89};
		int aranacak = 14;
		boolean varmi = false;
		
		for(int i=0; i<sayilar.length; i++){   //(int sayi:sayilar)
			if(sayilar[i] == aranacak) {
				varmi = true;
				break;
			}			
		}
		if(varmi) {
			mesajVer("Aranan sayi listede mevcut " + aranacak);
		}else {
			mesajVer("Aranan sayi listede mevcut değil. " + aranacak);
		}
		
	}
	
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
		
	}
	
	
	
	

}
