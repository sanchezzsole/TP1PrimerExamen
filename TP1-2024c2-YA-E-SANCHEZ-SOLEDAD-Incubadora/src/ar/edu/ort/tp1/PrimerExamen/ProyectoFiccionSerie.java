package ar.edu.ort.tp1.PrimerExamen;

import java.util.ArrayList;

public class ProyectoFiccionSerie extends ProyectoFiccion {
	private static final int COSTO_EPISODIO = 2;
	private int cantEpisodios;

	public ProyectoFiccionSerie(int idProyecto, double presupuesto, ArrayList<Double> rubros, String empresaProductora,
			int cantEpisodios) {
		super(idProyecto, presupuesto, rubros, empresaProductora);
		this.cantEpisodios = cantEpisodios;
	}

	@Override
	public double obtenerPresupuestoFinal() {
		double presupParcial = super.getPresupuesto();
		return presupParcial + (cantEpisodios * (presupuestoTotal() * COSTO_EPISODIO / 100));
	}
	
	
	@Override
	public String obtenerDatos() {
		return super.obtenerDatos() + "Serie-"+ getEmpresa() + ",Presupuesto Final=" + Redondeo.DECIMAL.redondear(calcularPresupuestoFinal());
	}

}
