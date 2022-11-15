package Prueba;

public class Enumerados2 {

	enum NombreMes { ENERO, FEBRERO, MARZO, ABRIL, MAYO, JUNIO, JULIO, AGOSTO, SEPTIEMBRE, OCTUBRE, NOVIEMBRE, DICIEMBRE}
	enum Sexo { HOMBRE, MUJER, OTRO }
	
	public static void main(String[] args) {
		
		String mesCadena = "Enero";
		NombreMes mes = NombreMes.ENERO;
		Sexo sx = Sexo.HOMBRE;
		
		System.out.println("Mi primo nacio en " + mes);
		System.out.println("Mi primo tiene sexo " + sx);

	}

}
