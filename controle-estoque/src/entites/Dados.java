package entites;

public class Dados {
	private String name ;
	private double price ;
	private int quantity ;
	
		
	public Dados(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}	
	public Dados(String name, double price){
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
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
	
	public double TotalValueinStock() {
		return price * quantity;
	}
	
	public void AddProducts (double quantity) {
		this.quantity += quantity;
	}
	
	public void RemoveProducts (double quantity) {
		this.quantity -= quantity;
	}
	
	public String toString () {
		return name
				  + ", $ "
				  + String.format("%.2f", price)
				  + ", "
				  + quantity
				  + " units, Total: $ "
				  + String.format("%.2f", TotalValueinStock ());	
	}
}
