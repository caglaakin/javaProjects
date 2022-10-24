package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		int number = 23;
		boolean isPrime = true;
		System.out.println("--------------");

		if (number < 2) {
			System.out.println("Geçersiz sayı girdiniz");
		} else {
			for (int i = 2; i < number; i++) {

				if (number % i == 0) {
					isPrime = false;
				}
			}

			if (isPrime == true) {
				System.out.println(number + " : sayı asaldır");
			} else {
				System.out.println(number + " : sayı asal değildir");
			}
		}
	}

}
