package Prueba;

public class OperadoresUnitarios {

	public static void main(String[] args) {
		int a=0, b=0;
		
		a++; //a = a + 1
		
		
		for(a=0; a<10; a++) {
			System.out.println("La a vale: " + a);
			//System.out.println(++a); //Pintaria a sin sumarle 1
			System.out.println(a++); //Pintaria a habiendole primero sumando 1
		}
		a = 3 * 5 + 1;
		int res;
		a=3;
		b=5;
		res=a%b*3/5;
		
		System.out.println(res);
	}

}
