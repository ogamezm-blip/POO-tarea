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
    
    public static void ejercicioCalculadora() {
    	System.out.println("\n\n		EJERCICIO 6: CLASE CALCULADORA");
        
        Calculadora calc = new Calculadora();
        double n1 = 15.0;
        double n2 = 4.0;
        double nCero = 0.0;

        System.out.println("Operaciones con " + n1 + " y " + n2 + ":");
        System.out.println("Suma: " + calc.sumar(n1, n2));
        System.out.println("Resta: " + calc.restar(n1, n2));
        System.out.println("Multiplicación: " + calc.multiplicar(n1, n2));
        System.out.println("División: " + calc.dividir(n1, n2));

        System.out.println("\nIntentando dividir " + n1 + " entre " + nCero + ":");
        double resultadoError = calc.dividir(n1, nCero);
    }
}
