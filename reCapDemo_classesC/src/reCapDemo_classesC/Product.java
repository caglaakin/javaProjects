package reCapDemo_classesC;

public class Product {
	//Constructor
	public Product(int id, String name, String description, double price, int stockAmount, String renk) {
		System.out.println("Yapıcı blok çalıştı. Ürün oluşturuldu.");
		//Main de new ile oluşturulan Product nesnesi oluştuğunda ilk yapılacak şeylerin yazıldığı kısım
		this.id=id;
		this.name=name;
		this.price=price;
		this.stockAmount=stockAmount;
		this.renk=renk;
	
	} 
	//iki method da çalışır.
	//overloading
	public Product() {
		
	}

	private int id;
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String renk;
	private String kod;
	
	//Encapsulation
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStockAmount() {
		return stockAmount;
	}
	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}
	public String getRenk() {
		return renk;
	}
	public void setRenk(String renk) {
		this.renk = renk;
	}
	public String getKod() {
		kod = this.name.substring(0,1) + id;
		return kod;
	}
	
		
	
	
	/* 
	//attribute or field
	private int _id;
	private String _name;
	private String _description;
	private double _price;
	private int _stockAmount;
	private String _renk;
	private String _kod;
	
	public int getId() {
		return _id;
	}
	
	public void setId(int id) {
		//this.id = id;//this bu class demek
		_id = id;
	}
	
	public String get_name() {
		return _name;
	}

	public void set_name(String name) {
		this._name = name;
	}

	public String get_description() {
		return _description;
	}

	public void set_description(String description) {
		this._description = description;
	}

	public double get_price() {
		return _price;
	}

	public void set_price(double price) {
		this._price = price;
	}

	public int get_stockAmount() {
		return _stockAmount;
	}

	public void set_stockAmount(int stockAmount) {
		this._stockAmount = stockAmount;
	}

	public String get_renk() {
		return _renk;
	}

	public void set_renk(String renk) {
		this._renk = renk;
	}

	public String get_kod() {
		return _kod;
	}

	public void set_kod(String kod) {
		this._kod = kod;
	}*/

	
	
	
	
}
