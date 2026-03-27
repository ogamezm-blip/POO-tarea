package Encapsulacion;

public class Producto {
	private int codigo;
	private String nombre;
	private double precio;
	
	public Producto(int codigo, String nombre, double precio) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public void aplicarDescuento(double porcentaje){
		this.precio -= this.precio * porcentaje;
		
	}
	
	// Getters para mostrar los datos.
    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public int getCodigo() { return codigo; }
}
