package arkadasSayilar;

public class Main {

	public static void main(String[] args) {
		int number1 = 220;
		int number2 = 284;
		int total1 = 0;
		int total2 = 0;
				
		for(int i=1; i<number1; i++) {
			if(number1 % i == 0) {
				total1+=i;
			}
			
		}
			
		for(int j=1; j<number2; j++) {
			if(number2 % j == 0) {
				total2+=j;
			}
		}
		
		if(total1 == number2 & total2 == number1) {
			System.out.println("Sayilar arkadaş sayidir");
		}else {
			System.out.println("Sayilar arkadaş değildir");
		}
		
		

	}

}
