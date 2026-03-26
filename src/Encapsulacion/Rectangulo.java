package Encapsulacion;

public class Rectangulo {
	private double base;
	private double altura;
	
	public Rectangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}
	
	// Método del area
    public double area() {
        return base * altura;
    }

    // Método del perimetro
    public double perimetro() {
        return 2 * (base + altura);
    }

}
