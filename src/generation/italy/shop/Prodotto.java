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
		iva = 20;
		
	}
	
	public int getPrice() {
		return price;
	}
	
	public int getPriceWithIva() {
		return price + (price * iva / 100);
	}
	
	@Override
	public String toString() {
		return "Code: " + code + "\nName: " + name
				+ "\nDescription: " + description
				+ "\nPrice: " + price
				+"\nIva: " + iva;
	}

}
