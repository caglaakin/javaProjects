package polymorphismDemoC;

public class CustomerManager {
	private BaseLogger baseLogger;

	public CustomerManager(BaseLogger baseLogger) {
		this.baseLogger = baseLogger;
	}

	public void add() {
		System.out.println("Müşteri eklendi");
		this.baseLogger.log("Log mesajı");
		
		
		
		/*DatabaseLogger logger = new DatabaseLogger();
		logger.Log("Log mesajı");*/ 
		//Bu şekilde kod database loggera bağlı olarak çalışıyor değiştirmesi ve uyumlaması zor olur o yüzden kullanılmaz!!!
	}

}
