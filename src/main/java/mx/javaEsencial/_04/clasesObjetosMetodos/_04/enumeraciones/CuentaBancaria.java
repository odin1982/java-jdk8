package mx.javaEsencial._04.clasesObjetosMetodos._04.enumeraciones;

public class CuentaBancaria {
	String titular;
	TipoDeCuenta tipoDeCuenta;
	double saldo;
	
	final double COMISION = 1.2;
	
	public CuentaBancaria() {
		this.tipoDeCuenta = TipoDeCuenta.AHORRO;
	}
	
	public CuentaBancaria(String titular,double saldo) {
		this.titular = titular;
		this.tipoDeCuenta = TipoDeCuenta.AHORRO;
		this.saldo = saldo;
	}
	
	
	public CuentaBancaria(String titular, TipoDeCuenta tipoDeCuenta, double saldo) {
		this.titular = titular;
		this.tipoDeCuenta = tipoDeCuenta;
		this.saldo = saldo;
	}

	void sacarDinero(double cantidad) {
		if(cantidad < 0)
			return;
		double comision = 0;
		if(this.tipoDeCuenta.equals(TipoDeCuenta.AHORRO)) {
			comision = COMISION;
		}
		saldo -= cantidad;
		saldo -= comision;
	}
	
	void ingresarDinero(double cantidad) {
		saldo += cantidad;
	}
	
	void cambiarTipoDecuenta(TipoDeCuenta nuevoTipo) {
		tipoDeCuenta = nuevoTipo;
	}
	
	double obtenerSaldo() {
		return saldo;
	}
	
	double calcularComision() {
		switch(tipoDeCuenta) {
			case AHORRO:
				return COMISION;
			case NOMINA:
				return 0;
			default:
				return 0;
		}
	}

}
