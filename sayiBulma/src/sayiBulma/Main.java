package sayiBulma;

public class Main {

	public static void main(String[] args) {
		int[] sayilar = new int[] {1,2,5,8,9,11,15,14,26,89};
		int aranacak = 20;
		boolean varmi = false;
		
		for(int i=0; i<sayilar.length; i++){   //(int sayi:sayilar)
			if(sayilar[i] == aranacak) {
				varmi = true;
				break;
			}			
		}
		if(varmi) {
			System.out.println("Aranan sayi listede mevcut");
		}else {
			System.out.println("Aranan sayi bulunamadı");
		}

	}

}
