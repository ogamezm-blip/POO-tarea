package Encapsulacion;

public class Cuenta {
	private String tirular;
	private double saldo;
	
	public Cuenta(String tirular, double saldoInicial) {
		this.tirular = tirular;
		
		// Aca use el operador ternario, que sirve como un if-else en una sola linea de codigo
		this.saldo = (saldoInicial > 0) ? saldoInicial : 0;
	}

	public void depositar(double monto) {
		if (monto > 0) {
			this.saldo += monto;
			System.out.println("Deposito existoso: +Q." + monto);	
		} else {
			System.out.println("Error: El monto a depositar debe ser positivo.");
		}
	}
	
	public void retirar(double monto) {
		if (monto <= 0) {
			System.out.println("Error: El monto a retirar debe ser mayor a cero");
		} else if (monto > this.saldo) {
			System.out.println("Transaccion rechazada: Saldo insuficiente para retirar Q." + monto);
		} else {
			this.saldo -= monto;
			System.out.println("Retiro exitoso: -Q." + monto);
		}
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public String getTitular() {
		return tirular;
	}
	
}
