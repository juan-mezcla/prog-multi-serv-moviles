package ejercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			
			menu();
	}
	
	
	public static void menu() {
		Scanner prompt=new Scanner(System.in);
		int opcion=0;
		do {
			try {
				
				System.out.println("Elige el tipo de conversión: 1-M a CM. 2-Kg a g 3-€ a $ 4- Salir");
				opcion=prompt.nextInt();
				
				
				switch(opcion) {
				case 1:
					System.out.println("Cantidad a cm: "+metros_a_cm(prompt)); 
					break;
					
				case 2:
					System.out.println("Cantidad a g: "+kg_a_g(prompt));
					
					break;
					
				case 3:
					System.out.println("Cantidad a dolares: "+euros_a_dolares(prompt));
					
					break;
					
				case 4:
					System.out.println("fin programa");
					break;	
				default:
					throw new ExcepcionOpcion("introduce un valor dentro del rango valido");
					
					
				}
			}catch(java.util.InputMismatchException e){
				System.err.println("Introduce datos numerico valido");
				prompt.nextLine();
			}catch(ExcepcionOpcion e) {
				System.err.println(e.msg);
			}
			
		}while(opcion!=4);
		
		
	}
	
	
	public static double metros_a_cm(Scanner prompt) {
		double dato;
		System.out.println("Introduce la cantidad a convertir:");
		dato=prompt.nextDouble();
		
		return dato*100;
		
	}
	
	public static double kg_a_g(Scanner prompt) {
		double dato;
		System.out.println("Introduce la cantidad a convertir:");
		dato=prompt.nextDouble();
		
		return dato*1000;
		
	}
	
	public static double euros_a_dolares(Scanner prompt) {
		double dato;
		System.out.println("Introduce la cantidad a convertir:");
		dato=prompt.nextDouble();
		
		return dato*1.08;
		
	}
	
	

}
