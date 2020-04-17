package boletines.boletin3C.bol4_POO_UML.apartado2.ejercicio1;

public class Autor {
	
	private String name;
	private String email;
	private char gender;
	public Autor(String name, String email, char gender) {
		super();
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Autor [name=" + name + ", email=" + email + ", gender=" + gender + "]";
	}

}
