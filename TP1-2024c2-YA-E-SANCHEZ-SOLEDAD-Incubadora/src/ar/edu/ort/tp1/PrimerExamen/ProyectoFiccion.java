package ar.edu.ort.tp1.PrimerExamen;

import java.util.ArrayList;

public abstract class ProyectoFiccion extends Proyecto {
	
	private String empresaProductora;

	public ProyectoFiccion(int idProyecto, double presupuesto, ArrayList<Double> rubros, String empresaProductora) {
		super(idProyecto, presupuesto, rubros);
		this.empresaProductora = empresaProductora;
	}
	
	protected String getEmpresa() {
		return this.empresaProductora;
	}
	
	
}
