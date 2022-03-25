package primerEjercicio;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Diez primeros numeros enteros:");
		for(int i=0; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println('\n');
		System.out.println("Diez primeros numeros impares:");
		int impares = 1;
		for(int i=0; impares <= 10; i++) {
			if(i%2!=0) {
				impares++;
				System.out.println(i);				
			}
		}
		
	}

}
