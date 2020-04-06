package ui;

import entidades.*;

public class Principal {

	public static void main(String[] args) {
		
		Persona p1 = new Persona();
		
		System.out.println("p1 sin param:: "+p1.getDetalle(true));
		
		p1.setDni(11111111);
		p1.setApellido("Perez");
		p1.setNombre("Juan");
		
		System.out.println("p1 después de set:: "+p1.getDetalle(true));
		
		Persona p2 = new Persona(22222222,"Doe","John");
		System.out.println("p2:: "+p2.getDetalle());
		
		Alumno a1 = new Alumno();
		
		System.out.println("a1:: "+a1.getDetalle(true));
		
		Alumno a2= new Alumno(123, 33333333,"Alumno", "Ejemplar");
		
		System.out.println("a2:: "+a2.getDetalle());
		
		Persona a3 = new Alumno();
		
		a3.setDni(44444444);
		a3.setApellido("Algo");
		a3.setNombre("Extraño");
		((Alumno)a3).setLegajo(456);
		
		System.out.println("a3:: "+a3.getDetalle(true));
		
	}

}
