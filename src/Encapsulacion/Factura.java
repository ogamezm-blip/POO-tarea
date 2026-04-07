package Encapsulacion;

public class Factura {
	private String codigoFactura, descripcion;
	private int cantidad;
	private double precioUnitario;
	public Factura(String codigoFactura, String descripcion, int cantidad, double precioUnitario) {
		super();
		this.codigoFactura = codigoFactura;
		this.descripcion = descripcion;
		this.cantidad = cantidad;
		this.precioUnitario = precioUnitario;
	}
	public String getCodigoFactura() {
		return codigoFactura;
	}
	public void setCodigoFactura(String codigoFactura) {
		this.codigoFactura = codigoFactura;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		if (cantidad > 0) {
            this.cantidad = cantidad;
        } else {
            System.out.println("Error: La cantidad debe ser al menos 1. Se asignará 1 por defecto.");
            this.cantidad = 1;
        }
	}
	public double getPrecioUnitario() {
		return precioUnitario;
	}
	public void setPrecioUnitario(double precioUnitario) {
		if (precioUnitario > 0) {
            this.precioUnitario = precioUnitario;
        } else {
            System.out.println("Error: El precio debe ser mayor a 0. Se asignará 0.01 como mínimo.");
            this.precioUnitario = 0.01;
        }
	}
	
	public double calcularTotal() {
        return this.cantidad * this.precioUnitario;
    }
	
	public void mostrarFactura() {
        System.out.println("	FACTURA DE VENTA");
        System.out.println("Código:      " + codigoFactura);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Cantidad:    " + cantidad);
        System.out.printf("Precio Unit: $%.2f\n", precioUnitario);
        System.out.println("--------------------------------------");
        System.out.printf("TOTAL A PAGAR: $%.2f\n", calcularTotal());
    }
	
	public static void ejercicio10() {
        // Factura válida
        Factura f1 = new Factura("F-001", "Laptop Gamer", 2, 1200.50);
        f1.mostrarFactura();

        // Factura con valores inválidos (Menores o iguales a 0)
        System.out.println("Intentando crear factura con valores erróneos.");
        Factura f2 = new Factura("F-002", "Mouse Pad", 0, -5.0);
        f2.mostrarFactura();

        // Modificando valores y viendo el total actualizarse
        System.out.println("Actualizando cantidad de la factura F-001.");
        f1.setCantidad(5);
        f1.mostrarFactura();
    }
}
