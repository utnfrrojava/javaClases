package entities;

public class Documento {

	private String tipo;
	private int nro;
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getNro() {
		return nro;
	}
	public void setNro(int nro) {
		this.nro = nro;
	}
	@Override
	public String toString() {
		return "Documento [tipo=" + tipo + ", nro=" + nro + "]";
	}
	
	
}
