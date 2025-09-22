package ejercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaTarea {
	List<Tarea> tareas = new ArrayList<>();

	Scanner prompt = new Scanner(System.in);

	public ListaTarea() {
		this.agregarTarea();
	}

	public void agregarTarea() {
		int opcion = 0;
		do {
			try {

				System.out.println("Introduce la descripcion de la tarea:");
				String descripcion = prompt.nextLine();

				System.out.println("Introduce la prioridad de la tarea:");
				int prioridad = prompt.nextInt();

				this.tareas.add(new Tarea(descripcion, prioridad, false));

				System.out.println("Deseas añadir otra tarea? 1-Si  2-No");
				opcion = prompt.nextInt();
				prompt.nextLine();

			} catch (java.util.InputMismatchException e) {
				System.err.println("No se admiten datos NO numericos en ese campo");
				prompt.nextLine();
			}
		} while (opcion != 2);
	}

	public void eliminarTarea() {
		int opcion = 0;
		do {
			try {
				System.out.println("Elige por id la tarea de la que quieres cambiar el estado:");
				this.mostrarTareas();

				opcion = prompt.nextInt();

				this.tareas.remove(opcion - 1);

				System.out.println("Deseas eliminar otra tarea? 1-Si  2-No");
				opcion = prompt.nextInt();
				prompt.nextLine();
			} catch (java.util.InputMismatchException e) {

				System.err.println("No se admiten datos NO numericos en ese campo");
				prompt.nextLine();

			} catch (java.lang.IndexOutOfBoundsException e) {

				System.err.println("Tienes que poner un numero dentro del rango");

			}
		} while (opcion != 2);

	}

	public void mostrarTareas() {
		int cont = 1;
		for (Tarea tarea : this.tareas) {
			System.out.println("id: " + cont);
			System.out.println(tarea.toString());
			System.out.println("\n");
			cont++;
		}
	}

	public void tareasCompletadas() {
		System.out.println("tareas completadas");
		for (Tarea tarea : this.tareas) {
			if (tarea.isCompletada()) {
				System.out.println(tarea.toString());
			}
		}
	}

	public void cambiarEstadoTarea() {
		int opcion = 0;
		do {
			try {
				this.mostrarTareas();

				System.out.println("Elige por id la tarea de la que quieres cambiar el estado:");
				opcion = prompt.nextInt();
				Tarea tarea = this.tareas.get(opcion - 1);

				boolean bool = (tarea.isCompletada()) ? false : true;

				tarea.setCompletada(bool);

				System.out.println("Deseas modificar otra tarea? 1-Si  2-No");
				opcion = prompt.nextInt();
				prompt.nextLine();
			} catch (java.util.InputMismatchException e) {

				System.err.println("No se admiten datos NO numericos en ese campo");
				prompt.nextLine();

			} catch (java.lang.IndexOutOfBoundsException e) {

				System.err.println("Tienes que poner un numero dentro del rango");

			}
		} while (opcion != 2);
	}

	public void buscarTareas() {
		int opcion = 0;
		boolean encontrado=true;
		do {
			try {
				String descripcion = " ";
				int prioridad = 0;
				encontrado=true;

				System.out.println("Elige el tipo de busqueda: 1-Por descripcion.  2-Por prioridad.");
				opcion = prompt.nextInt();
				prompt.nextLine();

				if (opcion == 1) {

					System.out.println("Introduce la descripcion que tiene que tener la tarea");
					descripcion = prompt.nextLine();

				} else if(opcion==2) {
					System.out.println("Introduce la prioridad que tiene que tener la tarea");
					prioridad = prompt.nextInt();
				} 
				
				System.out.println("Tareas encontradas:\n");
				for (Tarea tarea : this.tareas) {

					if (opcion == 1 && tarea.getDescripcion().contains(descripcion)) {

						System.out.println(tarea.toString());

					} else if (tarea.getPrioridad() == prioridad) {

						System.out.println(tarea.toString());

					}else {
						encontrado=false;
					}
				}
			} catch (java.util.InputMismatchException e) {
				System.err.println("No se admiten datos NO numericos en ese campo");
				prompt.nextLine();
			}
			
			if(!encontrado) {
				System.out.println("No se han encontrado tareas con esa prioridad o descripcion");;
			}
		} while (opcion != 2);
	}

}
