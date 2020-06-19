package entities;

public class Persona {
	
	private int id;
	private String nombre;
	private String apellido;
	private boolean habilitado;
	private Documento documento;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public boolean isHabilitado() {
		return habilitado;
	}
	public void setHabilitado(boolean habilitado) {
		this.habilitado = habilitado;
	}
	public Documento getDocumento() {
		return documento;
	}
	public void setDocumento(Documento documento) {
		this.documento = documento;
	}
	@Override
	public String toString() {
		return "\nPersona [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", habilitado=" + habilitado
				+ ", documento=" + documento + "]";
	}
	
	

}
