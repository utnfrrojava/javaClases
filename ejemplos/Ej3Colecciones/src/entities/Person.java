package entities;

public class Person implements Comparable<Person> {
	
	int dni;
	String nombre;
	String apellido;
	
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public Person(int dni, String nombre, String apellido) {
		this.setDni(dni);
		this.setNombre(nombre);
		this.setApellido(apellido);
	}
	
	
	@Override
	public String toString() {
		return "\nPerson [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Person)) {
			return false;
		}
		Person other = (Person) obj;
		if (dni != other.dni) {
			return false;
		}
		return true;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + dni;
		return result;
	}
	
	
	
	@Override
	public int compareTo(Person s) {
		int res=this.getDni()-s.getDni();
		if (res == 0) {
			res=this.getApellido().compareTo(s.getApellido());
			if (res==0) {
				res=this.getNombre().compareTo(s.getNombre());
			}
		}
		return res;
	}

	
}
