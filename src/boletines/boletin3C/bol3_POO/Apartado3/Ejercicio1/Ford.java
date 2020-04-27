package boletines.boletin3C.bol3_POO.Apartado3.Ejercicio1;

public class Ford extends Vehiculo{
	
	private int year;
	private int manufacturerDiscount;
	
	public Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount) {
		super(speed, regularPrice, color);
		this.year = year;
		this.manufacturerDiscount = manufacturerDiscount;
	}

	@Override
	public String toString() {
		return super.toString()+ " & Ford [year=" + year + ", manufacturerDiscount=" + manufacturerDiscount + "]";
	}
	
	@Override
	public double getSalePrice() {
		// TODO Auto-generated method stub
		return super.getSalePrice()-(super.getSalePrice()*((double)manufacturerDiscount/100));
	}
	
	

}
