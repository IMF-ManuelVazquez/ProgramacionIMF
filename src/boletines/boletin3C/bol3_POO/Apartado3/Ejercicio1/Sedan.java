package boletines.boletin3C.bol3_POO.Apartado3.Ejercicio1;

public class Sedan extends Vehiculo{
	
	private int longitud;

	public Sedan(int speed, double regularPrice, String color, int longitud) {
		super(speed, regularPrice, color);
		this.longitud = longitud;
	}

	@Override
	public String toString() {
		return super.toString()+ " & Sedan [longitud=" + longitud + "]";
	}
	
	@Override
	public double getSalePrice() {
		// TODO Auto-generated method stub
		if (this.longitud>200) {
			return super.getSalePrice()-(super.getSalePrice()*0.05); //descuento 5%
		}else {
			return super.getSalePrice()-(super.getSalePrice()*0.1);  // descuento 10%
		}		
	}
	
	

}
