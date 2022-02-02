package CuentasBancarias;

public class Cuenta {

	private double dinero;
	
	public Cuenta(double dineroInicial){
		dinero = dineroInicial;
}
	
	public void AgregarDinero(double dineroAingresar) {
		dinero += dineroAingresar;
		
	}
	
	public double SacarDinero(double dineroAsacar) {
		if (dinero >= dineroAsacar) {
			dinero -= dineroAsacar;
			return dineroAsacar;
		}else
			return 0;
	}
	
	double verSaldo() {
		return dinero;
	}
	public static void main (String[] args) {
	Cuenta MiCuenta = new Cuenta(0);
	double disponible = MiCuenta.verSaldo();
	System.out.println(disponible);
	MiCuenta.AgregarDinero(1000);
	disponible = MiCuenta.verSaldo();
	System.out.println(disponible);
	}
}   
