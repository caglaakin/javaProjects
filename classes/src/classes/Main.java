package classes;

public class Main {

	public static void main(String[] args) {
		
		//reference type
		CustomerManager customerManager = new CustomerManager();
		CustomerManager customerManager2 = new CustomerManager();
		customerManager = customerManager2;
		//böyle bir durumda customerManager ı new olarak tanımlamak anlaşsızlaşır.
		//Çünkü referans olarak stack te aynı referans numarasını alırlar ve
		//heapte aynı alanda tutulurlar.
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();
		
		//value type
		int sayi1 = 10;
		int sayi2 = 20;
		sayi2 = sayi1;
		sayi1 = 30;
		System.out.println(sayi2);
		/*değer tiplerinde her şey stackte olur
		stack de değişken oluşur ve değer orada tutulur
		burada sayi2 olarak ekrana 10 yazdırılır üzerinde direkt olarak değişiklik yapılır.*/
		
		int[] sayilar1 = new int[] {1,2,3};
		int[] sayilar2 = new int[] {4,5,6};
		sayilar2 = sayilar1; 
		//bellekte 1 nesne var 2 değişken tek nesneyi tutuyor gibi düşünülebilir.
		sayilar1[0] = 10;
		System.out.println(sayilar2[0]);
		/*diziler referans tiplerdir.
		stack de referans numarası oluştu
		heap de alanı oluşturuldu ve tutuldu
		sayilar2 dizisi her zaman heapteki sayilar1 dizisine yol gösterilir 
		Sonuç olarak sayilar1[0] değerini 10 yaptığımızda sayilar2[0] da aynı diziye 
		yol gösterildiği için değer olarak 10 verir. 1 değil! */
	}

}
