package boletines.boletin3C.bol3_POO.Apartado1.Ej4;

public class Book {

	private String nombre;
	private int ISBN;
	private String autor;
	private String editor;
	
	public Book(String nombre, int iSBN, String autor, String editor) {
		super();
		this.nombre = nombre;
		ISBN = iSBN;
		this.autor = autor;
		this.editor = editor;
		getBookInfo();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
		getBookInfo();
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
		getBookInfo();
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
		getBookInfo();
	}

	public String getEditor() {
		return editor;
	}

	public void setEditor(String editor) {
		this.editor = editor;
		getBookInfo();
	}
	

	@Override
	public String toString() {
		return "Book [nombre=" + nombre + ", ISBN=" + ISBN + ", autor=" + autor + ", editor=" + editor + "]";
	}

	private void getBookInfo() {
		System.out.println("-------------");
		System.out.println("Book info:");
		System.out.println("Nombre: "+this.nombre);
		System.out.println("ISBN: "+this.ISBN);
		System.out.println("Autor: "+this.autor);
		System.out.println("Editor: "+this.editor);
		System.out.println("-------------");
	}
	
}
