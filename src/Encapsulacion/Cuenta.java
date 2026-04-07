package Encapsulacion;

public class Cuenta {
	private String titular;
	private double saldo;
	private int pin;
	
	public Cuenta(int pin, String titular, double saldoInicial) {
		this.titular = titular;
		this.pin = pin;
		// Aca use el operador ternario, que sirve como un if-else en una sola linea de codigo
		this.saldo = (saldoInicial > 0) ? saldoInicial : 0;
	}
	
	public String getTitular() {
		return titular;
	}

	public void setTirular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getPin() {
		return pin;
	}

	public void depositar(double monto) {
		if (monto > 0) {
			this.saldo += monto;
			System.out.println("Deposito existoso: +Q." + monto);	
		} else {
			System.out.println("Error: El monto a depositar debe ser positivo.");
		}
	}
	
	public void retirar(double monto, int pinIngresado) {
        if (pinIngresado == this.pin) {
            if (monto <= 0) {
                System.out.println("Error: El monto a retirar debe ser mayor a 0.");
            } else if (monto > this.saldo) {
                System.out.println("Error: Saldo insuficiente para retirar Q." + monto + ". Saldo actual: Q." + this.saldo);
            } else {
                this.saldo -= monto;
                System.out.println("Operación exitosa. Has retirado: Q." + monto + ". Nuevo saldo: Q." + this.saldo);
            }
        } else {
            System.out.println("ACCESO DENEGADO: PIN incorrecto.");
        }
	}

	public void setPin(int pin) {
		if (this.pin != pin)
			System.out.println("Pin incorrecto.");
		else
			this.pin = pin;
			System.out.println("Retiro exitoso");
	}
	
	// Método para mostrar el estado general de la cuenta
    public void mostrarDatos() {
        System.out.println("Cuenta de: " + titular + "\nSaldo Disponible: Q." + saldo);
    }
    
    public static void ejercicio3() {
    	System.out.println("\n\n		EJERCICIO 4: CLASE CUENTA");
        // Objeto: mi cuenta inicial
        Cuenta miCuenta = new Cuenta(1234, "Leo", 500.0);
        miCuenta.mostrarDatos();

        System.out.println("\n--- Realizando Operaciones ---");
        
        // Intentos de operacion
        miCuenta.depositar(200.0);
        miCuenta.retirar(100.0, 1234);
        
        // Retiro mayor al saldo
        miCuenta.retirar(1000.0, 1245);
        miCuenta.retirar(1000.0, 1234);
        
        // Deposito negativo
        miCuenta.depositar(-50.0);
        
        System.out.println("\nEstado final de la cuenta:");
        miCuenta.mostrarDatos();
    }
	
}
