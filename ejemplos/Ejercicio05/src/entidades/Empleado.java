package entidades;

public abstract class Empleado {

	private int dni;
	private String nombre;
	private String apellido;
	private double sueldoBase;
	
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
	
	
	public double getSueldoBase() {
		return sueldoBase;
	}
	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
	public abstract double getSueldo();
	
	public String getDetalle() {
		return this.getDni()+" - "+this.getApellido()+": "; 
	}
}
