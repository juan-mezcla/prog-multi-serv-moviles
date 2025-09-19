package defaultt;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List <Producto> inv=new ArrayList<>();
		for(int i=1; i<5; i++) {
			double precio=(i%2==1)?-800:800*i;
			int stock=(i%2==1)?-20:50*i;
			Producto prod=new Producto("prod"+i,precio,stock);
			boolean validado=validarProd(prod);
			
			if(validado) {
				inv.add(prod);
			}else {
				System.out.println("error al introducir "+prod.nombre);
			}
			
			
		}
		
		
		InventarioApp productos=new InventarioApp(inv);
		productos.mostrar();
		
	}
	
	public static boolean validarProd(Producto prod) {
		if(prod.precio<0) {
			return false;
		}
		
		if(prod.stock<0) {
			return false;
		}
		return true;
	}

	
	public void ingresarProdInv() {
		
		
		
	}
	

}

