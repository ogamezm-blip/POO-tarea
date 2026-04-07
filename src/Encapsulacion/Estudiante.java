package Encapsulacion;

public class Estudiante {
	private String carnet, nombre;
	private double promedio;
	
	public Estudiante(String carnet, String nombre, double promedio) {
		super();
		this.carnet = carnet;
		this.nombre = nombre;
		this.promedio = promedio;
	}
	
	public String getCarnet() {
		return carnet;
	}
	public void setCarnet(String carnet) {
		this.carnet = carnet;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPromedio() {
		return promedio;
	}
	public void setPromedio(double promedio) {
		if (promedio >= 0 && promedio <= 100) {
            this.promedio = promedio;
        } else {
            System.out.println("Error: El promedio " + promedio + " no es válido.");
        }
	}
	
	public boolean esBecado() {
        return this.promedio >= 85;
    }

    public void mostrarInfo() {
        System.out.println("Carnet: " + carnet);
        System.out.println("Estudiante: " + nombre);
        System.out.println("Promedio: " + promedio);
        // Usamos un operador ternario 
        System.out.println("¿Cuenta con Beca?: " + (esBecado() ? "SÍ (Felicidades)" : "NO"));
    }

    public static void ejercicio5() {
    	System.out.println("		EJERCICIO 5: CLASE ESTUDIANTE");
    	
        Estudiante e1 = new Estudiante("2024-001", "Gerson", 92.5);
        Estudiante e2 = new Estudiante("2024-002", "Roberto", 84.9); // es false
        Estudiante e3 = new Estudiante("2024-003", "Luis", 110.0); // Error

        e1.mostrarInfo();
        e2.mostrarInfo();
        e3.mostrarInfo();
    }
}
