package boletines.boletin3C.bol5_POO_Abstract_Interface.Apartado1.Ej3;

public class MainCar {

	public static void main(String[] args) {
		
		// POLIMORFISMO: MISMA DEFINICION - MULTPLES FORMAS
		Car luxuCar = new LuxuryCar(Location.OCEANIA);
		Car sedanCar = new SedanCar(Location.EUROPA);
		Car smallCar = new SmallCar(Location.AFRICA);
		
//		System.out.println(luxuCar);
//		System.out.println(sedanCar);
//		System.out.println(smallCar);
//		
		Car[] garaje = new Car[3];
		garaje[0]= luxuCar;
		garaje[1]= sedanCar;
		garaje[2]= smallCar;
		
		for (int i = 0; i < garaje.length; i++) {
			System.out.println(garaje[i]);
		}

	}

}
