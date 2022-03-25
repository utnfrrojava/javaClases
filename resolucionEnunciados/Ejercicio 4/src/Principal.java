import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		System.out.println("Ingrese el numero clave: ");
		int keyNumber = Integer.parseInt(lector.nextLine());
		
		
		ArrayList<Integer> numbers = new ArrayList<>();
		
		for(int i=1; i<=20; i++) {
			System.out.println("Ingrese el numero: "+i+" -> ");
			int number = Integer.parseInt(lector.nextLine());
			if (number > keyNumber) {
				numbers.add(number);
			}
		}
		
		System.out.println("Los numeros mayores a "+keyNumber+" son: "+numbers);
		lector.close();
	}

}