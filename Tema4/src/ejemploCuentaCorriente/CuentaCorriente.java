package ejemploCuentaCorriente;

public class CuentaCorriente {

	private String numCuenta;
	private double saldo;
	
	public CuentaCorriente(double saldo) {
		super();
		this.numCuenta = CuentaCorriente.generarCuenta();
		this.saldo = saldo;
	}

	public String getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CuentaCorriente [numCuenta=");
		builder.append(numCuenta);
		builder.append(", saldo=");
		builder.append(saldo);
		builder.append("]");
		return builder.toString();
	}
	
	private String generarCuenta() {
		
		StringBuilder builder = new StringBuilder();
		builder.append("ES00");
		int digito=0;
		for(int i=0; i<15; i++) {
			digito = (int) (Math.random() * 10);
			builder.append(digito);
		}
		
		return builder.toString();
		
	}
	
	                                                                                .
	                                                                                
	
	
}
