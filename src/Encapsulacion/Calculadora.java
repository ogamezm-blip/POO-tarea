package Encapsulacion;

public class Calculadora {
	// Suma
    public double sumar(double a, double b) {
        return a + b;
    }

    // Resta
    public double restar(double a, double b) {
        return a - b;
    }

    // Multiplicacion
    public double multiplicar(double a, double b) {
        return a * b;
    }

    // Division
    public double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Error: No se puede dividir entre cero.");
            return 0;
        }
        return a / b;
    }
	
}
