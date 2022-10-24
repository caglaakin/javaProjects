package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		char harf = 'A';
		/*
		 * boolean kalin = false; boolean ince = false;
		 * 
		 * char[] kalinsesli = {'A','a','I','ı','O','o','U','u'}; char[] incesesli =
		 * {'E','e','İ','i','Ö','ö','Ü','ü'};
		 * 
		 * 
		 * for(int i=0; i<kalinsesli.length; i++) { if(harf == kalinsesli[i]) { kalin =
		 * true; } }
		 * 
		 * for(int j=0; j<incesesli.length; j++) { if(harf == incesesli[j]) { ince =
		 * true; } }
		 * 
		 * 
		 * 
		 * if(kalin) { System.out.println("Harf kalın sesli harftir. ---> " + harf); }
		 * else if(ince){ System.out.println("Harf ince sesli harftir. ---> " + harf); }
		 * else { System.out.println("geçersiz bilgi"); }
		 */

		switch (harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("kalin sesli harf " + harf);
			break;
		case 'E':
		case 'İ':
		case 'Ö':
		case 'Ü':
			System.out.println("İnce sesli harf " + harf);
		default:
			System.out.println("Geçersiz harf");

		}

	}

}
