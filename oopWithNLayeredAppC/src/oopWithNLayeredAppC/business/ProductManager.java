package oopWithNLayeredAppC.business;

import java.util.List;

import oopWithNLayeredAppC.core.logging.Logger;
import oopWithNLayeredAppC.dataAccess.ProductDao;
//import oopWithNLayeredAppC.dataAccess.JdbcProductDao;
import oopWithNLayeredAppC.entities.Product;

public class ProductManager {
	private ProductDao productDao;
	//private Logger[] loggers; //List<Logger>
	private List<Logger> loggers;
	
	public ProductManager(ProductDao productDao, List<Logger> loggers) {
		this.productDao = productDao;
		this.loggers = loggers;
	}

	public void add(Product product) throws Exception { //response request patern
		//bu methodu çağırırsan hata fırlatabilir
		//iş kuralları business rules
		if(product.getUnitePrice()<10) {
			throw new Exception("Ürün fiyatı 10 dan küçük olamaz");
		}//throw çalışırsa uygulama durur.
		
		/*iş kurallarında geçince burdan devam eder
		
		ProductDao productDao = new JdbcProductDao();
		Bu şekilde tanımlamaya uğraşmıyoruz. Constructor tanımlarken productdaoyu veriyoruz.
		*/
		productDao.add(product);
		
		for(Logger logger : loggers) { //[db,mail]
			logger.log(product.getName());
		}
		
		
	}
}
