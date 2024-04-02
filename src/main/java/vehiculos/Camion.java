package vehiculos;

import java.util.ArrayList;

public class Camion extends Vehiculo {
	private int ejes;
	private static int totalCaminones;
	private static ArrayList<Camion> camiones = new ArrayList<Camion>();

	public static ArrayList<Camion> getCamiones() {
		return camiones;
	}

	public static void setCamiones(ArrayList<Camion> camiones) {
		Camion.camiones = camiones;
	}

	public int getEjes() {
		return ejes;
	}

	public void setEjes(int ejes) {
		this.ejes = ejes;
	}

	public static int getTotalCaminones() {
		return totalCaminones;
	}

	public static void setTotalCaminones(int totalCaminones) {
		Camion.totalCaminones = totalCaminones;
	}

	public Camion(String placa, String nombre, int precio, double peso,
			Fabricante fabricante, int ejes) {
		super(placa, 2, 80, nombre, precio, peso, "4X2", fabricante);
		this.ejes = ejes;
		Camion.camiones.add(this);
		Camion.totalCaminones++;
	}
	
	
}
