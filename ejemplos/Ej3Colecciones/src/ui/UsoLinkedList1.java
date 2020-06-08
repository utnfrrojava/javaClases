package ui;

import java.util.LinkedList;
import java.util.Collections;

public class UsoLinkedList1 {

	public static void main(String[] args) {
		// Creación
		LinkedList<String> mamals = new LinkedList<>();

		// Agregar elementos al final
		mamals.add("Dog");
		mamals.add("Horse");

		// Agregar elementos en una ubicación
		System.out.println("Lista inicial");
		System.out.println(mamals);
		System.out.println();System.out.println();
		
		
		System.out.println("Original: "+mamals);
		mamals.add(1,"Cat");
		mamals.add(3,"Lion");
		System.out.println("Actual: "+mamals);
		System.out.println();System.out.println();
		
		// mamals.add(5,"Gorila");
		// Se puede usar el add para agregar elementos en medio
		// Se puede indicar también la posición siguiente a la última
		// Pero si se excede la posición máxima se causa una excepción 

		
		
		
		// Recuperar elementos
		System.out.println("Primer elemento");
		System.out.println(mamals.get(0));
		// Las colecciones comienzan en 0
		System.out.println();System.out.println();
		
		// System.out.println(mamals.get(3));
		// si el índice exede el máximo del LinkedList genera una excepción
		
		
		// Recuperar el tamaño de un LinkedList
		System.out.println("Tamaño del LinkedList");
		System.out.println(mamals.size());
		System.out.println();System.out.println();

		System.out.println("Reemplazando elemento");
		
		
		// Reemplazar elementos
		System.out.println("Original: "+mamals);
		mamals.set(2,"Zebra");
		System.out.println("Actual: "+mamals);
		System.out.println();System.out.println();
		
		//mamals.set(5,"Gorila");
		// Setear un elemento en una posición que no existe genera una excepción

		
		// Remover elemenos
		System.out.println("Remover elemento por índice");
		System.out.println("Original: "+mamals);
		String cat = mamals.remove(1);
		System.out.println("Actual: "+mamals);
		System.out.println("Removido: "+cat);
		System.out.println();System.out.println();
		
		// mamals.remove(5);
		// Remover un elemento de una posición inexistente genera una excepción
		
		
		System.out.println("Remover elemento por objeto");
		System.out.println("Original: "+mamals);
		boolean lionRemoved= mamals.remove("Lion");
		boolean gorilaRemoved= mamals.remove("Gorila");
		System.out.println("Actual: "+mamals);
		System.out.println("¿Lion fue removido?: "+lionRemoved);
		System.out.println("¿Gorila fue removido?: "+gorilaRemoved);
		System.out.println();System.out.println();
		
		// Remover un elemento inexistente devuelve false, no genera una excepción
		// Remove por objeto utiliza el método equals de la clase
		
		
		// Revisar si un elemento se encuentra en la colección
		System.out.println("¿El LinkedList contiene Zebra?: "+ mamals.contains("Zebra"));
		System.out.println();System.out.println();
		
		// Obtener el índice de un elemento
		System.out.println("¿El índice de Dog?: "+ mamals.indexOf("Dog"));
		System.out.println("¿El índice de Cow?: "+ mamals.indexOf("Cow"));
		System.out.println();System.out.println();
		
		
		// Agregar multiples elementos
		LinkedList<String> animals = new LinkedList<>();
		animals.add("Crocodile");
		animals.addAll(mamals);
		
		System.out.println("Agregar varios elementos");
		System.out.println(animals);
		System.out.println();System.out.println();
		
		
		// Remover varios elementos
		System.out.println("Remover todos los elementos de otro LinkedList");
		animals.removeAll(mamals);
		System.out.println(animals);
		System.out.println();System.out.println();
		
		
		// Remover todos los elementos
		animals.clear();
		System.out.println("Vaciar un LinkedList");
		System.out.println(animals);
		System.out.println();System.out.println();
		
		
		
		// Iterar con for
		System.out.println("Iterar con for");
		for(int i = 0; i < mamals.size(); i++) {
		    System.out.print(mamals.get(i));
		    System.out.print(", ");
		}
		System.out.println();System.out.println();
		
		
		
		// Iterar con foreach
		System.out.println("Iterar con foreach");
		for(String animal : mamals) {
		    System.out.print(animal);
		    System.out.print(", ");
		}
		System.out.println();System.out.println();
		
		
		// Ordenar elementos
		mamals.add("Cow");
		mamals.add("Cat");
		System.out.println("Ordenar elementos");
		System.out.println("Original: "+mamals);
		Collections.sort(mamals);
		System.out.println("Actual: "+mamals);
		System.out.println();System.out.println();
		// sort se basa en el método compareTo de la clase.
		
	}

}
