package Ejer1Clase;

public class Empleado {

	
	private String nombre;
	private String apellidos;
	private int edad;
	private String email;
	private double salarioMensualBruto;
	private double irpf;
	private double seguridadSocial;
	private String departamento;
	
	public Empleado() {
		super();
		nombre = "";
		apellidos = "";
		edad = 0;
		email = "";
		salarioMensualBruto = 0;
		irpf = 0;
		seguridadSocial = 0;
		departamento = "";
	}
	
	public Empleado(String nombre, String apellidos, int edad, String email, double salarioMensualBruto, double irpf,
			double seguridadSocial, String departamento) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.email = email;
		this.salarioMensualBruto = salarioMensualBruto;
		this.irpf = irpf;
		this.seguridadSocial = seguridadSocial;
		this.departamento = departamento;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
