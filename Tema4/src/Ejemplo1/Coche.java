package Ejemplo1;

public class Coche {

	public String marca;
	public String modelo;
	public String color;
	public double precio;
	
	
	
	public Coche(String marca, String modelo, String color, double precio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.precio = precio;
	}



	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public String getModelo() {
		return modelo;
	}



	public void setModelo(String modelo) {
		this.modelo = modelo;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public double getPrecio() {
		return precio;
	}



	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	public boolean vender( ) {
		if (this.precio > 10000) {
			return true;
		}
		
		return false;
	}
	
	
	public String pintar() {
		String cocheStr = "";
		cocheStr += this.marca + " - " + this.color + " - " + this.precio;
		
		return cocheStr;
	}
	
	
}
