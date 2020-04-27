package boletines.boletin3C.bol3_POO.Apartado3.Ejercicio1;

public class Furgoneta extends Vehiculo{
	
	private int weight;

	public Furgoneta(int speed, double regularPrice, String color, int weight) {
		super(speed, regularPrice, color);
		this.weight = weight;
	}

	@Override
	public String toString() {
		
		String strPadre = super.toString();
		String strHijo = strPadre + " & Furgoneta [weight=" + weight + "]";
		
		return strHijo;
	}
	
	
	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	

	@Override
	public double getSalePrice() {
		
		if (this.weight>2000) {
			return (super.getRegularPrice()-(super.getRegularPrice()*0.1));
		}else {
			return (super.getRegularPrice()-(super.getRegularPrice()*0.2));
		}
		
	}

	
}
