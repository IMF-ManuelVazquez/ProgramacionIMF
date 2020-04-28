package boletines.boletin3C.bol3_POO.Apartado3.Ej3;

public class Perecedero extends Producto{

	private int diasACaducar;

	public Perecedero(String nombre, int unidades, double precio, int diasACaducar) {
		super(nombre, unidades, precio);
		this.diasACaducar = diasACaducar;
	}

	public int getDiasACaducar() {
		return diasACaducar;
	}

	public void setDiasACaducar(int diasACaducar) {
		this.diasACaducar = diasACaducar;
	}

	@Override
	public String toString() {
		return "Perecedero [diasACaducar=" + diasACaducar + "]";
	}
	

	@Override
	public double calcular() {
		System.out.println("Actualizado producto perecedero");
		
		if (this.diasACaducar<=1) {
			return super.calcular()/4;
		}else if (this.diasACaducar==2) {
			return super.calcular()/3;
		}else if (this.diasACaducar==3) {
			return super.calcular()/2;
		}else {
			return super.calcular();
		}
	}

}
