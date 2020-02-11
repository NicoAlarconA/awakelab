
import java.util.ArrayList;

public class JefeDeZona extends Empleado {

	private String despacho;
	private Secretario secre;
	private ArrayList<Vendedor> listavendedores;
	private coche cocheJefe;
	
	public JefeDeZona(String nombre, String apellido, int dni, String direccion, String anosAntiguedad, int telefono,
			int salario, String supervisor, String rutSupervisor, String despacho, Secretario secre, coche cocheJefe ) {
		super(nombre, apellido, dni, direccion, anosAntiguedad, telefono, salario, supervisor, rutSupervisor);
		this.despacho = despacho;
		this.secre = secre;
		this.listavendedores = listavendedores;
		this.cocheJefe = cocheJefe;
	}
	
	public void imprimir() {
		super.imprimir();
		System.out.println("Puesto en la empresa: Jefe de Zona");
	}
	
	public void cambiarSecretaria(Secretario nuevoSecretaria) {
		this.secre = nuevoSecretaria;
	}
	
	public JefeDeZona() {
		
	}
	
	public String getDespacho() {
		return despacho;
	}
	public void setDespacho(String despacho) {
		this.despacho = despacho;
	}
	public Secretario getSecre() {
		return secre;
	}
	public void setSecre(Secretario secre) {
		this.secre = secre;
	}
	public ArrayList<Vendedor> getListavendedores() {
		return listavendedores;
	}
	public void setListavendedores(ArrayList<Vendedor> listavendedores) {
		this.listavendedores = listavendedores;
	}
	public coche getCocheJefe() {
		return cocheJefe;
	}
	public void setCocheJefe(coche cocheJefe) {
		this.cocheJefe = cocheJefe;
	}
	
	public void aumentoSalario() {
		super.setSalario((int) (super.getSalario()+super.getSalario()*0.20));
	}
	
	public void agregarVendedor(Vendedor nuevoVendedor) {
		listavendedores.add(nuevoVendedor);
	}
	
	public void borrarVendedor(int index) {
		listavendedores.remove(index);
	}
	
	public void cambiarCoche(coche nuevoCoche) {
		this.cocheJefe = nuevoCoche;
	}

	@Override
	public double aumentarSueldo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return "JefeDeZona [despacho=" + despacho + ", secre=" + secre + ", listavendedores=" + listavendedores
				+ ", cocheJefe=" + cocheJefe + "]";
	}
	
	
	
	
}

