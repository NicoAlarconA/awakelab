
public class Secretario extends Empleado{
	
	String numeroDespacho;
	int numeroFax;
	
	public Secretario(String nombre, String apellido, int dni, String direccion, String anosAntiguedad, int telefono,
			int salario, String supervisor, String rutSupervisor, String numeroDespacho, int numeroFax) {
		super(nombre, apellido, dni, direccion, anosAntiguedad, telefono, salario, supervisor, rutSupervisor);
		this.numeroDespacho = numeroDespacho;
		this.numeroFax = numeroFax;
	}

	@Override
	public String toString() {
		return super.toString() + "Numero de despacho=" + numeroDespacho + "Numero de Fax=" + numeroFax;
	}

	public double aumentarSueldo() {
		return (int) super.getSalario()*0.5;
	}

	public String getNumeroDespacho() {
		return numeroDespacho;
	}

	public void setNumeroDespacho(String numeroDespacho) {
		this.numeroDespacho = numeroDespacho;
	}

	public int getNumeroFax() {
		return numeroFax;
	}

	public void setNumeroFax(int numeroFax) {
		this.numeroFax = numeroFax;
	}

}
