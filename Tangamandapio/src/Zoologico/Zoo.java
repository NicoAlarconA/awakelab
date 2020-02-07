package Zoologico;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Zoo{
	
	static String nombreAnimal;
	static String paisOrigen ;
	static String fechaIngreso;
	static Byte cantidadpatas;
	static Byte horasSueno;
	static String tipoDeAlimentacion;
	static String tipoAmbiente;
	static int cantidadDeAletas;
	static String nivelDeAgresividad;
	static String colorDePlumas;
	static double tamano;
	static boolean migrante;
	
	
	static List<Terrestres> Animales = new ArrayList <Terrestres>();
	static char letra;

	static List<Acuaticos> Acuaticos = new ArrayList <Acuaticos>();
	static List<Voladores> Voladores = new ArrayList <Voladores>();		
	
	public static void agregarAnimal() {
	String tipoAnimal = JOptionPane.showInputDialog("Ingrese tipo de animal: ");
	
	
	switch (tipoAnimal) {
	
	case "terrestre":
		 nombreAnimal = JOptionPane.showInputDialog("Nombre de Animal: ");
		 paisOrigen = JOptionPane.showInputDialog("Ingrese país de Origen: ");
		 fechaIngreso = JOptionPane.showInputDialog("Ingrese fecha de ingreso: ");
		 cantidadpatas = Byte.parseByte(JOptionPane.showInputDialog("Ingrese cantida de patas: "));
		 horasSueno = Byte.parseByte(JOptionPane.showInputDialog("Ingrese horas de sueño: "));
		 tipoDeAlimentacion = JOptionPane.showInputDialog("Ingrese cantida de patas: ");
		
		Terrestres at = new Terrestres(nombreAnimal,paisOrigen,fechaIngreso,cantidadpatas,tipoDeAlimentacion,horasSueno);
		Animales.add(at);
		break;
		
	case "acuatico":
		nombreAnimal = JOptionPane.showInputDialog("Nombre de Animal: ");
		paisOrigen = JOptionPane.showInputDialog("Ingrese país de Origen: ");
		fechaIngreso = JOptionPane.showInputDialog("Ingrese fecha de ingreso: ");
		tipoAmbiente = JOptionPane.showInputDialog("Ingrese tipo de Ambiente: ");
		cantidadDeAletas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Cantidad de Aletas: "));
		nivelDeAgresividad = JOptionPane.showInputDialog("Ingrese Nivel de Agresividad de 1 a 3: ");
		
		Acuaticos aa = new Acuaticos(nombreAnimal,paisOrigen,fechaIngreso,tipoAmbiente,cantidadDeAletas,nivelDeAgresividad);
		Acuaticos.add(aa);
		
		break;
	
	case "voladores":
		nombreAnimal = JOptionPane.showInputDialog("Nombre de Animal: ");
		paisOrigen = JOptionPane.showInputDialog("Ingrese país de Origen: ");
		fechaIngreso = JOptionPane.showInputDialog("Ingrese fecha de ingreso: ");
		colorDePlumas = JOptionPane.showInputDialog("Ingrese Color de Plumas: ");
		tamano = Integer.parseInt(JOptionPane.showInputDialog("Ingrese tamaño: "));
		String migra; 
		migra = JOptionPane.showInputDialog("Ingrese si es migrante o no: ");
		if (migra == "si") {
			migrante = true;
		}else
			migrante = false;
	
		Voladores av = new Voladores(nombreAnimal,paisOrigen,fechaIngreso,colorDePlumas,tamano,migrante);
		Voladores.add(av);
		break;
		
		
	default:
		break;
	}
	
	
}
	
	
public static void main(String[]Args) {
	
	do {
			
		System.out.println("Ingrese opcion: ");
		System.out.println("Agregar animal: A ");
		System.out.println("Mostar animales: B ");
		System.out.println("Resumen: C");
		System.out.println("Salir: D");
		
		letra = JOptionPane.showInputDialog("Ingresa opcion: ").charAt(0);		
		
		switch (letra) {
			case 'a':
				agregarAnimal();
				break;
				
			case 'b':
				
				break;
				
			case 'c':
				
				break;
			
			case 'd':
				System.out.println("No' vimo");
				break;
		
		
			
		}
		
	}while(letra != 'd');
		
	for (Terrestres i : Animales) {
		System.out.println(i.toString());
	}
}

	
	
}
