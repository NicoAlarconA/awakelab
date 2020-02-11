
public class Cliente {
	
	private String nombre;
	private int edad;
	private String Rut;
	
	public Cliente() {
		
	}
	
	public Cliente(String nombre, int edad, String rut) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		Rut = rut;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getRut() {
		return Rut;
	}

	public void setRut(String rut) {
		Rut = rut;
	}
	
	


}
