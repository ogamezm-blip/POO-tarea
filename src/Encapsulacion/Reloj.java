package Encapsulacion;

public class Reloj {
	private int hora, minuto, segundo;

	public Reloj(int hora, int minuto, int segundo) {
		super();
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		if (hora >= 0 && hora <= 23) {
            this.hora = hora;
        } else {
            System.out.println("Error: Hora " + hora + " no válida (0-23).");
        }
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		if (minuto >= 0 && minuto <= 59) {
            this.minuto = minuto;
        } else {
            System.out.println("Error: Minuto " + minuto + " no válido (0-59).");
        }
	}

	public int getSegundo() {
		return segundo;
	}

	public void setSegundo(int segundo) {
		if (segundo >= 0 && segundo <= 59) {
            this.segundo = segundo;
        } else {
            System.out.println("Error: Segundo " + segundo + " no válido (0-59).");
        }
	}
	
	// Mostrar hora (HH:MM:SS)
    public String obtenerHoraFormateada() {
        // %02d significa: un número entero (d), de 2 dígitos (2), 
        // y si falta un dígito, rellena con un cero a la izquierda (0).
        return String.format("%02d:%02d:%02d", this.hora, this.minuto, this.segundo);
    }
    
    public static void ejercicio7() {
    	System.out.println("		EJERCICIO 7: CLASE RELOJ");

        // Una hora normal (mañana)
        Reloj r1 = new Reloj(9, 5, 2);
        System.out.println("Reloj 1: " + r1.obtenerHoraFormateada());

        // Una hora normal (noche)
        Reloj r2 = new Reloj(23, 59, 59);
        System.out.println("Reloj 2: " + r2.obtenerHoraFormateada());

        // Intento de hora inválida
        System.out.println("\nIntentando configurar hora errónea (25:70:90)");
        Reloj r3 = new Reloj(25, 70, 90);
        System.out.println("Reloj 3 (ajustado): " + r3.obtenerHoraFormateada());

        // Modificando con setters correctamente
        System.out.println("\nCorrigiendo Reloj 3 a las 12:30:00");
        r3.setHora(12);
        r3.setMinuto(30);
        r3.setSegundo(0);
        System.out.println("Reloj 3 corregido: " + r3.obtenerHoraFormateada());
    }
}
