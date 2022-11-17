package generation.italy.shop;

public class Prodotto {
	
	int code;
	String name;
	String description;
	int price;
	int iva;
	
	public Prodotto(String name, String description, int price) {
		
		this.name = name;
		this.description = description;
		this.price = price;
		
	}

}
