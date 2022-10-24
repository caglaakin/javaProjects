package oopWithNLayeredAppC.dataAccess;

import oopWithNLayeredAppC.entities.Product;

public class JdbcProductDao implements ProductDao {
	
	//productdao implementinde olan değerler burada da aynı şekilde yer almalı 
	//productdao da add ise burada da add olmalı add2 olamaz!!!!
	public void add(Product product) {
		//sadece db erişim kodları buraya yazılır
		System.out.println("JDBC ile veritabanına eklendi ");
	}
}

//Dao Data Access Object 