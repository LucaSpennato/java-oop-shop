package generation.italy.shop;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Inserisci il nome del prodotto: \r");
		String name = sc.nextLine();
		
		System.out.print("Inserisci la descrizone del prodotto: \r");
		String description = sc.nextLine();
		
		System.out.print("Inserisci il prezzo del prodotto: \r");
		int price = sc.nextInt();
		
		Prodotto p = new Prodotto(name, description, price);
		System.out.println(p);
		
		int getProductPrice = p.getPrice();
		System.out.println("Product price getter: " + getProductPrice);
		
		int getPriceWithIva = p.getPriceWithIva();
		System.out.println("Product price plus iva: " + getPriceWithIva);
	}
	
}
