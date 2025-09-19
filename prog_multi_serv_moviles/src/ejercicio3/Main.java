package ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ListaTarea tareas = new ListaTarea("ejemplo1");

		menu(tareas);

	}

	public static void menu(ListaTarea tareas) {
		Scanner prompt=new Scanner(System.in);
		int opcion = 0;
		do {
			//try {
				System.out.println("Elige una de las opciones para la lista de tareas:\n1-Agregar tarea. 2-Modificar tarea. 3-eliminar tarea.\n4-Mostrar tareas. 5-Mostrar tareas completadas. 6-Buscar tarea. 7-Salir.");
				opcion=prompt.nextInt();
				
				switch(opcion) {
				case 1:
					tareas.agregarTarea();
					break;
				case 2:
					tareas.cambiarEstadoTarea();
					break;
				case 3:
					//eliminar tarea
					tareas.eliminarTarea();
					break;
				case 4:
					tareas.mostrarTareas();
					break;
				case 5:
					tareas.tareasCompletadas();
					break;
				case 6:
					//Buscar tareas
					tareas.buscarTareas();
					break;
				case 7:
					System.out.println("Hasta luego.");
					break;
				}
			//}catch() {}
			
			
			
		} while (opcion != 7);
	}

}
