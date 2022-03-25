import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		ArrayList<String> words = new ArrayList<>();
		
		for(int i=1; i<=3; i++) {
			System.out.println("Ingrese la palabra numero: "+i+" -> ");
			words.add(lector.nextLine());
		}
		
		System.out.println("Ingrese la palabra clave a comparar: ");
		String keyWord = lector.nextLine();
		boolean wasSaved = words.contains(keyWord);
		if (wasSaved) {
			System.out.println("Fue ingresada");
		} else {
			System.out.println("No fue ingresada");
		}
		
		lector.close();
	}

}