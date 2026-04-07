package Encapsulacion;

public class Contacto {
	private String nombre, telefono, email;

	public Contacto(String nombre, String telefono, String email) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
		this.email = email;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		// Validar que tenga exactamente 8 dígitos
        if (telefono.length() == 8) {
            this.telefono = telefono;
        } else {
            System.out.println("Error: El teléfono para '" + nombre + "' debe tener 8 dígitos. Se asignará '0000-0000'.");
            this.telefono = "0000-0000";
        }
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		// Validar que contenga el carácter '@'
        if (email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("Error: El correo '" + email + "' no es válido (falta @).");
        }
	}
	
	public void mostrarContacto() {
        System.out.println("	 DATOS DE CONTACTO");
        System.out.println("Nombre:   " + nombre);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Email:    " + email);
    }
	
	public static void ejercicio8() {
		System.out.println("		EJERCICIO 8: CLASE CONTACTO");

        // Contacto válido
        Contacto c1 = new Contacto("Roberto", "55443322", "roberto@email.com");
        c1.mostrarContacto();

        // Contacto con teléfono incorrecto (7 dígitos)
        Contacto c2 = new Contacto("Luis López", "1234567", "luis@email.com");
        c2.mostrarContacto();

        // Contacto con email incorrecto (sin @)
        Contacto c3 = new Contacto("Gerson", "88776655", "gerson_hotmail.com");
        c3.mostrarContacto();
        
        System.out.println("Corrigiendo el correo de Gerson");
        c3.setEmail("gerson@hotmail.com");
        c3.mostrarContacto();
    }
}
