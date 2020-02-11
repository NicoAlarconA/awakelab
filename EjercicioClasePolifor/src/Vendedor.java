import java.util.ArrayList;

public class Vendedor extends Empleado {

	private int numeroTelefono;
	private String areaVenta;
	//private ArrayList<String> listaclientes1;
	private ArrayList<Cliente> listaclientes2;
	
	public Vendedor(){
		
	}
	
	public Vendedor(String nombre, String apellido, int dni, String direccion, String anosAntiguedad, int telefono,
			int salario, String supervisor, String rutSupervisor) {
		super(nombre, apellido, dni, direccion, anosAntiguedad, telefono, salario, supervisor, rutSupervisor);
		// TODO Auto-generated constructor stub

	 //this.listaClientes1 = new ArrayList<String>();
	 this.listaclientes2 = new ArrayList<Cliente>();
	 this.numeroTelefono = numeroTelefono;
	 this.areaVenta = areaVenta;
	}	
	
	@Override
	public double aumentarSueldo() {
		// TODO Auto-generated method stub
		return 0;
	}


	public int getNumeroTelefono() {
		return numeroTelefono;
	}

	public void setNumeroTelefono(int numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}

	public String getAreaVenta() {
		return areaVenta;
	}

	public void setAreaVenta(String areaVenta) {
		this.areaVenta = areaVenta;
	}

	@Override
	public String toString() {
		return "Vendedor [ numeroTelefono=" + numeroTelefono + ", areaVenta="
				+ areaVenta + "]";
	}

	/*public void addClientes1(String nomcliente) {
		listaclientes1.add(nomcliente);
	}*/

	public void addClientes2(Cliente cliente) {
		listaclientes2.add(cliente);	
	}
	
	/*public void mostrarClientes1() {
		for (String str:listaClientes1) {
			System.out.println(str);
		}
	}*/
	
	public void mostrarClientes2() {
		for (Cliente cli:listaclientes2) {
			System.out.println(cli.toString());
		}
	}
	
	public void imprimir() {
		super.imprimir();
		System.out.println("Puesto en la empresa: vendedor");
	}
	
	public void incrementarSalario() {
		super.setSalario((int)(super.getSalario()*1.1));
	}
}


