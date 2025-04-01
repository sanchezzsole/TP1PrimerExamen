package ar.edu.ort.tp1.PrimerExamen;

import java.util.ArrayList;

public abstract class Proyecto implements Gestionable{
	
	private int idProyecto; 
	private double presupuesto; 
	private ArrayList<Double> rubros;
	

	public Proyecto(int idProyecto, double presupuesto, ArrayList<Double> rubros) {
		this.idProyecto = idProyecto;
		this.presupuesto = presupuesto;
		this.rubros = rubros;
	}

	
	public double presupuestoTotal() {
		double sumaTotal = 0;
		for (Double rubro : rubros) {
			sumaTotal += rubro;
		}
		return sumaTotal;
	}
	
	public double calcularPresupuestoFinal() {
		return Redondeo.DECIMAL.redondear(presupuesto + obtenerPresupuestoFinal());
	}
	
	protected double getPresupuesto() {
		return this.presupuesto;
	}


	protected boolean mismoId(int id) {
		return this.idProyecto == id;
	}
	
	@Override
	public String obtenerDatos() {
		return "id=" + idProyecto + ", presupuesto=" + presupuesto + "-";
	}
}
