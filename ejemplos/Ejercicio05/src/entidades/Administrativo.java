package entidades;

public class Administrativo extends Empleado{
	private int hsExtra;
	private int hsMes;
	public int getHsExtra() {
		return hsExtra;
	}
	public void setHsExtra(int hsExtra) {
		this.hsExtra = hsExtra;
	}
	public int getHsMes() {
		return hsMes;
	}
	public void setHsMes(int hsMes) {
		this.hsMes = hsMes;
	}
	
	public Administrativo() {}
	
	public Administrativo(int dni, String nombre, String apellido, 
			double sueldoBase,int hsExtra, int hsMes) {
		super(dni,nombre,apellido,sueldoBase);
		
		this.setHsExtra(hsExtra);
		this.setHsMes(hsMes);
	}
	
	@Override
	public double getSueldo() {
		
		return getSueldoBase()*((getHsExtra()*1.5+getHsMes())/getHsMes());
	}
	
	public String getDetalle() {
		return "Administrativo "+super.getDetalle();
	}
}
