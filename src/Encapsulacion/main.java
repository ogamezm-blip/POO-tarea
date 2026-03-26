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
        
        
        System.out.println("\n		EJERCICIO 2: CLASE RECTANGULO");
        
     // objetos de tipo Rectángulo
        Rectangulo r1 = new Rectangulo(10.5, 5.0);
        Rectangulo r2 = new Rectangulo(7.0, 8.0);

        // Mostrar datos
        System.out.println("Rectángulo 1: Área: " + r1.area() + " ; Perímetro: " + r1.perimetro());
        System.out.println("Rectángulo 2: Área: " + r2.area() + " ; Perímetro: " + r2.perimetro());

        // comparación
        System.out.print("\nResultado de la comparación: ");
        if (r1.area() > r2.area()) {
            System.out.println("El Rectángulo 1 es más grande.");
        } else if (r2.area() > r1.area()) {
            System.out.println("El Rectángulo 2 es más grande.");
        } else {
            System.out.println("Ambos tienen la misma área.");
        }
        
        
	}
}
