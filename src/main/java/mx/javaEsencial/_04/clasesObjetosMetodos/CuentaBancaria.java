package mx.javaEsencial._04.clasesObjetosMetodos;

public class CuentaBancaria {
	String titular;
	String tipoDeCuenta;
	double saldo;
	
	public CuentaBancaria() {}
	
	public CuentaBancaria(String titular, String tipoDeCuenta, double saldo) {
		this.titular = titular;
		this.tipoDeCuenta = tipoDeCuenta;
		this.saldo = saldo;
	}

	void sacarDinero(double cantidad) {
		if(cantidad < 0)
			return;
		saldo -= cantidad;
	}
	
	void ingresarDinero(double cantidad) {
		saldo += cantidad;
	}
	
	void cambiarTipoDecuenta(String nuevoTipo) {
		tipoDeCuenta = nuevoTipo;
	}
	
	double obtenerSaldo() {
		return saldo;
	}

}
