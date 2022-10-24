package reCapDemo_classesC;

public class Main {

	public static void main(String[] args) {
		/*DortIslem dortIslem = new DortIslem();
		int sonuc = dortIslem.Topla(3, 4);
		System.out.println(sonuc);*/
		
		Product product = new Product(1,"Laptop","Dell Laptop",10000,5,"Siyah");
		/*product.setName("Laptop");
		product.setId(115643);
		product.setDescription("Dell Laptop");
		product.setPrice(10000);
		product.setStockAmount(5);*/
		
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
		System.out.println(product.getKod());
		
		
	}

}
