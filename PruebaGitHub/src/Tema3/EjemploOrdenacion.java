package Tema3;

public class EjemploOrdenacion {

	public static void burbuja(int numeros[]) {
		
		int aux;
		
		for(int i=numeros.length; i > 0; i--) {
			for (int j=0; j <i-1; j++) {
				if (numeros[j] > numeros[j+1]) {
					//Intercambiar
					aux  = numeros[j+1];
					numeros[j+1] = numeros[j];
					numeros[j] = aux;
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		int nums[] = new int[20];
		
		for(int i=0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() *100) +1;
		}
		
		for(int i=0; 1 < nums.length; i++) {
			System.out.print(nums[i] + ", "); 
		}
		
	}
	

}
