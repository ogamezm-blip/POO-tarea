package Encapsulacion;

public class main {

	public static void main(String[] args) {
        System.out.println("		EJERCICIO 1: CLASE PERSONA");
        
        // 3 objetos de la calse persona
        Persona p1 = new Persona("Luis", "López", 22);
        Persona p2 = new Persona("Roberto", "Garcia", 28);
        Persona p3 = new Persona("Lucía", "Ramirez", 25);
        
        // Llamando al método mostrar()
        p1.mostrar();
        p2.mostrar();
        p3.mostrar();
        
	}

}
