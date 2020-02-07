package Zoologico;

public class Terrestres extends Animales {

	private byte cantidadDePatas;
	private String tipoDeAlimentacion;
	private byte horasDeSueno;
	
	public Terrestres() {
		super();
	}
	
	public Terrestres(String nombreAnimal, String paisDeOrigen, String fechaDeIngreso, byte cantidadDePatas, String tipoDeAlimentacion, byte horasDeSueno) {
		super(nombreAnimal, paisDeOrigen, fechaDeIngreso);
		this.cantidadDePatas = cantidadDePatas;
		this.tipoDeAlimentacion = tipoDeAlimentacion;
		this.horasDeSueno = horasDeSueno;
	}

	@Override
	public String toString() {
		return "Terrestres [Cantidad de Patas=" + cantidadDePatas + ", Alimentacion =" + tipoDeAlimentacion
				+ ", Horas de Sue�o=" + horasDeSueno + super.toString()+ "]";
	}
}
