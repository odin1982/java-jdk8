package mx.javaEsencial._04.clasesObjetosMetodos;

public class Main {
	public static void main(String[] args) {
		CuentaBancaria cuentaDeJuan = new CuentaBancaria();
		cuentaDeJuan.titular = "Juan Martinez";
		cuentaDeJuan.tipoDeCuenta = "nomina";
		cuentaDeJuan.saldo = 23500;
		
		System.out.println("Cual es el saldo de la cuenta de Juan: " + cuentaDeJuan.saldo);
		
		cuentaDeJuan.sacarDinero(-500);
		System.out.println("Cual es el saldo de la cuenta de Juan: " + cuentaDeJuan.saldo);
		
		cuentaDeJuan.ingresarDinero(1000);
		System.out.println("Cual es el saldo de la cuenta de Juan: " + cuentaDeJuan.saldo);
		
		System.out.println("Cual es el saldo de la cuenta de Juan: " + cuentaDeJuan.obtenerSaldo());
	}
}
