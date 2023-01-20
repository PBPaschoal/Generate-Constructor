/* Rio de Janeiro, Dia 19 de Janeiro de 2023.
Aula 79 - Gerando automaticamente construtores, getters e setters com Eclipse:

Botão direito -> Source -> Generate Constructor using Fields

Botão direito -> Source -> Generate Getters and Setters */

package entities;

public class Product {
	
	private String name;
	private double price;
	private int quantity;
	
	public Product() {
	}

	public Product(String name, double price, int quantity) { //Criado automaticamente pelo Eclipse
		//super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	
	// Daqui
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	//public void setQuantity(int quantity) {
		//this.quantity = quantity;
	//}
	
	// Até aqui, foi gerado automaticamente pelo Eclipse

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}