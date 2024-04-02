package vehiculos;

import java.util.ArrayList;

public class Automovil extends Vehiculo{
	private int puestos;
	private static int totalAutomoviles;
	private static ArrayList<Automovil> automoviles = new ArrayList<Automovil>();

	public int getPuestos() {
		return puestos;
	}

	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}

	public static int getTotalAutomoviles() {
		return totalAutomoviles;
	}

	public static void setTotalAutomoviles(int totalAutomoviles) {
		Automovil.totalAutomoviles = totalAutomoviles;
	}

	public Automovil(String placa, String nombre, int precio, double peso
			, Fabricante fabricante, int puestos) {
		super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
		this.puestos = puestos;
		Automovil.automoviles.add(this);
		Automovil.totalAutomoviles++;
	}

	public static ArrayList<Automovil> getAutomoviles() {
		return automoviles;
	}

	public static void setAutomoviles(ArrayList<Automovil> automoviles) {
		Automovil.automoviles = automoviles;
	}
	
}
