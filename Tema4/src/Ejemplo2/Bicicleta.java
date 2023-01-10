package Ejemplo2;

public class Bicicleta {

	public boolean esElectrica;
	public String marca;
	public String frenos;
	public String cambio;
	public String orquilla;
	public String material;
	public double precio;
	
	
	
	public Bicicleta(boolean esElectrica, String marca, String frenos, String cambio, String orquilla, String material,
			double precio) {
		super();
		this.esElectrica = esElectrica;
		this.marca = marca;
		this.frenos = frenos;
		this.cambio = cambio;
		this.orquilla = orquilla;
		this.material = material;
		this.precio = precio;
	}
	
	public Bicicleta() {
		super();
		this.esElectrica = false;
		this.precio = 1000;
		this.marca = "No tiene marca";
		this.frenos = "";
		this.cambio = "";
		this.orquilla = "";
		this.material = "Aluminio";
	}
	
	
	public double precioCondescuento() {
		double precioDescuento=0;
		
		if (this.esElectrica == true) {
			precioDescuento = this.precio * 0.85;
		} else {
			precioDescuento = this.precio * 0.95;
		}
		
		return precioDescuento;
	}
	
	
	
	
	
	
}
