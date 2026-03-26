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
        System.out.println("Nombre: " + nombre + " " + apellido + " \nEdad: " + edad);
    }
}
