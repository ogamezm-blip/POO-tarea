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
        
        //********************************************************************************************************************
        
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
        
        //********************************************************************************************************************
        System.out.println("\n		EJERCICIO 3: CLASE PRODUCTO");
        
        Producto prod1 = new Producto(1, "Manzanas", 5000);
        Producto prod2 = new Producto(2, "Peras", 6800);
        
        System.out.println("Antes del descuento. Producto 1: " + prod1.getNombre() + " (Código: " + prod1.getCodigo() +  ", Precio original: Q." + prod1.getPrecio());
        System.out.println("Antes del descuento. Producto 2: " + prod2.getNombre() + " (Código: " + prod2.getCodigo() + ", Precio original: Q." + prod2.getPrecio());
        
        prod1.aplicarDescuento(0.18);
        prod2.aplicarDescuento(0.20);
        
        System.out.println("\nDespues del descuento. Producto 1: " + prod1.getNombre() + " (Código: " + prod1.getCodigo() + "). Nuevo precio: Q." + prod1.getPrecio());
        System.out.println("Despues del descuento. Producto 1: " + prod2.getNombre() + " (Código: " + prod2.getCodigo() + "). Nuevo precio: Q." + prod2.getPrecio());
        
        //********************************************************************************************************************
        
        System.out.println("\n		EJERCICIO 4: CLASE CUENTA");
        // Objeto: mi cuenta inicial
        Cuenta miCuenta = new Cuenta("Leo", 500.0);
        
        System.out.println("Titular: " + miCuenta.getTitular());
        System.out.println("Saldo inicial: Q." + miCuenta.getSaldo());

        System.out.println("\n--- Realizando Operaciones ---");
        
        // Intentos de operacion
        miCuenta.depositar(200.0);
        miCuenta.retirar(100.0);
        
        // Retiro mayor al saldo
        miCuenta.retirar(1000.0);
        
        // Deposito negativo
        miCuenta.depositar(-50.0);

        System.out.println("\n--- Estado Final ---");
        System.out.println("Titular: " + miCuenta.getTitular());
        System.out.println("Saldo Final: Q." + miCuenta.getSaldo());
        
        
//********************************************************************************************************************
        
        System.out.println("\n		EJERCICIO 5: CLASE LIBRO");
        // 3 objetos: 3 libros
        Libro libro1 = new Libro("El Señor de los Anillos", "Juan Jose", 1178);
        Libro libro2 = new Libro("El Principito", "Roberto Bolaño", 96);
        Libro libro3 = new Libro("Cien Años de Soledad", "Gabriel Garcia Marquez", 417);

        // Evaluacion del libro 1
        if (libro1.esLargo()) {
            System.out.println("- '" + libro1.getTitulo() + "' es un libro largo (" + libro1.getPaginas() + " paginas).");
        }

        // Evaluacion del libro 2
        if (libro2.esLargo()) {
            System.out.println("- '" + libro2.getTitulo() + "' es un libro largo (" + libro2.getPaginas() + " paginas).");
        }

        // Evaluacion del libro 3
        if (libro3.esLargo()) {
            System.out.println("- '" + libro3.getTitulo() + "' es un libro largo (" + libro3.getPaginas() + " paginas).");
        }
        
        
//********************************************************************************************************************
        
        System.out.println("\n		EJERCICIO 6: CLASE CALCULADORA");
        
        
	}
}
