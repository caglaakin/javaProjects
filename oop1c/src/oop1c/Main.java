package oop1c;

import javax.print.attribute.standard.PrinterMessageFromOperator;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Vade oranı";

		Product product1 = new Product();
		// set value
		product1.setName("Delongi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		product1.setImageUrl("image1.jpg");
		
		// get value
		// System.out.println(product1.name);

		Product product2 = new Product();
		product2.setName("Smeg Kahve Makinesi");
		product2.setDiscount(8);
		product2.setUnitPrice(6500);
		product2.setUnitsInStock(4);
		product2.setImageUrl("image2.jpg");
		
		Product product3 = new Product();
		product3.setName("Kitchen Aid Kahve Makinesi");
		product3.setDiscount(9);
		product3.setUnitPrice(4500);
		product3.setUnitsInStock(4);
		product3.setImageUrl("image3.jpg");
		
		Product[] products = {product1,product2,product3};
		

		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>" + product.getName() + "</li>");
		}
		System.out.println("</ul>");
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("154321");
		individualCustomer.setCustomerNumber("459");
		individualCustomer.setFirstName("Çağla");
		individualCustomer.setLastName("Karabudak Akın");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setPhone("0512366");
		corporateCustomer.setTaxNumber("5548656");
		corporateCustomer.setCustomerNumber("1557");
		
		Customer[] customers = {individualCustomer,corporateCustomer};
		
		
		
		

	}

}
