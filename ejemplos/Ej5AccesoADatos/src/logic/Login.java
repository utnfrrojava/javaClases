package logic;

import java.util.ArrayList;
import java.util.LinkedList;

import data.*;
import entities.*;

public class Login {
	private DataPersona dp;
	private DataRol dr;
	
	public Login() {
		dp=new DataPersona();
		dr= new DataRol();
	}
	
	public Persona validate(Persona p) {
		/* para hacer más seguro el manejo de passwords este sería un lugar 
		 * adecuado para generar un hash de la password utilizando un cifrado
		 * asimétrico como sha256 y utilizar el hash en lugar de la password en plano 
		 */
		return dp.getByUser(p);
	}

	public LinkedList<Persona> getAll(){
		return dp.getAll();
	}

	public Persona getByDocumento(Persona per) {
		return dp.getByDocumento(per);
	}
	public ArrayList<Persona> getByApellido(String apell){
		return dp.getByApellido(apell);
	}
	public LinkedList<Rol> getRoles(){
		return dr.getAll();
	}
	public Rol getRolById(Rol r) {
		return dr.getById(r);
	}
	public Persona addPeople (Persona p, Rol r) {
		dp.add(p);
		dr.setRolPersona(p, r);	
		return p;
	}
	public Persona edit(Persona p) {
		return dp.edit(p);
	}
	public void delete(Persona p) {
		dr.deleteRolPersona(p);
		dp.deletePersona(p);
	}
}

