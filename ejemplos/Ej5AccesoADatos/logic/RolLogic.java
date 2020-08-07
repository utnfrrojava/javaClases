package logic;

import java.util.LinkedList;

import data.DataRol;
import entities.Persona;
import entities.Rol;

public class RolLogic {
	DataRol dr = new DataRol();

	
	public LinkedList<Rol> getAll(){
		return dr.getAll();
	}
	
	public Rol getById(Rol rolToSearch) {
		return dr.getById(rolToSearch);
	}
	
	public Rol getByDesc(Rol rolToSearch) {
		return dr.getByDesc(rolToSearch);
	}
	
	public void setRoles(Persona per, Rol nuevoRol) {
		if (!per.hasRol(nuevoRol) ) {
			dr.setRolesDePersona(per, nuevoRol);
			per.addRol(nuevoRol);			
			}
		
	}
	
	public void add(Rol rol) {
		dr.add(rol);
	}
	
	public void update(Rol rol) {
		dr.update(rol);
	}
	
	public void remove(Rol rol) {
		dr.remove(rol);
	}
}
