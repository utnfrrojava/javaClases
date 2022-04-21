import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		System.out.println("Ingrese el numero clave: ");
		int keyNumber = Integer.parseInt(lector.nextLine());
		
		
		Integer[] numbers = new Integer[20];
		
		for(int i=0; i<20; i++) {
			System.out.println("Ingrese el numero: "+(i+1)+" -> ");
			int number = Integer.parseInt(lector.nextLine());
			if (number > keyNumber) {
				numbers[i] = number;
			}
		}
		
		System.out.println("Los numeros mayores a "+keyNumber+" son: ");
		for(int i=0; i<20; i++) {
			if (numbers[i] != null) {
				System.out.println(numbers[i]);				
			}
		}
		lector.close();
	}

}