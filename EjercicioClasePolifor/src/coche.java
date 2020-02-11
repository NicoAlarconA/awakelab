
public class coche {
	
	private String patente;
	private String Marca;
	private String modelo;
	public String getPatente() {
		return patente;
	}
	
	public coche() {
		
	}

	public coche(String patente, String marca, String modelo) {
		this.patente = patente;
		Marca = marca;
		this.modelo = modelo;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String marca) {
		Marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

}
