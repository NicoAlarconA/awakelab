
public class Vendedor extends Empleado {

	public String cocheEmpresa;

	
	public Vendedor(String nombre, String apellido, int dni, String direccion, String anosAntiguedad, int telefono,
			int salario, String supervisor, String rutSupervisor) {
		super(nombre, apellido, dni, direccion, anosAntiguedad, telefono, salario, supervisor, rutSupervisor);
		// TODO Auto-generated constructor stub
	}


	@Override
	public double aumentarSueldo() {
		// TODO Auto-generated method stub
		return 0;
	}

	

	
	
}
