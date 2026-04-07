package Encapsulacion;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;

    // Constructor 
    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    // Método para imprimir
    public void mostrar() {
        System.out.println("\nNombre: " + nombre + " " + apellido + " \nEdad: " + edad);
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		if (edad < 0) {
            System.out.println("\nError: La edad no puede ser negativa.");
            this.edad = 0;
        } else {
            this.edad = edad; 
        }
	}
	
	public static void ejercicio1() {
		System.out.println("		EJERCICIO 1: CLASE PERSONA");
        
        // 3 objetos de la clase persona
        Persona p1 = new Persona("Luis", "López", 20);
        Persona p2 = new Persona("Roberto", "Garcia", 28);
        Persona p3 = new Persona("Lucía", "Ramirez", 25);
        
        p1.setEdad(-20); 
    
        // Llamando al método mostrar()
        p1.mostrar();
        p2.mostrar();
        p3.mostrar();
    }
}
