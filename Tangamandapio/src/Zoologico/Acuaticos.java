package Zoologico;

public class Acuaticos extends Animales {
	
	private String tipoAmbiente;
	private int cantidadDeAletas;
	private String nivelDeAgresividad;
	
	public Acuaticos() {
		super();
		
	}
	public Acuaticos(String nombreAnimal, String paisDeOrigen, String fechaDeIngreso, String tipoAmbiente, int cantidadDeAletas, String nivelDeAgresividad) {
		super(nombreAnimal, paisDeOrigen, fechaDeIngreso);
		this.tipoAmbiente = tipoAmbiente;
		this.cantidadDeAletas = cantidadDeAletas;
		this.nivelDeAgresividad = nivelDeAgresividad;	
	}
	
	@Override
	public String toString() {
		return "Acuaticos [Tipo de Ambiente=" + tipoAmbiente + ", Cantidad de Aletas=" + cantidadDeAletas
				+ ", Nivel de Agresividad=" + nivelDeAgresividad + super.toString()+ "]";
	}
}
