package Encapsulacion;

public class Jugador {
	private String nombre;
	private int puntajeActual, puntajeMaximo;
	
	public Jugador(String nombre) {
		super();
		this.nombre = nombre;
		this.puntajeActual = 0;
		this.puntajeMaximo = 0;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPuntajeActual() {
		return puntajeActual;
	}
	public void setPuntajeActual(int puntajeActual) {
		this.puntajeActual = puntajeActual;
	}
	public int getPunrajeMaximo() {
		return puntajeMaximo;
	}
	public void setPunrajeMaximo(int punrajeMaximo) {
		this.puntajeMaximo = punrajeMaximo;
	}
	
	public void actualizarPuntaje(int nuevoPuntaje) {
        if (nuevoPuntaje < 0) {
            System.out.println("Error: El puntaje no puede ser negativo. Intento: " + nuevoPuntaje);
        } else {
            this.puntajeActual = nuevoPuntaje;
            System.out.println("Puntaje actualizado a: " + this.puntajeActual);

            // Si el nuevo es mayor al máximo, actualizamos el récord
            if (this.puntajeActual > this.puntajeMaximo) {
                this.puntajeMaximo = this.puntajeActual;
                System.out.println("¡NUEVO RÉCORD personal para " + nombre + "!");
            }
        }
    }
	
	public void mostrarEstadisticas() {
        System.out.println("	ESTADÍSTICAS DEL JUGADOR");
        System.out.println("Jugador:        " + nombre);
        System.out.println("Puntaje Actual: " + puntajeActual);
        System.out.println("Puntaje Máximo: " + puntajeMaximo);
    }
	
	public static void ejercicio9() {
		System.out.println("		EJERCICIO 9: CLASE JUGADOR");
        System.out.println("\n	BIENVENIDO AL JUEGO\n");

        Jugador j1 = new Jugador("Roberto");

        // Primera ronda: Puntaje bajo
        System.out.println("Ronda 1 finalizada...");
        j1.actualizarPuntaje(50);
        j1.mostrarEstadisticas();

        // Segunda ronda: Rompe su propio récord
        System.out.println("Ronda 2 finalizada...");
        j1.actualizarPuntaje(120);
        j1.mostrarEstadisticas();

        // Tercera ronda: Puntaje menor al récord
        System.out.println("Ronda 3 finalizada...");
        j1.actualizarPuntaje(80); // Cambia el actual, pero el máximo debe seguir en 120
        j1.mostrarEstadisticas();

        // Intento de puntaje negativo
        System.out.println("Intentando hackear puntaje con un valor negativo.");
        j1.actualizarPuntaje(-10);
        j1.mostrarEstadisticas();
    }
	
}
