
public abstract class Empleado {

	private String nombre;
	private String apellido;
	private int dni;
	private String direccion;
	private String anosAntiguedad;
	private int telefono;
	private int salario;
	private String supervisor;
	private String rutSupervisor;
	
	public Empleado() {
		
	}
	
	public Empleado(String nombre, String apellido, int dni, String direccion, String anosAntiguedad, int telefono,
			int salario, String supervisor, String rutSupervisor) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.direccion = direccion;
		this.anosAntiguedad = anosAntiguedad;
		this.telefono = telefono;
		this.salario = salario;
		this.supervisor = supervisor;
		
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


	public int getDni() {
		return dni;
	}


	public void setDni(int dni) {
		this.dni = dni;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getAnosAntiguedad() {
		return anosAntiguedad;
	}


	public void setAnosAntiguedad(String anosAntiguedad) {
		this.anosAntiguedad = anosAntiguedad;
	}


	public int getTelefono() {
		return telefono;
	}


	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}


	public int getSalario() {
		return salario;
	}


	public void setSalario(int salario) {
		this.salario = salario;
	}


	public String getSupervisor() {
		return supervisor;
	}


	public void setSupervisor(String supervisor) {
		this.supervisor = supervisor;
	}


	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", direccion=" + direccion
				+ ", anosAntiguedad=" + anosAntiguedad + ", telefono=" + telefono + ", salario=" + salario
				+ ", supervisor=" + supervisor + "]";
	}
	
	public void CambiarSupervisor(String nuevoSupervisor) {
		this.setRutSupervisor(nuevoSupervisor);
	
	}
		
	public String getRutSupervisor() {
	return rutSupervisor;
	}


	public void setRutSupervisor(String rutSupervisor) {
	this.rutSupervisor = rutSupervisor;
	}
	
	public abstract double aumentarSueldo();

	public void imprimir() {
		System.out.println("Nombre: " + nombre + "apellido: " + apellido + "run: " + dni 
				+ "direccion: " + direccion);
	}

}
