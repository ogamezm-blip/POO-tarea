package Encapsulacion;

public class Termometro {
	private double celsius;

	public Termometro(double celsius) {
		super();
		this.celsius = celsius;
	}

	public double getCelcius() {
		return celsius;
	}

	public void setCelcius(double celsius) {
		if (celsius >= -273.15) {
            this.celsius = celsius;
        } else {
            System.out.println("Error: " + celsius + "°C es inferior al cero absoluto. Se ajustará a -273.15°C.");
            this.celsius = -273.15;
        }
	}
	
	public double getFahrenheit() {
        // Aplicamos la fórmula: (celsius * 9/5) + 32
        return (this.celsius * 9.0 / 5.0) + 32;
    }
	
	public void mostrarTemperaturas() {
        System.out.printf("Temperatura actual: %.2f°C\n", this.celsius);
        System.out.printf("Equivalente en Fahrenheit: %.2f°F\n", getFahrenheit());
    }
	
	public static void ejercicio6() {
		System.out.println("		EJERCICIO 6: CLASE TERMOMETRO");

        // Temperatura ambiente normal
        Termometro t1 = new Termometro(25.0);
        t1.mostrarTemperaturas();

        // Punto de congelación del agua
        Termometro t2 = new Termometro(0.0);
        t2.mostrarTemperaturas();

        // Menor al cero absoluto
        System.out.println("Intentando configurar temperatura extrema.");
        Termometro t3 = new Termometro(-300.0); 
        t3.mostrarTemperaturas();

        // Cambiando la temperatura manualmente usando el setter
        System.out.println("Ajustando temperatura de T1 a 100°C (Ebullición).");
        t1.setCelcius(100.0);
        t1.mostrarTemperaturas();
    }
	
}
