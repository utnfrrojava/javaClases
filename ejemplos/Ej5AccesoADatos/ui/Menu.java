package ui;


import java.util.LinkedList;
import java.util.Scanner;

import entities.*;
import logic.Login;

public class Menu {
	Scanner s=null;
	Login ctrlLogin = new Login();

	public void start() {
		s = new Scanner(System.in);
		Persona p=login();
		System.out.println("Bienvenido "+p.getNombre()+" "+p.getApellido());
		System.out.println();
		
		String command;
		do {
			command=getCommand();
			executeCommand(command);
			System.out.println();
			
		}while(!command.equalsIgnoreCase("exit"));
		
		s.close();
	}

	private void executeCommand(String command) {
		switch (command) {
		case "list":
			System.out.println(ctrlLogin.getAll());
			break;
		case "find":
			System.out.println(find());
			break;
		case "search":
			System.out.println(search());
			break;
		case "new":
			System.out.println(newPersona());
			break;
		case "edit":
			System.out.println(editPersona());
			break;
		case "delete":
			
			break;
		default:
			break;
		}
	}

	private String getCommand() {
		System.out.println("Ingrese el comando segÃºn la opciÃ³n que desee realizar");
		System.out.println("list\t\tlistar todos");
		System.out.println("find\t\tbuscar por tipo y nro de documento"); //solo debe devolver 1
		System.out.println("search\t\tlistar por apellido"); //puede devolver varios

		//NO LE AGREGUE EL ROL
		System.out.println("new\t\tcrea una nueva persona y asigna un rol existente");
		
		//este toca hacer 
		System.out.println("edit\t\tbusca por tipo y nro de documento y actualiza todos los datos");
		System.out.println("delete\t\tborra por tipo y nro de documento");
		System.out.println();
		System.out.print("comando: ");
		return s.nextLine();
	}
	
	public Persona login() {
		Persona p=new Persona();
		
		System.out.print("Email: ");
		p.setEmail(s.nextLine());

		System.out.print("password: ");
		p.setPassword(s.nextLine());
		
		p=ctrlLogin.validate(p);
		
		return p;
		
	}
	
	private Persona find() {
		System.out.println();
		Persona p=new Persona();
		Documento d=new Documento();
		p.setDocumento(d);
		System.out.print("Tipo doc: ");
		d.setTipo(s.nextLine());

		System.out.print("Nro doc: ");
		d.setNro(s.nextLine());
		
		return ctrlLogin.getByDocumento(p);
	}
	
	private LinkedList<Persona> search() {
		System.out.println();
		
		Persona p=new Persona();
		Documento d=new Documento();
		p.setDocumento(d);
		
		System.out.println("Ingrese apellido: ");
		p.setApellido(s.nextLine());
		
		return ctrlLogin.getByApellido(p);
	}
	
	
	private String newPersona() {
		System.out.println();
		
		Persona p = new Persona();
		Documento d=new Documento();
		p.setDocumento(d);
		
		System.out.println("Ingrese tipo de documento: ");
		d.setTipo(s.nextLine());
		
		System.out.println("Ingrese numero de dni: ");
		d.setNro(s.nextLine());
		
		System.out.println("Ingrese nombre: ");
		p.setNombre(s.nextLine());
		
		System.out.println("Ingrese apellido: ");
		p.setApellido(s.nextLine());
		
		System.out.println("Ingrese email: ");
		p.setEmail(s.nextLine());
		
		System.out.println("Ingrese telefono: ");
		p.setTel(s.nextLine());
		
		System.out.println("¿Estará habilitado? 1-si / 2-no: ");
		p.setHabilitado(Boolean.valueOf(s.nextLine()));
		
		System.out.println("Ingrese password: ");
		p.setPassword(s.nextLine());
		
		ctrlLogin.addPersona(p);
		
		System.out.println();
		String message = "Se ha registrado a "+p.getNombre()+" "+p.getApellido();
		return message;
	}

	private Persona editPersona() {

		Persona pOld = new Persona();
		pOld=find();

		Persona p = new Persona();
		Documento d=new Documento();
		p.setDocumento(d);
		
		System.out.println();
		
		System.out.println("Nombre actual: "+pOld.getNombre());
		System.out.println("Apellido actual: "+pOld.getApellido());
		System.out.println("Email actual: "+pOld.getEmail());
		System.out.println("Telefono actual: "+pOld.getTel());
		System.out.println("Estado habilitado actual: "+pOld.isHabilitado());
		
		System.out.println("Ingrese datos a editar (recuerde que el tipo y nro de dni no se pueden editar)");
		System.out.println();
		
		d.setTipo(pOld.getDocumento().getTipo());
		d.setNro(pOld.getDocumento().getNro());
		p.setId(pOld.getId());
		
		System.out.println("Ingrese nombre: ");
		p.setNombre(s.nextLine());
		
		System.out.println("Ingrese apellido: ");
		p.setApellido(s.nextLine());
		
		System.out.println("Ingrese email: ");
		p.setEmail(s.nextLine());
		
		System.out.println("Ingrese telefono: ");
		p.setTel(s.nextLine());
		
		System.out.println("¿Estará habilitado? 1-si / 2-no: ");
		p.setHabilitado(Boolean.valueOf(s.nextLine()));
		
		System.out.println("Ingrese password: ");
		p.setPassword(s.nextLine());
		
		
		return ctrlLogin.editPersona(pOld, p);
		
	}
	
}
