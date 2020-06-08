package ui;

import java.util.LinkedList;

public class UsoLinkedList2 {

	public static void main(String[] args) {
		// Creación
		LinkedList<String> mamals = new LinkedList<>();

		// Agregar elementos
		mamals.add("Dog");
		mamals.add("Horse");
		mamals.addFirst("Cat");
		mamals.addLast("Lion");
		
		System.out.println("Lista inicial");
		System.out.println(mamals);
		System.out.println();System.out.println();
		
		
		// Recuperar elementos sin alterar la colección
		System.out.println("Recuperar elementos");
		System.out.println("get(2): "+mamals.get(2));
		System.out.println("getFirst(): "+mamals.getFirst());
		System.out.println("getLast(): "+mamals.getLast());
		System.out.println("peek(): "+mamals.peek());
		System.out.println("peekFirst(): "+mamals.peekFirst());
		System.out.println("peekLast(): "+mamals.peekLast());
		System.out.println();System.out.println();

		
		System.out.println("Lista");
		System.out.println(mamals);
		System.out.println();System.out.println();
		
		
		// RemoverElementos
		System.out.println("Remover elementos");
		//se puede utilizar remove por índice y por objeto al igual que en un ArrayList
		
		System.out.println("Original: "+mamals);
		String primerElemento = mamals.removeFirst();
		String ultimoElemento = mamals.removeLast();
		System.out.println("Actual: "+mamals);
		System.out.println("Primero: "+primerElemento+" - Ultimo: "+ultimoElemento);
		System.out.println();System.out.println();
		
		
		
		//Otras formas de agregar y remover elementos compatibles con queues y otros lenguajes

		System.out.println("Original: "+mamals);
		mamals.push("Tiger"); //agrega al principio
		mamals.offer("Gorila"); //agrega al final, pero existen offerFirst y offerLast
		System.out.println("Luego de agregar: "+mamals);
		
		String primero = mamals.poll(); //remueve el primero
		String nuevoPrimero = mamals.pop(); //remueve el primero
		System.out.println("Primero: "+primero+" - Segundo: "+nuevoPrimero);
		System.out.println("Actual: "+mamals);
		System.out.println();System.out.println();
		
		
	}

}
