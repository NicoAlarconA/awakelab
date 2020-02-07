package Zoologico;

public class Voladores extends Animales{
	
	String colorDePlumas;
	double tamano;
	boolean migrante;
	
	public Voladores() {
		super();
	}
	
	public Voladores(String nombreAnimal, String paisDeOrigen, String fechaDeIngreso, String colorDePlumas, double tamano, boolean migrante) {
		super(nombreAnimal, paisDeOrigen, fechaDeIngreso);
		this.colorDePlumas = colorDePlumas;
		this.tamano = tamano;
		this.migrante = migrante;
		
	}

	@Override
	public String toString() {
		return "Voladores [Color de Plumas=" + colorDePlumas + ", Tamaño=" + tamano + ", Migrante=" + migrante + super.toString()+ "]";
	}
}
