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
    
    public static void ejercicioLibro() {
    	System.out.println("\n\n		EJERCICIO 5: CLASE LIBRO");
        // 3 objetos: 3 libros
        Libro libro1 = new Libro("El Señor de los Anillos", "Juan Jose", 1178);
        Libro libro2 = new Libro("El Principito", "Roberto Bolaño", 96);
        Libro libro3 = new Libro("Cien Años de Soledad", "Gabriel Garcia Marquez", 417);

        // Evaluacion del libro 1
        if (libro1.esLargo()) {
            System.out.println("- '" + libro1.getTitulo() + "' es un libro largo (" + libro1.getPaginas() + " paginas).");
        }

        // Evaluacion del libro 2
        if (libro2.esLargo()) {
            System.out.println("- '" + libro2.getTitulo() + "' es un libro largo (" + libro2.getPaginas() + " paginas).");
        }

        // Evaluacion del libro 3
        if (libro3.esLargo()) {
            System.out.println("- '" + libro3.getTitulo() + "' es un libro largo (" + libro3.getPaginas() + " paginas).");
        }
    }
}
