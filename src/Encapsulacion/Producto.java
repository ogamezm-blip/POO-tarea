package Encapsulacion;

public class Producto {
	private String codigo;
	private String nombre;
	private double precio;
	private int stock;
	
	public Producto(String codigo, String nombre, double precio, int stock) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.stock =  stock;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		if (precio > 0) {
            this.precio = precio;
        } else {
            System.out.println("\nError: El precio de '" + this.nombre + "' Debe ser mayor a Cero.");
        }
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		if (stock >= 0) {
            this.stock = stock;
        } else {
        	System.out.println("\nError: El Stock de '" + this.nombre + "' no puede ser negativo.");
        	this.stock = 0;
        }
	}
	
	public void vender(int cantidad) {
		if (cantidad <= 0)
			System.out.println("\nError: La cantidad a vender debe ser mayor a 0");
		else if (cantidad <= this.stock) {
			this.stock -= cantidad;
			System.out.println("\nVenta exitosa: " + cantidad + " unidad(es) de " + this.nombre + ". Stock restante: " + this.stock);
		}else {
            System.out.println("\nError en venta: No hay suficiente stock para " + this.nombre + ". Stock actual: " + this.stock);
		}
	}

	public void aplicarDescuento(double porcentaje){
		this.precio -= this.precio * (porcentaje / 100);
	}
	
	public static void ejercicio2() {
		System.out.println("		EJERCICIO 2: CLASE PRODUCTO");
        
        Producto prod1 = new Producto("1", "Manzanas", 5.5, 10);
        Producto prod2 = new Producto("2", "Peras", 8.75, 8);
        
        System.out.println("Antes del descuento. Producto 1: " + prod1.getNombre() + " (Código: " + prod1.getCodigo() +  ", Precio original: Q." + prod1.getPrecio());
        System.out.println("Antes del descuento. Producto 2: " + prod2.getNombre() + " (Código: " + prod2.getCodigo() + ", Precio original: Q." + prod2.getPrecio());
        
        prod1.aplicarDescuento(18);
        prod2.aplicarDescuento(20);
        
        System.out.println("\nDespues del descuento. Producto 1: " + prod1.getNombre() + " (Código: " + prod1.getCodigo() + "). Nuevo precio: Q." + prod1.getPrecio() + " Stoks: " + prod1.getStock());
        System.out.println("Despues del descuento. Producto 1: " + prod2.getNombre() + " (Código: " + prod2.getCodigo() + "). Nuevo precio: Q." + prod2.getPrecio() + " Stoks: " + prod2.getStock());
        
        prod1.vender(5);
        prod2.vender(10);
        prod1.vender(-5);
    }
}
