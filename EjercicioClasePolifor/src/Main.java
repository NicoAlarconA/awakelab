
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Secretario secretario1 = new Secretario("Nicolas", "Alarcon", 150691001, "aca", "muchos", 957082539, 0, "Juan", "0000", "43", 133);
	System.out.println(secretario1.toString());
	
	Secretario secretario2 = new Secretario("Caro", "Caaaarrera", 3432847, "alla", "muchoma", 7638746, 3, "pedro", "00001", "69", 132);
	System.out.println(secretario2.toString());
	
	Vendedor vendedor1 = new Vendedor("Jorge", "Fuentes", 3432432, "Providencia 1876", "mucho", 454535, 50000, "Pelao", "213213213");
	System.out.println(vendedor1.toString());
	
	Vendedor vendedor2 = new Vendedor("Pelaeo", "sai", 3452432, "puente 87", "super poco", 435435, 8745, "Pancho", "45345");
	System.out.println(vendedor2.toString());
	
	coche autito = new coche("plaplapla", "Mok", "achino");
	JefeDeZona Jefito = new JefeDeZona("Pancho", "Pepe", 324324, "dondesea", "harto", 546456, 4354, "juancho", "32434324", "alla", secretario2, autito);
	System.out.println(Jefito.toString());
	
	coche autito2 = new coche("pliplipli", "nanan", "anana");
	coche autito3 = new coche("tamagochi", "32323", "34324");
	coche autito4 = new coche("pliploplu", "434", "3432");
	
	}

}
