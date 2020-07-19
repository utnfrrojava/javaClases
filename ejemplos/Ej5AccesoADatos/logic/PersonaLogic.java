package logic;

import java.util.LinkedList;

import data.DataPersona;
import entities.Persona;

public class PersonaLogic {
	private DataPersona dp;

	public PersonaLogic(){
		dp = new DataPersona();
	}
	
	public Persona getByDocumento(Persona per) {
		return dp.getByDocumento(per);
		
	}
	
	public LinkedList<Persona> getByApellido(Persona per){
		return dp.getByApellido(per);
	}
	
	public void addPersona(Persona p) {
		dp.add(p);
	}
	
	public Persona editPersona(Persona pOld, Persona p) {
		return dp.editPersona(pOld, p);
	}
	
	public void eliminarPersona(Persona p) {
		dp.eliminarPersona(p);
	}
}
