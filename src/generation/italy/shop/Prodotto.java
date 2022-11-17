package generation.italy.shop;

import java.util.Random;

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
		code = setCode();
		
	}
	
	public int getPrice() {
		return price;
	}
	
	public float getPriceWithIva() {
		return (float) price + ((float)(price * iva / 100f));
	}
	
	public int setCode() {
		Random rnd = new Random();
		
		return code = rnd.nextInt(99999);
	}
	
	@Override
	public String toString() {
		return "Code: " + code + "\nName: " + name
				+ "\nDescription: " + description
				+ "\nPrice: " + price
				+"\nIva: " + iva;
	}

}
