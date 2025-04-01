package ar.edu.ort.tp1.PrimerExamen;

import java.util.ArrayList;

public class ProyectoDocumental extends Proyecto {
	
	private TipoDocumental tipoDoc;

	public ProyectoDocumental(int idProyecto, double presupuesto, ArrayList<Double> rubros, TipoDocumental tipoDoc) {
		super(idProyecto, presupuesto, rubros);
		this.tipoDoc = tipoDoc;
	}

	
	@Override
	public double obtenerPresupuestoFinal() {
		double presupParcial = super.getPresupuesto();
		return presupParcial * this.tipoDoc.getPorcentual();
	}

	@Override
	public String obtenerDatos() {
		return super.obtenerDatos() + "Documental - " + tipoDoc + ",Presupuesto Final=" + Redondeo.DECIMAL.redondear(calcularPresupuestoFinal());
	}
	

	
}
