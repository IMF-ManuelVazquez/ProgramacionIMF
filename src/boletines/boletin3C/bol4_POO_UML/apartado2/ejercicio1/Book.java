package boletines.boletin3C.bol4_POO_UML.apartado2.ejercicio1;

import java.util.Arrays;

public class Book {
	
	private String name;
	private Autor[] autor;
	private double price;
	private int qty;
	
	public Book(String name, Autor[] autor, double price) {
		super();
		this.name = name;
		this.autor = autor;
		this.price = price;
	}
	public Book(String name, Autor[] autor, double price, int qty) {
		super();
		this.name = name;
		this.autor = autor;
		this.price = price;
		this.qty = qty;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Autor[] getAutor() {
		return autor;
	}
	public void setAutor(Autor[] autor) {
		this.autor = autor;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	@Override
	public String toString() {
		return "Book [name=" + name + ", autor=" + Arrays.toString(autor) + ", price=" + price + ", qty=" + qty + "]";
	}
	
	
	
	
}
