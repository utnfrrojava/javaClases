package ui;


import java.util.LinkedList;
import java.util.Scanner;

import entities.*;
import logic.Login;
import logic.*;

public class Menu {
	Scanner s=null;
	Login ctrlLogin = new Login();
	PersonaLogic pL = new PersonaLogic();
	RolLogic rL = new RolLogic();

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
			System.out.println(eliminarPersona());
			break;
			
			
		case "newRol":
			System.out.println(newRol());
			break;
		case "listRol":
			System.out.println(listRol());

			break;
		case "findRolD":
			System.out.println(findRol());

			break;
		case "findRolId":
			System.out.println(findRolId());

			break;		
		case "deleteRol":
			System.out.println(deleteRol());

			break;		
		case "setRol":
			System.out.println(setRol());
			
			break;	
		case "updateRol":
			System.out.println(updateRol());
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
		System.out.println("edit\t\tbusca por tipo y nro de documento y actualiza todos los datos");
		System.out.println("delete\t\tborra por tipo y nro de documento");
		System.out.println();
		
		
		System.out.println("newRol\t\tcrea un nuevo rol");
		System.out.println("listRol\t\tlistar todos los roles");
		System.out.println("findRolD\t\tbuscar rol por descripcion");
		System.out.println("findRolId\t\tbuscar rol por Id");
		System.out.println("deleteRol\t\tborra rol");
		System.out.println("setRol\t\t setear un rol a una persona");
		System.out.println("updateRol\t\tbusca por tipo y nro de documento y actualiza todos los datos");
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
		
		return pL.getByDocumento(p);
	}
	
	private LinkedList<Persona> search() {
		System.out.println();
		
		Persona p=new Persona();
		Documento d=new Documento();
		p.setDocumento(d);
		
		System.out.println("Ingrese apellido: ");
		p.setApellido(s.nextLine());
		
		return pL.getByApellido(p);
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
		
		pL.addPersona(p);
		
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
		
		
		return pL.editPersona(pOld, p);
	}
	
	private String eliminarPersona() {
		System.out.println();
		Persona p=new Persona();
		p=find();
		
		//aca hay que eliminar a la persona p
		pL.eliminarPersona(p);

		String mensaje = "Se ha eliminado a la persona: "+p.getNombre()+" "+p.getApellido()+" con documento "+p.getDocumento().getTipo()+" "+p.getDocumento().getNro();
		return mensaje;
	}
	
	
	
	
	private String newRol() {
		System.out.println();
		
		Rol r = new Rol();
		
		System.out.println("Ingrese descripcion: ");
		r.setDescripcion(s.nextLine());
		
		rL.add(r);
		
		String mensaje = "Se ha agregado el rol: "+r.getDescripcion();
		return mensaje;
	}
	private LinkedList<Rol> listRol(){
		System.out.println();
		
		return rL.getAll();
	}
	
	private Rol findRolId(){
		System.out.println();
		Rol r = new Rol();
		
		System.out.println("Ingrese el id de Rol a buscar");
		r.setId(Integer.parseInt(s.nextLine()));
		
		r=rL.getById(r);
		
		//String mensaje = "Id rol: "+r.getId()+"descripcion del rol: "+r.getDescripcion();
		return r; 
	}
			
	private String findRol(){
		System.out.println();
		Rol r = new Rol();
		
		System.out.println("Ingrese la descricion del Rol a buscar");
		r.setDescripcion(s.nextLine());
		
		r=rL.getByDesc(r);
		
		String mensaje = "Id rol: "+r.getId()+"descripcion del rol: "+r.getDescripcion();
		return mensaje; 
	}
	private String deleteRol(){
		System.out.println();
		Rol r = new Rol();
		
		System.out.println(rL.getAll());
		
		System.out.println("Ingrese el id de Rol a eliminar");
		r.setId(Integer.parseInt(s.nextLine()));
		
		r = rL.getById(r);
		
		rL.remove(r);
		
		String mensaje = "Se ha eliminado al rol: "+r.getId()+" : "+r.getDescripcion();
		return mensaje; 
	}

	private String updateRol(){
		System.out.println();
		Rol r = new Rol();
		
		System.out.println(rL.getAll());
		
		System.out.println("Ingrese el id de Rol a editar");
		r.setId(Integer.parseInt(s.nextLine()));
		
		r = rL.getById(r);
		System.out.println("Id: " + r.getId() + " descripcion: "+r.getDescripcion());
		System.out.println("Ingrese la nueva descripcion: ");
		r.setDescripcion(s.nextLine());
		
		rL.update(r);
		
		String mensaje = "Se ha actualizado la información del rol: "+r.getId()+" : "+r.getDescripcion();
		return mensaje; 
		}
	
	private String setRol() {
		String mensaje;
		System.out.println();
		Rol r = new Rol();
		RolLogic rL = new RolLogic();
		Persona p = new Persona();
		Documento d = new Documento();
		
		System.out.println("Ingrese el DNI de la persona a agregar Rol: ");
		p.setDocumento(d);
		d.setTipo("dni");
		
		d.setNro(s.nextLine());
		
		p = pL.getByDocumento(p);
		//p.getAllRoles().clear(); //despues lo tengo que sacar
		
		System.out.println(rL.getAll());
		
		r=findRolId();
	
		/*	NO ME ANDUVO EL METODO hasRol(r)
		 * if(!p.hasRol(r)) {
			p.addRol(r);
			mensaje = "Se ha asignado el rol: "+ r.getDescripcion() +" a la persona "+ p.getNombre()+ p.getApellido();
		}else {
			mensaje = "La persona: "+ p.getNombre()+" "+ p.getApellido()+" ya posee el rol ingresado";
		}*/
		
		rL.setRoles(p,r);
		//p.addRol(r);
		mensaje = "Se ha asignado el rol: "+ 
		r.getDescripcion() +" a la persona "+ 
				p.getNombre()+ 
				p.getApellido();
		return mensaje;
	}
}
