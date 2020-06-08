package ui;

import java.util.Collections;
import java.util.LinkedList;
import entities.*;

public class UsoLinkedList3 {

	public static void main(String[] args) {
		
		LinkedList<Person> persons = new LinkedList<>();
		
		Person p=new Person(11111111,"John","Doe");
		Person p1=new Person(22222222,"Juan","Perez");
		
		persons.add(p);
		persons.push(p1);
		persons.add(new Person(33333333, "Fulano", "de Tal"));
		
		
		System.out.println("Uso de toString");
		System.out.println(persons);
		
		System.out.println();System.out.println();
		
		System.out.println("persons.get(1): "+persons.get(1));
		System.out.println();System.out.println();
		
		
		
		Person pCopy=new Person(11111111,"Johny","Doe");
		
		System.out.println("Uso de equals");
		System.out.println("Contains pCopy: "+persons.contains(pCopy));
		System.out.println();System.out.println();

		System.out.println("Uso de equals");
		System.out.println("Contains p: "+persons.contains(p));
		System.out.println();System.out.println();
		

		
		persons.add(pCopy);
		System.out.println("Uso de Comparable y compareTo");
		System.out.println("Unsorted:");
		System.out.println(persons);
		System.out.println();System.out.println();
		Collections.sort(persons);
		System.out.println("Sorted:");
		System.out.println(persons);		
		
		
		
		System.out.println("Uso de Comparators");
		System.out.println("Sorted by compareTo:");
		System.out.println(persons);
		System.out.println();System.out.println();
		Collections.sort(persons,new PersonLexicographicComparator());
		System.out.println("Sorted by comparator:");
		System.out.println(persons);
		
		/**/
		
	}

}
