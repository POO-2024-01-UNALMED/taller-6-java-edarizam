package vehiculos;

import java.util.ArrayList;

public class Pais {
	private String nombre;
	private static ArrayList<Pais> paises = new ArrayList<Pais>();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Pais(String nombre) {
		this.nombre = nombre;
		Pais.paises.add(this);
	}
	
	public static Pais PaisMasVendedor() {
			
			ArrayList<Integer> totalFabricados = new ArrayList<Integer>();
			
			for (Pais pais : paises) {
				
				int totalAutos = 0;
				
				for (Fabricante fabrica : Fabricante.getFabricantes()) {
					
					if (fabrica.getPais().equals(pais)) {
						
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
						
					}
					
					
					
					totalFabricados.add(totalAutos);
				}
			}
			
			
			int fabricado1 = totalFabricados.get(0);
			
			for (int fabricados : totalFabricados) {
				if (fabricado1 > fabricados) {
					fabricado1 = fabricados;
				}
			}
			
			int indice = totalFabricados.indexOf(fabricado1);
			
			Pais MayoresVentas = paises.get(indice);
			
			return MayoresVentas;
			
		
			
		}
	
	
}
