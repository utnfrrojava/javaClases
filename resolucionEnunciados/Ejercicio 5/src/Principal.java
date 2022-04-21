import java.util.Scanner;

abstract class Empleado {
	protected String dni;
	protected String nombre;
	protected String apellido;
	protected String email;
	protected int sueldoBase;
	public double getSueldo() {
		return sueldoBase;
	}
	public void setValues(String dni, String nombre, String apellido, String email, int sueldoBase) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.sueldoBase = sueldoBase;
	}
	
	@Override
	public String toString() {
		return " " + this.nombre + " " + this.apellido + ", $" + this.getSueldo();
	}
}

class Administrativo extends Empleado {
	private int hsExtra;
	private int hsMes;
	
	@Override
	public double getSueldo() {
		return (this.sueldoBase * ((hsExtra * 1.5)+hsMes) / hsMes);
	}
	public void setSpecificValues(int hsExtra, int hsMes) {
		this.hsExtra = hsExtra;
		this.hsMes = hsMes;
	}
	
}
class Vendedor extends Empleado {
	private int porcenComision;
	private int totalVentas;
	
	@Override
	public double getSueldo() {
		return (this.sueldoBase + (porcenComision*totalVentas/100));
	}
	public void setSpecificValues(int porcenComision, int totalVentas) {
		this.porcenComision = porcenComision;
		this.totalVentas = totalVentas;
	}
}

public class Principal {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		System.out.println("Ingrese el numero de empleados a cargar: ");
		int keyNumber = Integer.parseInt(lector.nextLine());
		if (keyNumber > 20) {
			keyNumber = 20;
		}
		
		Object[] empleados = new Object[20];
		
		for(int i=0; i<keyNumber; i++) {
			System.out.println("Cargando datos del empleado numero: "+(i+1));
			System.out.println("Ingrese el numero 1 para Administrativo: ");
			System.out.println("Ingrese otro numero para Vendedor: ");
			int number = Integer.parseInt(lector.nextLine());
			
			System.out.println("Ingrese nombre: ");
			String nombre = lector.nextLine();
			System.out.println("Ingrese apellido: ");
			String apellido = lector.nextLine();
			System.out.println("Ingrese dni: ");
			String dni = lector.nextLine();
			System.out.println("Ingrese email: ");
			String email = lector.nextLine();
			System.out.println("Ingrese sueldo base: ");
			int sueldoBase = Integer.parseInt(lector.nextLine());
			
			if (number == 1) {
				System.out.println("Ingrese cantidad horas extra: ");
				int hsExtra = Integer.parseInt(lector.nextLine());
				System.out.println("Ingrese cantidad horas mes: ");
				int hsMes = Integer.parseInt(lector.nextLine());
				
				Administrativo partial = new Administrativo();
				partial.setSpecificValues(hsExtra, hsMes);
				partial.setValues(dni, nombre, apellido, email, sueldoBase);
				empleados[i] = partial;
				
			} else {
				System.out.println("Ingrese porcentaje de comision en numero: ");
				int porcenComision = Integer.parseInt(lector.nextLine());
				System.out.println("Ingrese total ventas: ");
				int totalVentas = Integer.parseInt(lector.nextLine());
				
				Vendedor partial = new Vendedor();
				partial.setSpecificValues(porcenComision, totalVentas);
				partial.setValues(dni, nombre, apellido, email, sueldoBase);
				empleados[i] = partial;
			}
		}
		lector.close();
		
		System.out.println("Los empleados son: ");
		for(int i=0; i<keyNumber; i++) {
			System.out.println(empleados[i].toString());
		}
	}

}