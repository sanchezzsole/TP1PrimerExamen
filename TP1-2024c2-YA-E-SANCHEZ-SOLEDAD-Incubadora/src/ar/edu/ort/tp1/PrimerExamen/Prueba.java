package ar.edu.ort.tp1.PrimerExamen;

import java.util.ArrayList;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InstitutoAudiovisual instituto = new InstitutoAudiovisual();
		
		ArrayList<Double> rubros = new ArrayList<>();
		
		rubros.add(generarNumeroAleatorio(5000, 7000));
		rubros.add(generarNumeroAleatorio(3500, 8500));
		rubros.add(generarNumeroAleatorio(25000, 40000));
		
		
		
		instituto.agregarProyecto(new ProyectoDocumental(110,31000.00, rubros, TipoDocumental.CIENTÍFICO));
		instituto.agregarProyecto(new ProyectoDocumental(112,3567899.67, rubros, TipoDocumental.HISTÓRICO));
		instituto.agregarProyecto(new ProyectoFiccionPelicula(117,32679.67, rubros, "FILMS S.A.",130));
		instituto.agregarProyecto(new ProyectoFiccionPelicula(120,23000.67, rubros, "NORTE Films",100));
		instituto.agregarProyecto(new ProyectoFiccionPelicula(122,3000000.00, rubros, "FILMS S.A.",126));
		instituto.agregarProyecto(new ProyectoFiccionSerie(125,4500000.80, rubros, "PanicTV",56));
		instituto.agregarProyecto(new ProyectoFiccionSerie(130,9000.70, rubros, "ShowTime",14));
		instituto.agregarProyecto(new ProyectoFiccionSerie(131, 4150000.70, rubros, "Clementz Group",30));
		instituto.agregarProyecto(new ProyectoFiccionSerie(135, 22020.00, rubros, "CandyLook",10));
		instituto.agregarProyecto(new ProyectoFiccionPelicula(136, 27080.00, rubros, "Movies YA",92));
		instituto.agregarProyecto(new ProyectoFiccionSerie(140, 11500.70, rubros, "GroupScreen",20));
		instituto.agregarProyecto(new ProyectoFiccionSerie(141, 2800000.00, rubros, "Leopardy",12));
		instituto.agregarProyecto(new ProyectoFiccionPelicula(142, 50070.00, rubros, "IndieHome",90));
		instituto.agregarProyecto(new ProyectoDocumental(144,25000.60, rubros, TipoDocumental.HISTÓRICO));
		instituto.mostrarProyectos();
		
		instituto.eliminarProyecto(170);
		instituto.eliminarProyecto(141);
		
		
		
	}
	
	public static double generarNumeroAleatorio(int min, int max) {
     
        return (double)(Math.random() * (max - min + 1)) + min;
    }

}
