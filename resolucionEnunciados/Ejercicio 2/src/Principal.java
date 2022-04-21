import java.util.*;

public class Principal {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		ArrayList<String> words = new ArrayList<>();
		
		for(int i=1; i<=10; i++) {
			System.out.println("Ingrese la palabra numero: "+i+" -> ");
			words.add(lector.nextLine());
		}
		

		System.out.println("Las palabras ingresadas en orden inverso son: ");
		for(int i=9; i>=0; i--) {
			System.out.println(words.get(i));
		}
		
		lector.close();

	}

}
