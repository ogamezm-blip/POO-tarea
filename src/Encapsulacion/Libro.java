package Encapsulacion;

public class Libro {
	private String titulo;
	private String autor;
	private int paginas;
	
	public Libro(String titulo, String autor, int paginas) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.paginas = paginas;
	}
	
	public boolean esLargo() {
		return this.paginas > 300;
	}
	
	// Getters para leer los datos
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getPaginas() { return paginas; }	
}
