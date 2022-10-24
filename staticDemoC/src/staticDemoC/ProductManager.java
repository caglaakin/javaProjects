package staticDemoC;

public class ProductManager {
	public void add(Product product) {
		if(ProductValidator.isValid(product)) {
			System.out.println("Eklendi");
		}else {
			System.out.println("Girilen veriler geçersiz.");
		}
		
		/*
		ProductValidator productValidator = new ProductValidator();
		productValidator.bisey();*/
		//static olmayan bisey methodunu kullanabilmek için nesneyi newlemek gerekir.
		
	}
	
	
	
}
