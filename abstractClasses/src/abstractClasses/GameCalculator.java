package abstractClasses;

public abstract class GameCalculator {
	
	public abstract void hesapla();
	//içeriği belirmek istemediğim durumlarda abstract yaparak bu sınıfı kim extend ediyorsa orada methodu kendine göre baştan yazmalı
	//abstract class içinde abstract method olmak zorunda değil 
	//tamamlanmış methodlarda olabilir tamamlanmamış abstrac methodlarda
	
	
	public final void gameOver(){
		System.out.println("Oyun bitti...");
	}
}
