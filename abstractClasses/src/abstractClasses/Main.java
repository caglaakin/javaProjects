package abstractClasses;

public class Main {

	public static void main(String[] args) {
		
		/*GameCalculator gameCalculator = new GameCalculator() {
			
			@Override
			public void hesapla() {
				// TODO Auto-generated method stub
				
			}
		};*/
		
		//abstract sınıflar asla new lenemez!!
		
		GameCalculator gameCalculator = new WomanGameCalculator();
		gameCalculator.hesapla();

	}

}
