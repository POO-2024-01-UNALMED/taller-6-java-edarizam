package vehiculos;

import java.util.ArrayList;

public class Camioneta extends Vehiculo {
	private boolean volco;
	private static int totalCamionetas;
	private static ArrayList<Camioneta> camionetas = new ArrayList<Camioneta>();

	public static ArrayList<Camioneta> getCamionetas() {
		return camionetas;
	}

	public static void setCamionetas(ArrayList<Camioneta> camionetas) {
		Camioneta.camionetas = camionetas;
	}

	public boolean isVolco() {
		return volco;
	}

	public void setVolco(boolean volco) {
		this.volco = volco;
	}

	public static int getTotalCamionetas() {
		return totalCamionetas;
	}

	public static void setTotalCamionetas(int totalCamionetas) {
		Camioneta.totalCamionetas = totalCamionetas;
	}

	public Camioneta(String placa, int puertas, String nombre, int precio, double peso,
			Fabricante fabricante, boolean volco) {
		super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
		this.volco = volco;
		Camioneta.camionetas.add(this);
		Camioneta.totalCamionetas++;
	}
	
}
