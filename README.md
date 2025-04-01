ENUNCIADO:

El Instituto de Realización Audiovisual está modificando el sector informático referido a la entrega de subsidios y/o créditos para la filmación de proyectos documentales.
Cada uno de los proyectos presentados tiene un identificador de proyecto (número entero), un presupuesto parcial y una lista de rubros. Cada rubro es un valor monetario (doble). 
La suma de los costos de todos los rubros del proyecto constituye lo que se conoce como plan económico. 
Un proyecto puede ser: 
* Ficción: De una ficción conocemos la empresa productora. A su vez, un proyecto de ficción se divide en:
* Película: Debe tener la duración en minutos. En este caso si la película tiene una duración superior a 120 minutos, se adiciona el 5% del presupuesto parcial al presupuesto total.  
* Serie: Tiene la cantidad de episodios. Cada episodio tiene un costo de rodaje equivalente al  2% del presupuesto. Este valor debe agregarse al presupuesto parcial.  
* Documental: Tiene el tipo de documental, que puede ser SOCIAL, CULTURAL, HISTÓRICO, CIENTÍFICO. Para cada caso se tendrá en cuenta el indicador porcentual de cada tipo de documental, mismo que se debe utilizar para el cálculo del presupuesto final. 
Para que el proyecto se apruebe, el presupuesto final debe coincidir con el costo del plan económico, o ser mayor. Si esto sucede, el proyecto recibe luz verde para comenzar. Si el presupuesto final es menor al plan económico, el proyecto no recibe subsidio y no se puede avanzar.   
Se pide:

1- Desarrollar los métodos necesarios para la gestión de los proyectos, tales como guardado, recorrido, copia, etc. 

2- Desarrollar el método presupuestoAprobado que devuelve un booleano para determinar si el proyecto en cuestión tiene luz verde para realizarse.

3- Implementar y modificar los métodos obtenerPresupuestoFinal para calcular los distintos montos dependiendo del tipo de proyecto

4- Implementar y modificar el método obtenerDatos que devuelve un String con toda la información de un proyecto determinado

5- Informar identificador de proyecto, presupuesto inicial, tipo de proyecto (para documentales el tipo y para ficción la productora) y presupuesto final únicamente de aquellos proyectos que han sido aprobados. 
6- Calcular e informar la inversión total que se requiere para llevar a cabo los proyectos aprobados. Esto es, la sumatoria de los presupuestos finales de cada proyecto. Este valor solo debe admitir dos decimales. Analizar enum Redondeo para este fin. 

7- Implementar el método eliminarProyecto para quitar un proyecto de la lista. El identificador para la búsqueda del proyecto será dado por el programa. Mostrar el proyecto antes de removerlo. Si el proyecto no existe en el listado, se debe comunicar. 
