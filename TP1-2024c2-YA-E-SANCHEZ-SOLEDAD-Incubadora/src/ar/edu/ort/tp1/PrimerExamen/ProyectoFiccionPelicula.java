package ar.edu.ort.tp1.PrimerExamen;

import java.util.ArrayList;

public class ProyectoFiccionPelicula extends ProyectoFiccion {
	private static final int TOPE_DURACION = 120;
	private static final int PORCENTAJE_ADICIONAL = 5;
	
	private int duracion;

	public ProyectoFiccionPelicula(int idProyecto, double presupuesto, ArrayList<Double> rubros,
			String empresaProductora, int duracion) {
		super(idProyecto, presupuesto, rubros, empresaProductora);
		this.duracion = duracion;
	}

	@Override
	public double obtenerPresupuestoFinal() {
		double presupParcial = super.getPresupuesto();
		return duracion > TOPE_DURACION ? (presupParcial * PORCENTAJE_ADICIONAL / 100) : 0;
	}

	@Override
	public String obtenerDatos() {
		return super.obtenerDatos() + "Pelicula-"+ getEmpresa() + ",Presupuesto Final=" + Redondeo.DECIMAL.redondear(calcularPresupuestoFinal());
	}
}
