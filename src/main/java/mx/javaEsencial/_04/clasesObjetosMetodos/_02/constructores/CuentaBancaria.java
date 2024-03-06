package mx.javaEsencial._04.clasesObjetosMetodos._02.constructores;

public class CuentaBancaria {
	String titular;
	String tipoDeCuenta;
	double saldo;
	
	public CuentaBancaria() {
		this.tipoDeCuenta = "ahorro";
	}
	
	public CuentaBancaria(String titular,double saldo) {
		this.titular = titular;
		this.tipoDeCuenta = "ahorro";
		this.saldo = saldo;
	}
	
	
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
