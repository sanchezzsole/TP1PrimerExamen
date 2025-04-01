package ar.edu.ort.tp1.PrimerExamen;
import java.util.ArrayList;

public class InstitutoAudiovisual {

	private static final String MSG_NO_ENCONTRADO = "Proyecto NO encontrado. Ingrese otro identificador";
	private static final String MSG_ENCONTRADO = "Se quitó el proyecto: ";
	
	private ArrayList<Proyecto> proyectos;
	private ArrayList<Proyecto> proyectosAprobados;
	
	
	public InstitutoAudiovisual() {
		this.proyectos = new ArrayList<Proyecto>();
		this.proyectosAprobados = new ArrayList<Proyecto>();
	}


	public void agregarProyecto(Proyecto proyecto){
		if(proyecto != null) {
			this.proyectos.add(proyecto);
		}
	}
	
	
	public void eliminarProyecto(int i) {
		System.out.println("==Eliminando Proyectos==");
		
		Proyecto encontrado = buscarProyectoPorId(i);
		System.out.println("Proyecto buscado: " + i);
		System.out.println(encontrado == null ? MSG_NO_ENCONTRADO : MSG_ENCONTRADO + i);
		
		if(encontrado != null) {
			System.out.println(encontrado.obtenerDatos());
		}
		System.out.println("");
	}

	
	private Proyecto buscarProyectoPorId(int id) {
		Proyecto encontrado = null;
		int pos = 0;
		
		while(encontrado == null && pos < this.proyectos.size()) {
			if(this.proyectos.get(pos).mismoId(id)) {
				encontrado = this.proyectos.get(pos);
			}
			pos++;
		}	
		return encontrado;
	}


	public boolean presupuestoAprobado(Proyecto proyecto){
		boolean aprobado = false;
		if(proyecto.obtenerPresupuestoFinal() <= proyecto.presupuestoTotal()) {
			proyectosAprobados.add(proyecto);
			aprobado = true;
		}	
		return aprobado;
	}

	public void mostrarProyectos() {
		System.out.println("===Mostrando proyectos APROBADOS===");

		for (Proyecto proyecto : proyectos) {
			if(presupuestoAprobado(proyecto)) {
				System.out.println(proyecto.obtenerDatos());
			}
		}

		System.out.println("");
		System.out.println("===Mostrando inversión final===");

		System.out.println("Los proyectos aprobados requieren una inversión total de: $" + obtenerPresupuestoFinal());
		System.out.println("");
	}
	

	public double obtenerPresupuestoFinal () {
		double inversion = 0;
		for (Proyecto proyectoAp : proyectosAprobados) {
			inversion += Redondeo.DECIMAL.redondear(proyectoAp.calcularPresupuestoFinal());
		}
		return Redondeo.DECIMAL.redondear(inversion);
	}
	

}
