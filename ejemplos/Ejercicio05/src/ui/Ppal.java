package ui;

import java.util.Scanner;

import javax.swing.JOptionPane;

import entidades.*;

public class Ppal {
	static Scanner lector;
	public static void main(String[] args) {
		
		Empleado[] empleados = new Empleado[3];
		lector=new Scanner(System.in);
		
		Administrativo a=new Administrativo();
		cargaDatosComunes(a);
		a.setHsExtra(50);
		a.setHsMes(100);
		a.setSueldoBase(1000);
		
		
		empleados[0]=a;
		
		empleados[1]=new Vendedor();
		cargaDatosComunes(empleados[1]);
		((Vendedor)empleados[1]).setTotalVtas(500);
		((Vendedor)empleados[1]).setSueldoBase(2000);
		((Vendedor)empleados[1]).setPorcenComision(10);
		
		empleados[2]=new Vendedor();
		cargaDatosComunes(empleados[2]);
		((Vendedor)empleados[2]).setTotalVtas(1000);
		((Vendedor)empleados[2]).setSueldoBase(100);
		((Vendedor)empleados[2]).setPorcenComision(20);
		
		for (Empleado empleado : empleados) {
			System.out.println("DNI: "+empleado.getDni());
//			if (empleado instanceof Administrativo) {
//				System.out.println("HS extra: "+((Administrativo)empleado).getHsExtra());
//			}
			System.out.println(empleado.getDetalle()+ empleado.getSueldo());
		}
		lector.close();
	}
	
	public static void cargaDatosComunes(Empleado e) {
		System.out.print("ingrese dni: ");
		e.setDni(Integer.parseInt(lector.nextLine()));
		
		System.out.print("ingrese apellido: ");
		e.setApellido(lector.nextLine());
	}
	
}
