package vehiculos;

import java.util.ArrayList;

public class Fabricante {
	private String nombre;
	private Pais pais;
	private static ArrayList<Fabricante> fabricantes = new ArrayList<Fabricante>();
	
	public static ArrayList<Fabricante> getFabricantes() {
		return fabricantes;
	}
	public static void setFabricantes(ArrayList<Fabricante> fabricantes) {
		Fabricante.fabricantes = fabricantes;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
		Fabricante.fabricantes.add(this);
	}
	
	public static Fabricante fabricaMayorVentas() {
		
		ArrayList<Integer> totalFabricados = new ArrayList<Integer>();
		
		for (Fabricante fabrica : fabricantes) {
			int totalAutos = 0;
			
			for (Automovil autos : Automovil.getAutomoviles()) {	
				if (autos.getFabricante().equals(fabrica)) {
					totalAutos++;
				}
			}
			
			for (Camion camion : Camion.getCamiones()) {	
				if (camion.getFabricante().equals(fabrica)) {
					totalAutos++;
				}
			}
			
			for (Camioneta camioneta : Camioneta.getCamionetas()) {	
				if (camioneta.getFabricante().equals(fabrica)) {
					totalAutos++;
				}
			}
			
			totalFabricados.add(totalAutos);
		}

		int fabricado1 = totalFabricados.get(0);
		
		for (int fabricados : totalFabricados) {
			if (fabricados > fabricado1) {
				fabricado1 = fabricados;
			}
		}
		
		int indice = totalFabricados.indexOf(fabricado1);
		
		Fabricante MayoresVentas = fabricantes.get(indice);
		
		return MayoresVentas;
		
	}
	
}
