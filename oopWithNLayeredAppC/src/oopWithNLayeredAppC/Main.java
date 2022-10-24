package oopWithNLayeredAppC;

import java.util.ArrayList;
import java.util.List;

import oopWithNLayeredAppC.business.ProductManager;
import oopWithNLayeredAppC.core.logging.DatabaseLogger;
import oopWithNLayeredAppC.core.logging.FileLogger;
import oopWithNLayeredAppC.core.logging.Logger;
import oopWithNLayeredAppC.core.logging.MailLogger;
import oopWithNLayeredAppC.dataAccess.HibernateProductDao;
import oopWithNLayeredAppC.dataAccess.JdbcProductDao;
import oopWithNLayeredAppC.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		
		//Logger[] loggers = {/*new DatabaseLogger(), new FileLogger(),new MailLogger()*/};
		List<Logger> loggers = new ArrayList<Logger>(){{add(new DatabaseLogger());/* add(new FileLogger());*/ add(new MailLogger());}};
		
		
		
		Product product1 = new Product(1,"iPhone Xr",10000);
		ProductManager productManager = new ProductManager(new JdbcProductDao(),loggers);
		productManager.add(product1);
		System.out.println("------------->");
		Product product2 = new Product(3,"Samsung A7",8000);
		ProductManager productManager2 = new ProductManager(new HibernateProductDao(),loggers);
		productManager2.add(product2);

	}

}
